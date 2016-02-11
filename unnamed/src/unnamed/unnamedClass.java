package unnamed;

import java.util.Scanner;

public class unnamedClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] yourArray = new int[10];
		System.out.println("input your number");
		for (int i=0;i<yourArray.length; i++){
			yourArray[i]=in.nextInt();
			int yourNumber = yourArray[i];
			if(yourNumber < 0)
				System.out.println("fe");
			
		}
			
	}

}
