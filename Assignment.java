import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Value: "+a);
		int var;
		
		var=a;
		System.out.println("var using =: "+var);
		
		var+=a;
		System.out.println("var using +=: "+var);
		
		var*=a;
		System.out.println("var using *=: "+var);
		
		
	}
}