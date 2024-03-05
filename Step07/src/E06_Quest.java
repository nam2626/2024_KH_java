
public class E06_Quest {
	/*
	 * 삼각함수 표 출력
	 * 각도		사인		코사인	탄젠트
	 * 1		0.000	0.000	0.000
	 */
	public static void main(String[] args) {
		for(int i=1;i<91;i++) {
			double radian = Math.toRadians(i);
			if(i < 90)
			System.out.printf("%4d %10.4f %10.4f %10.4f\n",
					i,Math.sin(radian), Math.cos(radian), Math.tan(radian));
			else
				System.out.printf("%4d %10.4f %10.4f %10s\n",
						i,Math.sin(radian), Math.cos(radian),"∞");
		}
	}

}
