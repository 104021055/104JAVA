import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J�d�ߤ���P�P���X");
float D=scn.nextFloat();
String W=scn.next();
if(D==7||D==17||D==27&&D>0&&D<32){
System.out.println("�ڭn�Y�צY�צY��!!!");	
}else{
	if(W.equals("�P���G")||W.equals("�P���|")||W.equals("�P����")){
		System.out.println("��@�Q���R�Y��~~");
	}else{
		System.out.println("�ڬO�����ʰʪ�!!!");
	}
}
	}

}
