import java.util.Scanner;

public class PangramChecker{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the String ");
		//String text = "abcdefghijklmnopqrstuvwxyz";
		String text = inp.nextLine();

		if(pangramChecker(text.toLowerCase())){
			System.out.print("the string is a pangram");
		}else{
			System.out.print("the string is not a pangram");
		}

	}


	public static boolean pangramChecker(String text){
		boolean[] present = new boolean[26];

		for (int i = 0; i < text.length() ;i++ ) {
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
				present[text.charAt(i) - 'a'] = true;
			}
		}

		for(boolean test : present){
			if(test == false){
				return false;
				
			}
		}

		return true;
	}
}