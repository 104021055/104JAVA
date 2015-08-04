import java.util.Scanner;
public class GirlFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請告訴我你的身高跟體重");
float tall=scn.nextFloat();
float fat=scn.nextFloat();
if(tall>165&&fat<45){
	System.out.println("我想跟你再一起!!!");
}else{
	System.out.println("去旁邊吃屎吧!!!");
}
	}

}
