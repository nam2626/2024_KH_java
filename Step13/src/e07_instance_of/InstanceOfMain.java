package e07_instance_of;

public class InstanceOfMain {
	public static void optionActive(Gun gun) {
		if(gun instanceof K2) {
			K2 k2 = (K2) gun;
			k2.addParts();
		}else if(gun instanceof AK47) {
			AK47 ak47 = (AK47) gun;
			ak47.fireAll();
		}
	}
	public static void main(String[] args) {
		K2 k2 = new K2();
		Gun gun = k2; //작은 개념이 큰개념이 되는 경우, 자동으로 형변환
		gun.shot();
//		AK47 ak47 = (AK47)gun;//큰 개념이 작은 개념, 강제로 형변환
//		gun.shot();
		
		//A instanceof B ---> 객체 A가 B클래스 타입으로 형변환이 되냐?
		System.out.println(gun instanceof K2);
		System.out.println(gun instanceof AK47);
		System.out.println(gun instanceof Gun);
		System.out.println(k2 instanceof Gun);
		
		optionActive(gun);
		optionActive(new AK47());
		optionActive(k2);
		optionActive(new Gun());
		
		//클래스 이름 뽑기
		System.out.println(gun.getClass().getName());//패키지 + 클래스명
		System.out.println(gun.getClass().getSimpleName());//클래스명
		System.out.println(AK47.class.getName());
	}

}






