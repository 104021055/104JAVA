import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J���ϥήɶ�(����)");
		int time=scn.nextInt();
		if(time/600>2){
			System.out.print("�q�ܶO:"+time*0.5*0.79);
		}
		if(2>=time/600&&time/600>1){
			System.out.print("�q�ܶO:"+time*0.5*0.9);
		}
		if(time/600<=1){
			System.out.print("�q�ܶO:"+time*0.5);
		}
	}

}
