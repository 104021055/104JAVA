import java.util.Scanner;
public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�n������ƭ�");
double a=scn.nextDouble();
double b=scn.nextDouble();
if(a==b){
	System.out.println(a+"�P"+b+"�ۦP");
}else{
	if(a>b){
		System.out.println(a+"�j��"+b);
	}else{
		System.out.println(b+"�j��"+a);
	}
}
System.out.println("�аݭn�p��p��?");
String str=scn.next();
double c;
if(str.equals("+")||str.equals("-")||str.equals("*")){
	if(str.equals("+")||str.equals("-")){
		if(str.equals("+")){
			c=a/b;
			System.out.println("���׬�"+c);
		}else{
			c=a*b;
			System.out.println("���׬�"+c);
		}
	}else{
		c=a-b;
		System.out.println("���׬�"+c);
	}
}else{
	c=a+b;
	System.out.println("���׬�"+c);
}
	}

}
