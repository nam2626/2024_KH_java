package e01_string_ex;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin aliquet porttitor lacus, non pharetra justo tempus faucibus. Mauris at quam quis erat faucibus euismod. Sed convallis vel nisl at gravida. Nullam non faucibus arcu. Quisque maximus dolor augue, a ullamcorper lacus tempus at. Fusce cursus sodales est, a sodales tortor. Sed mollis velit lectus, nec vehicula elit sollicitudin in. Quisque quis posuere eros. Nam ligula velit, porttitor eu arcu posuere, efficitur interdum elit. Aliquam risus turpis, mattis sed urna sollicitudin, tincidunt egestas urna. Morbi tincidunt pretium libero, sed imperdiet ex dapibus in.";
		Scanner sc = new Scanner(System.in);
		//문자열 하나를 입력 받아서
		System.out.print("문자열 입력 : ");
		String search = sc.nextLine();
		//입력 받은 문자열이 str에 몇개가 있는지 개수를 세어서 출력
		int count = 0;
		int idx = 0;
		
		while((idx = str.indexOf(search,idx)) != -1) {
			idx++;
			count++;
		}
		System.out.println("해당 단어의 개수 : " + count);
	}

}







