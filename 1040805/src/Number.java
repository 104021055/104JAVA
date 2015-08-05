import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入你的身高(cm)體重(kg)");
double h=scn.nextDouble();
double f=scn.nextDouble();
double H=h/0.454;
double F=f/2.54;
System.out.println("你的身高是"+H+"(吋)體重是"+F+"(磅)");
	}

}
