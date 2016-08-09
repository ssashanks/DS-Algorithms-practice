package practice.hcf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hcf {
	
	private static int hcf(int p, int q) {
		if(q == 0) {
			return p;
		}
		int remainder = p%q;
		return hcf(q ,remainder);
	}
	
	public static void main(String args[]) throws Exception{
		//start : get user input
		System.out.print("Enter space separated numbers to find Highest common factor \n");
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
		//start: compute hcf
		int hcf = numbers.get(0);
		for(int  i = 1; i<numbers.size(); i++) {
			hcf = hcf(hcf, numbers.get(i));
		}
		//end: compute hcf
		System.out.println(hcf);
	}
}
