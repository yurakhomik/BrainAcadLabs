
public class MyTestClass {

	private static final String staticOuter = "STATIC OUTER";
	final private String instanceOuter = "INSTANCE OUTER";

	public String staticOuter() {
		return staticOuter;
	}

	public String instanceOuter() {
		return instanceOuter;
	}

	static class MyStaticNested {

		public void printOuter() {
			System.out.printf("\nAcces to Outer class fields from Static nested" 
		+ " class:%n%s%n", staticOuter);
		}

	}

	class MyInner {
		public void printOuter() {
			System.out.printf("\nAcces to Outer class fields from Inner  class:" 
		+ "%n%s%n%s%n", staticOuter,
					instanceOuter);
		}

	}

	public void printNested() {
		System.out.println("Nested classes members accessed from Outer  class" 
	+ " instance methos:\n");
		new MyStaticNested().printOuter();
		new MyInner().printOuter();

	}

	public String getAccessToLocalClassMembers() {
		class Local {
			private static final String staticLocal = "STATIC LOCAL";
			final private String instanceLocal = "INSTANCE LOCAL";

		}
		return String.format("%n%s%n%s%n", new Local().instanceLocal, Local.staticLocal);
	}

}
