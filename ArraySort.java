import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int test[] = { 2, 9, 8, 5, 77, 3, 4 };
		for (int t = 0; t < test.length; t++) {
			int smallest = test[t];
			for (int n = t + 1; t < test.length; n++) {
				if (test.length == n) {
					break;
				}
				else if(test[n] < smallest) {
					smallest = test[n];
					test[n] = test[t];
					test[t] = smallest;
				}
			}
		}
		System.out.println(Arrays.toString(test));

	}

}
