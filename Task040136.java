package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task040136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x;
		System.out.println("x =");
				
		x = sc.nextInt();
		
		double fx;
		
		if(x <= 3) {			
			fx = Math.pow(x, 2)-3 *x + 9;
			System.out.println("fx = " + fx);
		}else {
			fx = 1 / (Math.pow(x, 3) + 6);
			System.out.println("fx = " + fx);
		}	
	}
}
