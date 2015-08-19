import java.util.Scanner;
public class BandG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入性別與身高");
String BG=scn.next();
double h=scn.nextDouble();
double b;
double g;
if(BG.equals("男")){
	b=(h-170)*0.6+62;
	System.out.print("您的標準體重為"+b);
}else{
	g=(h-158)*0.5+52;
	System.out.print("您的標準體重為"+g);
}
	}

}
