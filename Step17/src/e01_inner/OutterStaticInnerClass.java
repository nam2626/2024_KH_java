package e01_inner;

public class OutterStaticInnerClass {
	private int outter;
	private static double n = 3.14345;
	public OutterStaticInnerClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass{
		private int inner;

		public InnerStaticClass(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
//			return outter + inner; //outter가 None static 이기 때문에 접근이 불가능
			return (int)(inner + n);
		}
	}
}



