import java.util.Scanner;
public class Drink2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("我是建傑,幫我點一杯飲料吧,選一家店一杯飲料後告訴我價錢~~");
		String A=scn.next();
		String B="咖啡";
		switch(B){
		case"咖啡":
			break;
		case"綠茶":
			break;
		}
		float Money=scn.nextFloat();
		if(A.equals("五十嵐")){
			System.out.print("換一家店");
			String C=scn.next();
			String D="咖啡";
			switch(D){
			case"咖啡":
				break;
			case"綠茶":
				break;
			}
			float Money2=scn.nextFloat();
			if(D.equals("咖啡")&&Money2<=45&&Money2>0){
				System.out.println("選得好,我喜歡喝"+D);
			}else{
				System.out.println("你想被飲料砸嗎!!!");
			}
		}else{
			if(B.equals("咖啡")&&Money<=45&&Money>0){
				System.out.println("選得好,我喜歡喝"+B);
			}else{
				System.out.println("你想被飲料砸嗎!!!");
			}
		}
	}

}
