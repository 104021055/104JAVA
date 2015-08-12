import java.util.Scanner;
public class ExFor006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("½Ð¿é¤J¼Æ¦r");
int n=scn.nextInt();
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
