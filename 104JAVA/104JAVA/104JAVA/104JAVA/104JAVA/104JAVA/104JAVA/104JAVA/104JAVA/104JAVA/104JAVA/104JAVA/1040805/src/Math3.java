import java.util.Scanner;
public class Math3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�T���Ϊ��T�����X��,�ХѤp�ƨ�j");
double A=scn.nextDouble();
double B=scn.nextDouble();
double C=scn.nextDouble();
if(A+B>C&&A-B<C){
	System.out.println("�n�@���T����");
}else{
	System.out.println("�A�H���T���γo��²��N�X�ӤF��!!");
}
if((A*A+B*B)==(C*C)){
	System.out.println("�����T����");
}else{
	if((A*A+B*B)>(C*C)){
		System.out.println("�U���T����");
	}else{
		System.out.println("�w���T����");
	}
}
	}

}
