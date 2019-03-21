import java.util.Scanner;

public class Midterm{
	static int reverse(int n){
		int rn = 0;

		while(n>0){
			rn = rn*10 +n%10;
			n = n/10;
		}

		return rn;
	}
	static boolean is_pal(int n){
		System.out.println(reverse(n));
		return n==reverse(n);
	}
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(0x7FFFFFFF);

		if(is_pal(n))
			System.out.println("is a palindrome");
		else
			System.out.println("is not a palindrome");

		sc.close();
	}
}