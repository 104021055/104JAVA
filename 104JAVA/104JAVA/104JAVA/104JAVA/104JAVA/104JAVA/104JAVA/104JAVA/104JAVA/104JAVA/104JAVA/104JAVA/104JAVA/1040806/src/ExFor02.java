import java.util.Scanner;
public class ExFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int i;
int sum=0;
for(i=13;i<=1399;i=i+2){
	sum=sum+i;
}
System.out.print("13到1399的奇數相加等於"+sum);
	}

}
