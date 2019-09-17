//Cesar Rodriguez

import java.util.Scanner;
public class Lab3_2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please input letter grades: ");
		char g1 = s.next().charAt(0);
		char g2 = s.next().charAt(0);
		char g3 = s.next().charAt(0);

		double total = 0;
		if (g1 == 'A')
			total += 4.0;
		else if (g1 == 'B')
			total += 3.0;
		else if (g1 == 'C')
			total += 2.0;
		else if (g1 == 'D')
			total += 1.0;
		else
			total += 0.0;

		if (g2 == 'A')
			total += 4.0;
		else if (g2 == 'B')
			total += 3.0;
		else if (g2 == 'C')
			total += 2.0;
		else if (g2 == 'D')
			total += 1.0;
		else
			total += 0.0;

		if (g3 == 'A')
			total += 4.0;
		else if (g3 == 'B')
			total += 3.0;
		else if (g3 == 'C')
			total += 2.0;
		else if (g3 == 'D')
			total += 1.0;
		else
			total += 0.0;

		System.out.println(total/3);
	}
}