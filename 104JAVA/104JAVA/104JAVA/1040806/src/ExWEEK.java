import java.util.Scanner;
public class ExWEEK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("今天星期幾?");
int w=scn.nextInt();
String e="";
if(w>7||w<1){
	System.out.println("沒有這一天");
}else{
	switch(w){
	case 1:
		e="Monday";break;
	case 2:
		e="Tuesday";break;
	case 3:
		e="Wednesday";break;
	case 4:
		e="Thursday";break;
	case 5:
		e="Friday";break;
	case 6:
		e="Saturday";break;
	case 7:
		e="Sunday";break;
	}
	System.out.println("星期"+w+"的英文是"+e);
}
	}

}
