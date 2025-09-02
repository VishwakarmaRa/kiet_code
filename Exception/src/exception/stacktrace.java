package exception;

public class stacktrace {

	public static void main(String[] args) {
		level1();
	}

	public static void level3() {
		int arr[] = new int[5];
		arr[7] = 10;
	}

	public static void level2() {
		level3();
	}

	public static void level1() {
		level2();
	}

}
