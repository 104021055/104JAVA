import java.util.Scanner;
import java.util.Random;
public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int i=0;
		i=rnd.nextInt(1000);
		while(i>0){
			System.out.print(fun(i));
			i--;
		}
			}
			public static int fun(int i){
				int v1=i%10;
				i=i/10;
				return i;
	}

}
