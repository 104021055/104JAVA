import java.util.Scanner;
public class ExWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入年分");
int year=scn.nextInt();
while((year%4!=0)||(year%100==0&&year%400!=0)){
	System.out.println("請輸入年分");
	year=scn.nextInt();
}
System.out.println("真厲害!");
	}

}
