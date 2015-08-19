import java.util.Scanner;
import java.util.Random;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int i=rnd.nextInt(1000);
		int data[]={500,100,50,10,5,1};
		int j=1000-i;
		int data2[]=new int[6];
		for(int k=0;k<data.length;k++){
			data2[k]=j/data[k];
			j=j%data[k];
			if(data2[k]>0){
				System.out.print(data2[k]+"­Ó"+data[k]+"\t");
			}
		}
	}

}
