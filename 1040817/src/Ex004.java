import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J��Ʀr");
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
		if(x/y<=0){
			System.out.print(x%y);
		}else{
			x=x%y;
		}
		return gcd(y, x);
	}

}
