package Java8;

import java.util.function.Predicate;

public class PredicateNegate {

	public static void main(String[] args) {
		predicate_negate();

	}

	public static void predicate_negate() {

		String lengthGTThan10 = "Thunderstruck is a 2012 children's " + "film starring Kevin Durant";

		boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
		System.out.println(outcome);
	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

}
