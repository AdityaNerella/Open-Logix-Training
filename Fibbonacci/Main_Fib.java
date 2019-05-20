import java.util.Scanner;

public class Main_Fib{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number of sequences you want: ");

		int input = scan.nextInt();

		System.out.println(Fibbonacci.Fib_memo(input));
	}
}