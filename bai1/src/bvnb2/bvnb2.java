package bvnb2;

import java.util.Scanner;

public class bvnb2 {

	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("r= ");
		double r = scanner.nextDouble();
		double pi = 3.14;
		double chuvi = 2*pi*r;
		double dientich = r*r*pi;
		System.out.print(chuvi+" "+dientich);	
	}
}
