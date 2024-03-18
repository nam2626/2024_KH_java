package e04_quest;

public class TV extends Power {

	@Override
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "TV 전원 On" : "TV 전원 Off");
	}

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("TV 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("TV 전원 Off");
	}
	
}
