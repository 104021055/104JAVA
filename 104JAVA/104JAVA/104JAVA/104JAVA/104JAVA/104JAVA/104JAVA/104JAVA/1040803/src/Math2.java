import java.util.Scanner;
public class Math2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入三角形的底和高");
float a=scn.nextFloat();
float b=scn.nextFloat();
float c=a*b/2;
System.out.println("三角形的面積是"+c);
	}

}
