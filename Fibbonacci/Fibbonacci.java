
import java.util.ArrayList;

public class Fibbonacci{
	static int first = 1, second = 1; 
	static int count = 1;

	static int [] memory = new int [10];

	public static void printFib(int input){
		System.out.print(first + ", " + second + ", ");

		while (count <= input){
			int newValue = first + second; 
			System.out.print(newValue + ", ");
			
			first = second;
			second = newValue;
			count++;
		}
	}

	public static int printFib_rec(int input){

		if(input == 0 || input == 1){
			return 1;
		}
		else{
			return printFib_rec(input-1) + printFib_rec(input-2);
		}
	}	

	public static int Fib_memo(int input){

		if(memory[input] != 0){
			return memory[input];
		}

		if(input == 0 || input == 1){
			memory[input] = 1;
			return 1;
		}

		int val = Fib_memo(input-2) + Fib_memo(input-1);
		System.out.println("Memory " + val);
		memory[input] = val;
		return val; 
	}
	
}
