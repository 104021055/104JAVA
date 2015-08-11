import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn= new Scanner(System.in);
System.out.println("請輸入車子的傾角,兩輪軸心之軸距,輪胎尺寸");
float a=scn.nextFloat();
float b=scn.nextFloat();
float c=scn.nextFloat();
if(a>=43&&b==130&&c==12){
	System.out.println("我喜歡這部車!!");
}else{
	System.out.println("這不是我要的車");
}

	}

}
