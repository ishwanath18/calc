
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int x,y;
			System.out.println("Enter the value of x and y : ");
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println("The addition is "+(x+y));
			
		}
	}

}
