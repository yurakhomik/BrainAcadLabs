
public class Main {

	public static void main(String[] args) {

		MyTestClass testClass = new MyTestClass();
		MyTestClass.MyStaticNested staticNested = new 
				                                  MyTestClass.MyStaticNested();
		MyTestClass.MyInner innerNested = testClass.new MyInner();

		testClass.printNested();
		System.out.println(testClass.getAccessToLocalClassMembers());
		innerNested.printOuter();
		staticNested.printOuter();

	}

}
