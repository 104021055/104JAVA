import java.util.Scanner;
public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("¿é¤J¤@¼Æ¦r");
float i=scn.nextFloat();
fun(i);
	}
	public static void fun(float i){
		int a=0;
		while(i>=1){
			i=i/10;
			a++;
		}
		System.out.println(a);
	}

}
