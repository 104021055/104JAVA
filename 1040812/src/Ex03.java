import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入文字");
String str=scn.nextLine();
System.out.println("請輸入鑰匙");
int key=scn.nextInt();
System.out.println("請輸入加密或解密(+/-)");
String x=scn.next();
char[]data=str.toCharArray();
int len=str.length();
char[]data1=new char[len];
if(key>3||key<0){
	System.out.println("鑰匙錯誤");
}
switch(x){
case"+":
	x="+";break;
case"-":
	x="-";break;
	default:
		System.out.println("輸入錯誤");break;
}
if(x=="+"){
	for(int i=0;i<len;i++){
		(data1[i])=(char)(data[i]+key);
	}
}if(x=="-"){
	for(int i=0;i<len;i++){
		(data1[i])=(char)(data[i]-key);
	}
}
String newstr=new String(data1);
System.out.println(newstr);
	}

}
