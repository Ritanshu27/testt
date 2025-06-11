package test;
import java.util.*;
public class Controlflow15 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b =1;
		for(int i=a;i>=1;i--) {
			b=b*a;
			a--;
		}
		System.out.print(b);
	}
}
