import java.util.Scanner;
import java.util.Random;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
Random rnd=new Random();
int data[]=new int[20];
int v1=0,v2=0,v3=0;
for(int i=0;i<20;i++){
	data[i]=rnd.nextInt(21)-10;
	if(data[i]==0){
		v1++;
	}
	if(data[i]>0){
		v2++;
	}
	if(data[i]<0){
		v3++;
	}
	System.out.println(data[i]);
}
System.out.println("����0��"+v1+"�� �j��0��"+v2+"�� �p��0��"+v3+"��");
	}

}
