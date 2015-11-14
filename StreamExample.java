import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {

	public static void main(String[] args){

		// Stream source
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Used to print resulting stream
		Consumer<Object> print = System.out::println;

		System.out.println("All numbers");
		numbers.stream().forEach(print);

		// Predicates can filter streams
		Predicate<Integer> isEven = (x) -> x % 2 == 0;
		Predicate<Integer> isOdd = isEven.negate();

		System.out.println("Even numbers");
		numbers.stream().filter(isEven).forEach(print);

		System.out.println("Odd numbers");
		numbers.stream().filter(isOdd).forEach(print);

		// Maps can transform streams
		Function<Integer, Integer> timesTwo = (number) -> 2 * number;
		Function<Integer, String> repeat = (number) -> number.toString() + number.toString();
		
		System.out.println("Doubled numbers");
		numbers.stream().map(timesTwo).forEach(print);

		System.out.println("Numbers repeated");
		numbers.stream().map(repeat).forEach(print);

	}

}