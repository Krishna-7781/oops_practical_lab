import java.util.Scanner;

public class IncrementDecrement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a=sc.nextInt();
	System.out.println("Value 1: "+a);
	int b=sc.nextInt();
	System.out.println("Value 1: "+b);
	
	int result1, result2;
	result1=a++;
	System.out.println("After increment: "+result1);
	result2=b--;
	System.out.println("After decrement: "+result2);
	
}
}