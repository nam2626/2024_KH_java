package e04_quest;

public class Aircon extends Power {

	@Override
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "Aircon 전원 On" : "Aircon 전원 Off");
	}

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Aircon 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("Aircon 전원 Off");
	}
}
