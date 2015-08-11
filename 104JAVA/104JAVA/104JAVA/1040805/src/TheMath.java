import java.util.Scanner;
public class TheMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入梯形的上底,下底與高");
float a=scn.nextFloat();
float b=scn.nextFloat();
float high=scn.nextFloat();
float Answer=a*high/2+b*high/2;
System.out.println("答案為"+Answer);
	}

}
