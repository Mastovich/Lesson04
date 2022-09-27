package lt.lhu.unit04.main;

public class Task040215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int sum;
		
		a = 1;
		b = 10;
		
		sum = 1;
		
		while(a <= b) {
			sum = (int)(sum + Math.pow(2, a));
			a++;
		}
		
		System.out.println("sum = " + sum);
	}

}
