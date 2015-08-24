import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入查詢日期與星期幾");
float D=scn.nextFloat();
String W=scn.next();
if(D==7||D==17||D==27&&D>0&&D<32){
System.out.println("我要吃肉吃肉吃肉!!!");	
}else{
	if(W.equals("星期二")||W.equals("星期四")||W.equals("星期六")){
		System.out.println("初一十五愛吃菜~~");
	}else{
		System.out.println("我是雜食性動物!!!");
	}
}
	}

}
