import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入一段文字");
		String i=scn.nextLine();
		fun(i);
	}
	public static void fun(String i){
		char data[]=i.toCharArray();
		int len=i.length();
		String str = "";
		int n=0;
		while(n<len){
			if(data[n] != ' '){
				str += data[n];
				System.out.print(data[n]);
				n++;
			}else{
				System.out.print("");
				n++;
			}
		}
	}

}
