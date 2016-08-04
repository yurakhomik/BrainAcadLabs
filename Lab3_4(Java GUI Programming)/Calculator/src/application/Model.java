package application;

public class Model {


	@FunctionalInterface interface Operation {
		Integer execute(Integer value1, Integer value2);

	}

	public static class Calculator<Integer> {
		public Operation add = (value1, value2) -> value1 + value2;
		public Operation substractions = (value1, value2) -> value1 - value2;
		public Operation multiplisity = (value1, value2) -> value1 * value2;
		public Operation devisions = (value1, value2) -> value1 / value2;
	}

}
