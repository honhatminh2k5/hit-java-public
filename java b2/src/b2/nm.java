package b2;

import java.util.Scanner;

public class nm {
	public static void main(String[] args) {
		/* bat ki 1 cai gi cong voi 1 chuoi, thi no se la 1 chuoi
		 * +, Cac kieu du lieu doi tuong
		 * Interger aa=null;
		 * long bb;
		 * string s
		 * cac doi tuong ben trong java deu tham chieu den 1 o nho
		 *ep kieu du lieu 
		 * khong nen ep tu kieu du lieu lon hon ve nho hon. vd: long ->int
		 */
	//int a=3;
	//int b=2;
	//Scanner scanner = new Scanner(System.in);
	//int a = scanner.nextInt();
	//int b = scanner.nextInt();		
	//System.out.println((double)a/b);
	//double c = scanner.nextDouble();
	// scanner.next() Nhap cho string, nhung ko xuong dong
	// scanner.nextline() nhap cho string, co xuong dong
	//System.out.print(6%4);
	/*int a=3;// kiem tra so co la so chan khong
	if(a%2==0) {
		System.out.println("true");	
	}	
	else {
		System.out.println("false");
	}*/
	// bieu thuc logic : a=(bieuthuc dk)?caulenh1:caulenh2;
	//++k:tuc la se cong bien k len 1 sau do thuc hien phep tinh
	//k++:thuc hien phep tinh sau do +1
	/*int a[]=new int [10];
	for(int i=0;i<5;i++) {
		a[i]=scanner.nextInt();
	}
	for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
	}*/
	/*Scanner scanner = new Scanner(System.in);
	System.out.println("n=");
	int n = scanner.nextInt();
	int a[]=new int [n];
	for(int i=0;i<n;i++) {
		a[i]=scanner.nextInt();
		}
	int max=a[0];
	for(int i=0;i<n;i++) {
		if(a[i]>max)
			a[i]=max;
		}
	System.out.println(max);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n = scanner.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
					}}
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
					}
		}
		System.out.println(max-min);
	}
}
