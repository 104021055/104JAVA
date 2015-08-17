import java.util.Scanner;
public class ExFor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int i;
int sum=0;
for(i=17;i<=1399;i=i+17){
	sum=sum+i;
}
System.out.print("13到1399間17的倍數相加等於"+sum);
	}

}
