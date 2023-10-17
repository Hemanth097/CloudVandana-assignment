//Array shuffler 
import java.util.Random;
import java.util.Scanner;

public class ShuffleIt{
	public static void main(String[] args) {
	
		Scanner inp = new Scanner(System.in);

		System.out.print("enter the array size : ");
		int size = inp.nextInt();

		int[] unshuffledArray = new int[size];
		for(int i = 0; i < size; i++){
			System.out.print("Enter the element " + i + " : ");
			unshuffledArray[i] = inp.nextInt();
		}

		//comment out the above code for hardcoding
		//int[] unshuffledArray = {1,2,3,4,5,6,7};


		int[] shuffledArray = shuffle(unshuffledArray);

		System.out.print("\nShuffled array is " );	
		for (int num : shuffledArray) {
			System.out.print(num + " ");
		}
		
	}


	public static int[] shuffle(int[] array){

		Random ran = new Random();
		int temp, j;
		for (int i = 0; i < array.length; i++) {
			j = ran.nextInt(array.length - 1);

			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}

		return array;
	}

}