import java.util.Scanner;
public class Drink2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�ڬO�س�,�����I�@�M���Ƨa,��@�a���@�M���ƫ�i�D�ڻ���~~");
		String A=scn.next();
		String B="�@��";
		switch(B){
		case"�@��":
			break;
		case"���":
			break;
		}
		float Money=scn.nextFloat();
		if(A.equals("���Q�P")){
			System.out.print("���@�a��");
			String C=scn.next();
			String D="�@��";
			switch(D){
			case"�@��":
				break;
			case"���":
				break;
			}
			float Money2=scn.nextFloat();
			if(D.equals("�@��")&&Money2<=45&&Money2>0){
				System.out.println("��o�n,�ڳ��w��"+D);
			}else{
				System.out.println("�A�Q�Q���Ư{��!!!");
			}
		}else{
			if(B.equals("�@��")&&Money<=45&&Money>0){
				System.out.println("��o�n,�ڳ��w��"+B);
			}else{
				System.out.println("�A�Q�Q���Ư{��!!!");
			}
		}
	}

}
