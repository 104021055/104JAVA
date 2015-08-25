import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入國英數三科成績");
float C=scn.nextFloat();
float E=scn.nextFloat();
float M=scn.nextFloat();
sum(C,E,M);
avg(C,E,M);
	}
public static void sum(float C,float E,float M){
	float v1=C+M+E;
	System.out.print("總成績為"+v1);
}
public static void avg(float C,float E,float M){
	float v2=(C+M+E)/3;
	System.out.print("平均成績為"+v2);
}
}
