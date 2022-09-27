package lt.lhu.unit04.main;

public class Task040207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double y;
		
		a = 1;
		b = 4;
		h = 0.5;
		
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <=b; x = x + h) {
			if (x > 2) {
		
				y = x;
		
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}else {
		
				y = -x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}	
		}
	}

}
