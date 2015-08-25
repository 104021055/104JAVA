import java.util.Scanner;
public class ExMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("輸入數字");
String i=scn.next();
char data[]=i.toCharArray();
int j=i.length();
for(j=0;j<i.length();j++){
	j=data[1]-'0';
	fun(j);
}
System.out.println("答案為"+fun(j));
	}
	public static int fun(int j){
		int sum=0;
		sum=sum+j;
		return sum;
	}

}
