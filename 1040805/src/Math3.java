import java.util.Scanner;
public class Math3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�T���Ϊ��T�����X��");
double A=scn.nextDouble();
double B=scn.nextDouble();
double C=scn.nextDouble();
if(A+B>C&&A-B<C&&A<=B&&B<=C){
	System.out.println("�n�@���T����");
}else{
	System.out.println("�A�H���T���γo��²��N�X�ӤF��!!");
}
	}

}
