import java.util.*;
public class Lotto {
	
	/*
	 * Lotto tips
	 * calculates over the time in millsec a checksum and with it the amount of tips
	 * Dominik Bregovic
	 * Last change 13.03 2021
	 * 
	 */

	public static void main(String[] args) {

		Date date = new Date();
		Random randomNum = new Random();
		
		String time = Long.toString(date.getTime());
		List list = new ArrayList();
		char [] numbers = time.toCharArray();
		long sumOfDigits = 0;
		
		//printing time in millisec, printing every single numb extra,
		//determine checksum, 
		
		System.out.println("Current time in ms: "+time);
		System.out.print("Singel digits of current time: [");
		for (int i = 0; i < numbers.length; i++) {
			
		} 
		
		for (int i = 0; i < numbers.length; i++) {
			if (i==0) {
				System.out.print(numbers[i]);
			}else {
				System.out.print(","+numbers[i]);
			} 
			String convert = Character.toString(numbers[i]);
			sumOfDigits += Long.parseLong(convert);
		}
		
		System.out.println("]");
		System.out.println("Sum of all digits: "+sumOfDigits+"\n");
		
		// generating numbers for tipps and sorting them.
		
		for (int j = 1; j <= sumOfDigits; j++) {
			
			System.out.print("Tipp "+j+":");
			for (int i = 1; i <= 6; i++) {
				Integer r = randomNum.nextInt(45)+1;
				list.add(r);
				
			}
			Collections.sort(list);
			System.out.println(list);
			list.clear();
		}
		
		// I would be glad if you could give me some feedback about the warnings at 
		// Arraylist list. Is it because of the fact that they could throw an exception?
			
			
		
		
	}

}
