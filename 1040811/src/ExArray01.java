import java.util.Scanner;
import java.util.Random;
public class ExArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
Random ran=new Random();
System.out.println("瞦Τぶ案计");
int a=scn.nextInt();
int v1=0,v2=0;
int data[]=new int[10];
for(int m=0;m<10;m++){
	data[m]=ran.nextInt(101);
	if(data[m]%2==0){
		v1++;
	}else{
		v2++;
	}
	System.out.println(data[m]);
}
if(a==v1){
	System.out.println("砆瞦");
}else{
	System.out.println("瞦Τぶ案计");
	int b=scn.nextInt();
	if(b==v1){
		System.out.println("砆瞦");
	}else{
		System.out.println("瞦Τぶ案计");
		int c=scn.nextInt();
		if(c==v1){
			System.out.println("砆瞦");
		}else{
			System.out.print("块!!");
		}
	}
}
System.out.println("案计Τ"+v1+",计Τ"+v2+"");
	}
	
}


