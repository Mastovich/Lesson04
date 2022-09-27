package lt.lhu.unit04.main;

public class Task040208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double h;
		double y;
		
		a = 12;
		b = 24;
		c = 7.3;
		h = 0.5;
		
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <=b; x = x + h) {
			if (x == 15) {
		
				y = (x + c) * 2;
		
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}else {
		
				y = (x - c) + 6;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}	
		}

	}

}
