package lt.lhu.unit04.main;

public class Task040222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double y;
		
		a = 74;
		b = 91;
		h = 1;
		
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <=b; x = x + h) {
			
				y = Math.pow(Math.sin(x), 2.0);
		
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			
		}

	}

}
