import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J��r");
String str=scn.nextLine();
System.out.println("�п�J�_��");
int key=scn.nextInt();
System.out.println("�п�J�[�K�θѱK(+/-)");
String x=scn.next();
char[]data=str.toCharArray();
int len=str.length();
char[]data1=new char[len];
if(key>3||key<0){
	System.out.println("�_�Ϳ��~");
}
switch(x){
case"+":
	x="+";break;
case"-":
	x="-";break;
	default:
		System.out.println("��J���~");break;
}
if(x=="+"){
	for(int i=0;i<len;i++){
		(data1[i])=(char)(data[i]+key);
	}
}
if(x=="-"){
	for(int i=0;i<len;i++){
		(data1[i])=(char)(data[i]-key);
	}
}
String newstr=new String(data1);
System.out.println(newstr);
	}

}
