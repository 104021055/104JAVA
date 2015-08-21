import java.util.Scanner;
public class ExTaiwan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入身分證開頭的英文字母");
String str=scn.next();
char e=str.charAt(0);
String str2="";
switch(e){
case'A':
	str2="台北市10";break;
case'B':
	str2="台中市11";break;
case'C':
	str2="基隆市12";break;
case'D':
	str2="台南市13";break;
case'E':
	str2="高雄市14";break;
case'F':
	str2="台北縣15";break;
case'G':
	str2="宜蘭縣16";break;
case'H':
	str2="桃園縣17";break;
case'J':
	str2="新竹縣18";break;
case'K':
	str2="苗栗縣19";break;
case'L':
	str2="台中縣20";break;
case'M':
	str2="南投縣21";break;
case'N':
	str2="彰化縣22";break;
case'P':
	str2="雲林縣23";break;
case'Q':
	str2="嘉義縣24";break;
case'R':
	str2="台南縣25";break;
case'S':
	str2="高雄縣26";break;
case'T':
	str2="屏東縣27";break;
case'U':
	str2="花蓮縣28";break;
case'V':
	str2="台東縣29";break;
case'X':
	str2="澎湖縣30";break;
case'Y':
	str2="陽明山31";break;
case'W':
	str2="金門32";break;
case'Z':
	str2="馬祖33";break;
case'I':
	str2="嘉義市34";break;
case'O':
	str2="新竹市35";break;
	default:
		str2="錯誤訊息";break;
}
System.out.println(str2);
	}

}
