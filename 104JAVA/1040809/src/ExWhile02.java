import java.util.Scanner;
public class ExWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J�~��");
int year=scn.nextInt();
while((year%4!=0)||(year%100==0&&year%400!=0)){
	System.out.println("�п�J�~��");
	year=scn.nextInt();
}
System.out.println("�u�F�`!");
	}

}
