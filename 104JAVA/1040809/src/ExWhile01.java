import java.util.Scanner;
public class ExWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int time=1;
double w=20000;
while(w<1100000){
	w=w+w*0.15;
	time=time+1;
}
System.out.println(time+"小時達滿水位");
	}

}
