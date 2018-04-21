package Programming;

/*Input  : a[] = {0, 5, 5, 5, 4}
x = 5
Output : 3

Input  : a[] = {1, 2, 3}
x = 4
Output : 0
Time Complexity : O(n)
Auxiliary Space : O(1)*/

public class FrequencyOfUnsortedArray {

	public static void main(String[] args) {
		int a[] = { 0, 5, 5, 5, 4 };
		int x = 5;
		int n = a.length;

		System.out.println(frequency(a, n, x));

	}

	static int frequency(int a[], int n, int x) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] == x)
				count++;
		return count;
	}

}