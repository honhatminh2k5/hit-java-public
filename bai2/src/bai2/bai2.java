package bai2;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for(int i=1; i<n-1;i+=2) {
			if(i % 2 != 0) {
				int temp = a[i + 1] - a[i - 1];
				a[i]+=temp;
			}
		}
		if ((n - 1) % 2 != 0) {
			a[n - 1] += a[n - 2];
		}
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
	}
