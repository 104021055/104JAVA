import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入國文,英文,數學成績");
float c=scn.nextFloat();
float e=scn.nextFloat();
float m=scn.nextFloat();
float A1=c+e+m;
float A2=A1/3;
System.out.print("總成績為"+A1+"平均成績為"+A2);
	}

}
