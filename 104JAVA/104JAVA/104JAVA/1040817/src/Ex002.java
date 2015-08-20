import java.util.Scanner;
import java.util.Random;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int i = rnd.nextInt(1001);
		fun1(i);
	}

	public static void fun1(int i) {
		int v1=(i-i%1000)/1000;
		System.out.print(v1+"千");
		i=i%1000;
		int v2=(i-i%100)/100;
		System.out.print(v2+"百");
		i=i%100;
		int v3=(i-i%10)/10;
		System.out.print(v3+"十");
		i=i%10;
		int v4=i-i%1;
		System.out.print(v4+"元");
	}

}
