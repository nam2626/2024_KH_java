package e04_lamda;

public class LamdaEx2 {
	public static void calc(int x, int y, Calcurator cal) {
		System.out.println(cal.calc(x, y));
	}
	public static void main(String[] args) {
		calc(10, 5, new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		});
		
		calc(10,5,(x, y) -> x + y);  
		
		
	}

}






