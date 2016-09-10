package _3_6_reflections.labs._3_6_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public final class ClassMembersObserver {
	
	public static void main(String[] args) {
		demo();
	}
	
	public static void demo() {
		Class<?> targetClass = ReflectedClass.class;
		printModifiers(targetClass);
		printFileds(targetClass);
		printConstructors(targetClass);
		printMethods(targetClass);
	}	
	
	private static void printModifiers(Class targetClass) {
		System.out.printf("Class modifiers:%n%s",
				          modifiersList(ReflectedClass.class, "\t%s%n",
	    		                        ClassMembersCategory.CLASS, 
	    		                        targetClass.getSimpleName()));
	}
	
	private static void printFileds(Class targetClass) {
		System.out.println("\nFields:");
		Field[] fields = targetClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.printf("\t%s%s %s%n", 
					      modifiersList(ReflectedClass.class, "%s ",
					    		        ClassMembersCategory.FIELD, 
					    		        field.getName()), 
					      field.getType(), 
					      field.getName());
		}
	}
	
	private static void printFiledsInfo()  throws Exception {
		ReflectedClass obj = new ReflectedClass(3, 5, 7);
		Class<?>[] paramTypes;		
	}
	
	private static void printConstructors(Class targetClass) {
		System.out.println("\nConstructors:");
		Constructor[] constructors = targetClass.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			String parameterTypes = "";
			for(Class parameter : constructor.getParameterTypes())
				parameterTypes += parameter.getSimpleName() + " ";
			System.out.printf("\t%s%s: %s%n", 
					      modifiersList(ReflectedClass.class, "%s ",
					    		        ClassMembersCategory.CONSTRUCTOR, 
					    		        constructor.getName() + parameterTypes), 
					      targetClass.getSimpleName(), 
					      parameterTypes);
		}
	}
	
	private static void printMethods(Class targetClass) {
		List<String> accesories = new ArrayList<>();
		List<String> instanceMethods = new ArrayList<>();
		System.out.println("\nMethods:");
		Method[] methods = targetClass.getDeclaredMethods();
		for(Method method : methods) {
			
			String methodInfo = String.format("\t%s%s %s%n", 
					      modifiersList(ReflectedClass.class, "%s ",
					    		        ClassMembersCategory.METHOD, 
					    		        method.getName()), 
					      method.getReturnType().getSimpleName(), 
					      method.getName());
			System.out.printf("\t%s%s %s%n", 
					      modifiersList(ReflectedClass.class, "%s ",
					    		        ClassMembersCategory.METHOD, 
					    		        method.getName()), 
					      method.getReturnType().getSimpleName(), 
					      method.getName());
					      
			if (method.getName().startsWith("get") || method.getName().startsWith("set"))
				accesories.add(methodInfo);
			else
				instanceMethods.add(methodInfo);
		}
			printValues(accesories, "Accesories methods");
			printValues(instanceMethods, "Instance methods");
			
		
	}
	
	private static void printValues (List<String> value, String title) {
		System.out.println(String.format("\n%s:", title));
		for (String values : value)
			System.out.print(values);
	}
	
	private static String modifiersList(Class targetClass, String format,
			                            ClassMembersCategory category,
			                            String name) {
		String[] modifiersNames = {
				"abstract", "final", "interface", "native",
				"private", "protected", "public", "static",
				"strict", "synchronized", "transient", "volatile"
		};
		String modifiersList = "";
		if(category == ClassMembersCategory.CLASS) {
			int fieldModifiers = targetClass.getModifiers();
					for(String modifier : modifiersNames) {
						if ((fieldModifiers & modifierFromString(modifier)) == 
							 modifierFromString(modifier)) {
							if(Modifier.toString(modifierFromString(modifier)) 
							   != ""){
								modifiersList += String.format(
							                            format, 
							                            Modifier.toString(
									             modifierFromString(modifier)));
							}
						}
			}
		} else if(category == ClassMembersCategory.FIELD) {
			Field[] fields = targetClass.getDeclaredFields();
			for(Field field : fields) {
				if(field.getName().equals(name)) {
					int fieldModifiers = field.getModifiers();
					for(String modifier : modifiersNames) {
						if ((fieldModifiers & modifierFromString(modifier)) == 
							 modifierFromString(modifier)) {
							if(Modifier.toString(modifierFromString(modifier)) 
							   != ""){
								modifiersList += String.format(
							                            format, 
							                            Modifier.toString(
									             modifierFromString(modifier)));
							}
						}
					}
				}
			}
		} else if(category == ClassMembersCategory.METHOD) {
			Method[] methods = targetClass.getDeclaredMethods();
			for(Method method : methods) {
				if(method.getName().equals(name)) {
					int fieldModifiers = method.getModifiers();
					for(String modifier : modifiersNames) {
						if ((fieldModifiers & modifierFromString(modifier)) == 
							 modifierFromString(modifier)) {
							if(Modifier.toString(modifierFromString(modifier)) 
							   != ""){
								modifiersList += String.format(
							                            format, 
							                            Modifier.toString(
									             modifierFromString(modifier)));
							}
						}
					}
				}
			}
		} else if(category == ClassMembersCategory.CONSTRUCTOR) {
			Constructor[] constructors = targetClass.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				String parameterTypes = "";
				for(Class parameter : constructor.getParameterTypes())
					parameterTypes += parameter.getSimpleName() + " ";
				if((constructor.getName() + parameterTypes).equals(name)) {
				int fieldModifiers = constructor.getModifiers();
					for(String modifier : modifiersNames) {
						if ((fieldModifiers & modifierFromString(modifier)) == 
							 modifierFromString(modifier)) {
							if(Modifier.toString(modifierFromString(modifier))
							   != ""){
								modifiersList += String.format(
							                            format, 
							                            Modifier.toString(
									             modifierFromString(modifier)));
							}
					    }
				  }
			}}
		}
		return modifiersList;
	}
	
	private static int modifierFromString(String s) {
		int m = 0x0;
		if ("public".equals(s))           m |= Modifier.PUBLIC;
		else if ("protected".equals(s))   m |= Modifier.PROTECTED;
		else if ("private".equals(s))     m |= Modifier.PRIVATE;
		else if ("static".equals(s))      m |= Modifier.STATIC;
		else if ("final".equals(s))       m |= Modifier.FINAL;
		else if ("transient".equals(s))   m |= Modifier.TRANSIENT;
		else if ("volatile".equals(s))    m |= Modifier.VOLATILE;
		return m;
	}
	
	private enum ClassMembersCategory {
		CLASS, FIELD, CONSTRUCTOR, METHOD
	}
}