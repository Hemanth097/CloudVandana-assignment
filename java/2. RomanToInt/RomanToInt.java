//2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.Scanner;
import java.util.HashMap;

public class RomanToInt{

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the Roman Number : ");
		String roman = inp.nextLine().toUpperCase();

		int numerals = convertor(roman);
		if (numerals == -2) {
			System.out.print(roman + " is Incorrect Roman Number");
		}else{
			System.out.print("The numeral is " + numerals);
		}

	}

	public static int convertor(String roman){
		HashMap<Character, Integer> romans = new HashMap<>();
		romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int result = 0;
        int checker = 0;
        //getOrDefault(roman.charAt(roman.length() - 1), -1);
        result = romans.getOrDefault(roman.charAt(roman.length() - 1), -2);
        if(result == -2){
        	return -2;
        }

        if(roman.length() == 1){
        	return result;
        }

		for (int i = roman.length() - 2; i >= 0 ; i-- ) {
			if(romans.getOrDefault(roman.charAt(i), -2) == -2){
				return -2;
			}
			if(romans.get(roman.charAt(i)) < romans.get(roman.charAt(i+1))){

				result -= romans.get(roman.charAt(i));
				checker = -1;
			}else if(romans.get(roman.charAt(i)) == romans.get(roman.charAt(i+1))){
				if(checker == -1){
					result -= romans.get(roman.charAt(i));
				}else{

					result += romans.get(roman.charAt(i));
				}


			}else{

				result += romans.get(roman.charAt(i));
				checker = 1;
			}
		}

		return result;
       


	}

}