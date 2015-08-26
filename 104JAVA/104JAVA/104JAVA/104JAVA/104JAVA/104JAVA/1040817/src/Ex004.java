import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入兩數字");
		int x=scn.nextInt();
		int y=scn.nextInt();
		if(x<y){
			int a=x;
			x=y;
			y=a;
		}
		gcd(x,y);
	}
	public static int gcd(int x,int y){
		if(y==0){
			return x;
		}else{
			return gcd(y,x%y);
		}
	}

}
