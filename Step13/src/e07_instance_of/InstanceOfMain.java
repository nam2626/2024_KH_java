package e07_instance_of;

public class InstanceOfMain {

	public static void main(String[] args) {
		K2 k2 = new K2();
		Gun gun = k2; //작은 개념이 큰개념이 되는 경우, 자동으로 형변환
		gun.shot();
//		AK47 ak47 = (AK47)gun;//큰 개념이 작은 개념, 강제로 형변환
//		gun.shot();
		
		System.out.println(gun instanceof K2);
		System.out.println(gun instanceof AK47);
		System.out.println(gun instanceof Gun);
		System.out.println(k2 instanceof Gun);
	}

}






