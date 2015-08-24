import java.util.Scanner;
public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入要比較的數值");
double a=scn.nextDouble();
double b=scn.nextDouble();
if(a==b){
	System.out.println(a+"與"+b+"相同");
}else{
	if(a>b){
		System.out.println(a+"大於"+b);
	}else{
		System.out.println(b+"大於"+a);
	}
}
System.out.println("請問要如何計算?");
String str=scn.next();
double c;
if(str.equals("+")||str.equals("-")||str.equals("*")){
	if(str.equals("+")||str.equals("-")){
		if(str.equals("+")){
			c=a/b;
			System.out.println("答案為"+c);
		}else{
			c=a*b;
			System.out.println("答案為"+c);
		}
	}else{
		c=a-b;
		System.out.println("答案為"+c);
	}
}else{
	c=a+b;
	System.out.println("答案為"+c);
}
	}

}
