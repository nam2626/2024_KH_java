package e03_file_io;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class LottoQuest {
	public static ArrayList<TreeSet<Integer>> createLotto(int set){
		ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
		Random r = new Random();
		
		while(list.size() < set) {
			TreeSet<Integer> s = new TreeSet<Integer>();
			while(s.size() < 6)
				s.add(r.nextInt(45)+1);
			list.add(s);
		}
		
		return list;
	}
	public static void main(String[] args) {
		System.out.println(createLotto(5));
	}

}




