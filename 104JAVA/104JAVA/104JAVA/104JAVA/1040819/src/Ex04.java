import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一數字");
		int i=scn.nextInt();
		fun(i);
 
	}
	public static void fun(int i){
		int n=0;
		while(i>=1){
			i=i/10;
			n++;
		}
		System.out.println(n);
	}

}
