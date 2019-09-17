//Cesar Rodriguez

import java.util.Scanner;

public class Lab3_5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please input four integers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		if (((a == b) && (c == d)) || ((a == d) && (b == c))){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
			}
	}
}