import java.util.Scanner;
import java.util.Random;
public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
Random rnd=new Random();
int data[]=new int[5];
boolean flag = false;
int i = 0;
while (i < 5) {
	data[i] = rnd.nextInt(100);
	flag = false;
	for (int j = 0; j < i; j++) {
		if (data[i] == data[j]) {
			flag = true;
		}
	}
	if (flag == false) {
		i++;
	}	
}
int k=0;
for(i=0;i<5;i++){
	for(k=i+1;k<5;k++){
		if(data[i]>data[k]){
			int change=data[i];
			data[i]=data[k];
			data[k]=change;
		}
	}
}
for(i=0;i<5;i++){
	System.out.println(data[i]);
}
//輸出五個亂數
System.out.println("輸入5個數字");
int data1[]=new int[5];
int j=0;
int o=0;
for(j=0;j<5;j++){
	data1[j]=scn.nextInt();
}
for(j=0;j<5;j++){
	for(o=j+1;o<5;o++){
		if(data1[j]>data1[o]){
			int change=data1[j];
			data1[j]=data1[o];
			data1[o]=change;
		}
	}
}
for(j=0;j<5;j++){
	System.out.println(data1[j]);
}
//輸出五的輸入的數
if(data[2]>data1[2]){
	System.out.println("你輸了");
}
if(data[2]==data1[2]){
	System.out.println("平手");
}
if(data[2]<data1[2]){
	System.out.println("好棒棒~你贏了");
}
	}

}
