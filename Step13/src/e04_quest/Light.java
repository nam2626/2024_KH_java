package e04_quest;

public class Light extends Power {
	@Override
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "Light 전원 On" : "Light 전원 Off");
	}

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Light 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("Light 전원 Off");
	}
}
