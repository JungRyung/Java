import java.util.Scanner;

public class Midterm_01{
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
	static boolean is_pal(String s){
		for(int i=0, j=s.length()-1; i<j; ++i, --j){
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// s.replaceAll(" ", "");
		s = s.trim();
		String slist[] = s.split(" ");

		s = "";
		for(int i=0; i<slist.length; ++i){
			System.out.println("(" + slist[i] + ")");
			if(slist[i].compareTo("")!=0)
				s = s + slist[i];
		}

		System.out.println("(" + s + ")");

		if(is_pal(s))
			System.out.println("is a palindrome");
		else
			System.out.println("is not a palindrome");

		sc.close();
	}
}