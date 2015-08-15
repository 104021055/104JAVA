import java.util.Scanner;
public class ExFor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入班級人數");
int people=scn.nextInt();
System.out.println("請輸入每個人的身高");
int i;
float sum1=0;
float sum2=0;
for(i=1;i<=people;i=i+1){
	sum1=sum1+scn.nextFloat();
}
float sum3=sum1/people;
System.out.println("身高平均為"+sum3);
System.out.println("請輸入每個人的體重");
for(i=1;i<=people;i=i+1){
	sum2=sum2+scn.nextFloat();
}
float sum4=sum2/people;
System.out.println("體重平均為"+sum4);
	}

}
