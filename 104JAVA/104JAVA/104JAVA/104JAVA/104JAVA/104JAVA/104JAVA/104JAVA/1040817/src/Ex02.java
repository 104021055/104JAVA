import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J��^�ƤT�즨�Z");
float C=scn.nextFloat();
float E=scn.nextFloat();
float M=scn.nextFloat();
sum(C,E,M);
avg(C,E,M);
	}
public static void sum(float C,float E,float M){
	float v1=C+M+E;
	System.out.print("�`���Z��"+v1);
}
public static void avg(float C,float E,float M){
	float v2=(C+M+E)/3;
	System.out.print("�������Z��"+v2);
}
}
