import java.util.Scanner;
public class Math3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("三角形的三邊長交出來");
double A=scn.nextDouble();
double B=scn.nextDouble();
double C=scn.nextDouble();
if(A+B>C&&A-B<C&&A<=B&&B<=C){
	System.out.println("好一的三角形");
}else{
	System.out.println("你以為三角形這麼簡單就出來了嗎!!");
}
	}

}
