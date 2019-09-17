//Cesar Rodriguez

import java.util.Scanner;

public class Lab3_3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please input three numbers: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if (x > y && x > z){
			System.out.println("Max: " +x);
		}
		else if (y > x && y > z){
			System.out.println("Max: " +y);
		}
		else{
			System.out.println("Max: " +z);
		}

		if ( x < y && x < z){
			System.out.println("Min: " +x);
		}
		else if (y < x && y < z){
			System.out.println("Min: " +y);
		}
		else{
			System.out.println("Min: " +z);
		}
	}
}