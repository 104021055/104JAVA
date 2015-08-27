import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入一數字");
		int n=scn.nextInt();
		System.out.print("幾進制");
		int b=scn.nextInt();
		if(1<b&&b<10){
			fun(n,b);
		}else{
			System.out.print("錯誤");
		}

	}
	public static void fun(int n,int b){
		String str="";
		while(n>=b){
			str=Integer.toString(n%b)+str;
			n=n/b;
		}
		System.out.println(n+str);
	}

}
