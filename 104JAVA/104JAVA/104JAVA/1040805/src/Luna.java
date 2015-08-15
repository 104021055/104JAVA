import java.util.Scanner;
public class Luna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入您的生日");
float Mounth=scn.nextFloat();
float Day=scn.nextFloat();
if((Mounth==1&&Day>=21&&Day<=31)||(Mounth==2&&Day>=1&&Day<=19)){
	System.out.println("水瓶座");
}else{
	if((Mounth==2&&Day>=20&&Day<=29)||(Mounth==3&&Day>=1&&Day<=20)){
		System.out.println("雙魚座");
}else{
	if((Mounth==3&&Day>=21&&Day<=31)||(Mounth==4&&Day>=1&&Day<=19)){
		System.out.println("白羊座");
}else{
	if((Mounth==4&&Day>=20&&Day<=30)||(Mounth==5&&Day>=1&&Day<=20)){
		System.out.println("金牛座");
}else{
	if((Mounth==5&&Day>=21&&Day<=31)||(Mounth==6&&Day>=1&&Day<=21)){
		System.out.println("雙子座");
}else{
	if((Mounth==6&&Day>=22&&Day<=30)||(Mounth==7&&Day>=1&&Day<=22)){
		System.out.println("巨蠍座");
}else{
	if((Mounth==7&&Day>=23&&Day<=31)||(Mounth==8&&Day>=1&&Day<=22)){
		System.out.println("獅子座");
}else{
	if((Mounth==8&&Day>=23&&Day<=31)||(Mounth==9&&Day>=1&&Day<=22)){
		System.out.println("處女座");
}else{
	if((Mounth==9&&Day>=23&&Day<=30)||(Mounth==10&&Day>=1&&Day<=23)){
		System.out.println("天秤座");
}else{
	if((Mounth==10&&Day>=24&&Day<=31)||(Mounth==11&&Day>=1&&Day<=21)){
		System.out.println("天蠍座");
}else{
	if((Mounth==11&Day>=22&&Day<=30)||(Mounth==12&&Day>=1&&Day<=20)){
		System.out.println("射手座");
}else{
	if((Mounth==12&&Day>=21&&Day<=31)||(Mounth==1&&Day>=1&&Day<=20)){
		System.out.println("摩羯座");
}else{
	System.out.println("日期錯誤");
}
}
}
}
}
}
}
}
}
}
}
}
	}

}
