import java.util.Scanner;
import java.util.Random;
public class ExArray0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random ran=new Random();
		int v1=0,v2=0;
		int data[]=new int[10];
		for(int m=0;m<10;m++){
			data[m]=ran.nextInt(100);
			if(data[m]%2==0){
				v1++;
			}else{
				v2++;
			}
		}
		int j=0;
		while(j<3){
			System.out.println("瞦瞦Τ碭案计");
			int a=scn.nextInt();
			if(a==v1){
				System.out.println("墓~~");
				j=3;
			}else{
				j++;
				System.out.println("瞦岿翅!!");
			}
		}
		System.out.println("案计Τ"+v1+"");
		for(int m=0;m<10;m++){
			System.out.println(data[m]);
		}
	}

}
