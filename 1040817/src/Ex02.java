import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J��^�ƤT�즨�Z");
float C=scn.nextFloat();
float E=scn.nextFloat();
float M=scn.nextFloat();
float v1=M+E+C;
float v2=(M+C+E)/3;
sum(v1);
avg(v2);
	}
public static void sum(float v1){
	System.out.print("�`���Z��"+v1);
}
public static void avg(float v2){
	System.out.print("�������Z��"+v2);
}
}
