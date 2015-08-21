import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("½Ğ¿é¤J¤å¦r");
String str=scn.nextLine();
System.out.println("½Ğ¿é¤JÆ_°Í");
int key=scn.nextInt();
System.out.println("½Ğ¿é¤J¥[±K©Î¸Ñ±K(+/-)");
String x=scn.next();
char[]data=str.toCharArray();
int len=str.length();
char[]data1=new char[len];
if(key>3||key<0){
	System.out.println("Æ_°Í¿ù»~");
}
switch(x){
case"+":
	x="+";break;
case"-":
	x="-";break;
	default:
		System.out.println("¿é¤J¿ù»~");break;
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
