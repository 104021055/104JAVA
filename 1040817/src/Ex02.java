import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入國英數三科成績");
float C=scn.nextFloat();
float E=scn.nextFloat();
float M=scn.nextFloat();
float v1=M+E+C;
float v2=(M+C+E)/3;
sum(v1);
avg(v2);
	}
public static void sum(float v1){
	System.out.print("總成績為"+v1);
}
public static void avg(float v2){
	System.out.print("平均成績為"+v2);
}
}
