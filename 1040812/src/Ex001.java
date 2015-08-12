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
//场だ块き睹计
System.out.println("块5计");
int j=0;
for(j=0;j<5;j++){
	int sum=scn.nextInt();
	System.out.println(sum);
}
int o=0;
for(j=0;j<5;j++){
	for(o=j+1;o<5;o++){
		//俱计ゑい
	}
}
	}

}
