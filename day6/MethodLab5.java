package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		for (int i = 0; i < 10; i++)
			System.out.print(r1[i] + " ");
		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print(r2[i] + " ");
		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print(r3[i] + " ");
		System.out.println();
		
	}

	/*
	 * public static int getRandom(int n) 1 부터 n 까지 범위의 난수 리턴 public static int
	 * getRandom(int n1, int n2) n1 부터 n2 범위의 난수 리턴
	 */

	public static int[] powerArray(int nums) {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = (i + 1) * nums;
		return arr;

	}

}
