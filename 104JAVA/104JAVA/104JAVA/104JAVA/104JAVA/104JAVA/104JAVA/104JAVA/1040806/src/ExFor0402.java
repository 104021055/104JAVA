import java.util.Scanner;
public class ExFor0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�Z�ŤH��");
		int people=scn.nextInt();
		System.out.println("�п�J�C�ӤH�������魫");
		int i;
		float sum1=0;
		float sum2=0;
		for(i=1;i<=people;i=i+1){
			sum1=sum1+scn.nextFloat();
			sum2=sum2+scn.nextFloat();
		}
		float sum3=sum1/people;
		float sum4=sum2/people;
		System.out.println("����������"+sum3+"�魫������"+sum4);
	}

}