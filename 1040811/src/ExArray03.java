import java.util.Scanner;
import java.util.Random;
public class ExArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
Random rnd=new Random();
int data[]=new int[100];
boolean flag=false;
int i=0,j=0,k=0;
while(i<10){
	data[i]=rnd.nextInt(100);
	flag=false;
	for(j=0;j<i;j++){
		if(data[i]==data[j]){
			flag=true;
		}
	}
	if(flag==false){
		i++;
	}
}
for(i=0;i<10;i++){
	for(k=i+1;k<10;k++){
		if(data[i]>data[k]){
			int change=data[i];
			data[i]=data[k];
			data[k]=change;
		}
	}
}
for(i=0;i<10;i++){
	System.out.println(data[i]);
}
	}

}