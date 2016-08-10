package practice.lcm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import practice.hcf.Hcf;

public class LcmUsingHcf {

  public static int lcm(int p, int q) {
    //using the property L.C.M * H.C.F = p * q
    //so L.C.M = p * q / H.C.F
    return p * q / Hcf.hcf(p,q);
  }

  public static void main(String[] args) {
    //start : get user input
		System.out.print("Enter space separated numbers to find Least Common Multiple \n");
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		reader.close();

    String[] values = line.split(" ");
		List<Integer> numbers = new ArrayList<Integer>();
		for(String i: values) {
			if(!i.isEmpty() && i != null) {
				int n = Integer.valueOf(i);
				numbers.add(n);
			}
		}
		if(numbers.size() < 2 ) {
			numbers.add(30);
			numbers.add(69);
		}
		//end: user input

		//start: compute lcm
    int lcm = numbers.get(0);
		for(int  i = 1; i<numbers.size(); i++) {
			lcm = lcm(lcm, numbers.get(i));
		}

    System.out.println(lcm);

  }
}
