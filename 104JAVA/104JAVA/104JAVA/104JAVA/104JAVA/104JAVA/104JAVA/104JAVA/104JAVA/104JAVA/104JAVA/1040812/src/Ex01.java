import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("½Ð¿é¤J¤å¦r");
String str=scn.nextLine();
char[]data=str.toCharArray();
int len=str.length();
char[]data1=new char[len];
for(int i=0;i<len;i++){
	data1[i]=data[len-i-1];
}
String str2=new String(data1);
System.out.println(data1);
	}

}
