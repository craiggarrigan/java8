public class DefaultInterfaceExample {
	
	private interface Collection {

		int size();

		default boolean isEmpty(){
			return size() == 0;
		}

	}

	private static class FixedSizeCollection implements Collection {

		private final int size;

		public FixedSizeCollection(int size){
			this.size = size;
		}

		public int size(){
			return size;
		}

	}

	public static void main(String[] args) {

		Collection empty = new FixedSizeCollection(0);
		describeCollection(empty);

		Collection nonempty = new FixedSizeCollection(5);
		describeCollection(nonempty);

	}

	public static void describeCollection(Collection collection) {
		System.out.println("Collection has size = " + collection.size() + ", isEmpty = " + collection.isEmpty());
	}

}