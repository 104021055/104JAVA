import java.util.Scanner;
public class ExTaiwan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�����Ҷ}�Y���^��r��");
String str=scn.next();
char e=str.charAt(0);
String str2="";
switch(e){
case'A':
	str2="�x�_��10";break;
case'B':
	str2="�x����11";break;
case'C':
	str2="�򶩥�12";break;
case'D':
	str2="�x�n��13";break;
case'E':
	str2="������14";break;
case'F':
	str2="�x�_��15";break;
case'G':
	str2="�y����16";break;
case'H':
	str2="��鿤17";break;
case'J':
	str2="�s�˿�18";break;
case'K':
	str2="�]�߿�19";break;
case'L':
	str2="�x����20";break;
case'M':
	str2="�n�뿤21";break;
case'N':
	str2="���ƿ�22";break;
case'P':
	str2="���L��23";break;
case'Q':
	str2="�Ÿq��24";break;
case'R':
	str2="�x�n��25";break;
case'S':
	str2="������26";break;
case'T':
	str2="�̪F��27";break;
case'U':
	str2="�Ὤ��28";break;
case'V':
	str2="�x�F��29";break;
case'X':
	str2="���30";break;
case'Y':
	str2="�����s31";break;
case'W':
	str2="����32";break;
case'Z':
	str2="����33";break;
case'I':
	str2="�Ÿq��34";break;
case'O':
	str2="�s�˥�35";break;
	default:
		str2="���~�T��";break;
}
System.out.println(str2);
	}

}
