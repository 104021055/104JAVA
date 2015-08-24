import java.util.Scanner;
public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入一數");
int math=scn.nextInt();
int sum=1;
for(int i=math;i>0;i--){
	sum=sum*i;
}
System.out.println("答案為"+sum);
	}

}
