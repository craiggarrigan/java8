public class LambdaExample {

	@FunctionalInterface
	private interface BinaryOperator<T> {
		T apply(T a, T b);
	}

	public static void main(String[] args){

		// Old way - using anonymous classes
		int sum = applyOperator(2, 3, new BinaryOperator<Integer>(){
			public Integer apply(Integer a, Integer b){
				return a + b;
			}
		});
		System.out.println("2 + 3 = " + sum);

		// New way - using lambdas
		int product = applyOperator(2, 3, (a, b) -> a * b);
		System.out.println("2 * 3 = " + product);
		
	}

	public static <U> U applyOperator(U a, U b, BinaryOperator<U> operator){
		return operator.apply(a, b);
	}

}