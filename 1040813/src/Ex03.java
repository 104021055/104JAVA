import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入幾乘幾的矩陣");
int i=scn.nextInt();
int j=scn.nextInt();
int l=scn.nextInt();
int k=scn.nextInt();
if(j!=l){
	System.out.println("矩陣錯誤");
}
int data1[][]=new int[i][j];
int data2[][]=new int[j][k];
int w=0;
int x=0;
int y=0;
int z=0;
System.out.println("輸入第一矩陣數字");
for(w=0;w<i;w++){
	for(x=0;x<j;x++){
		data1[w][x]=scn.nextInt();
	}
}
System.out.println("輸入第二矩陣數字");
for(y=0;y<j;y++){
	for(z=0;z<k;z++){
		data2[y][z]=scn.nextInt();
	}
}
int sum=1;
for(w=0;w<i;w++){
	for(z=0;z<k;z++){
		sum=sum+data1[w][x]*data2[y][z];
	}
}
System.out.println("答案為"+sum);
	}

}
