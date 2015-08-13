import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入人數");
int people=scn.nextInt();
float data[][]=new float[people][4];
String name[]=new String[people];
int i=0,v1=0;
float min=999;
float max=0;
String max1=(""),min1=("");
while(i<people){
	System.out.print("請輸入第"+(i+1)+"位同學名字");
	name[i]=scn.next();
	System.out.print("請輸入三科成績");
	data[i][0]=scn.nextFloat();
	data[i][1]=scn.nextFloat();
	data[i][2]=scn.nextFloat();
	data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
	if(data[i][3]<60){
		v1++;
	}
	if(data[i][3]>max){
		max=data[i][3];
		max1=name[i];
	}//找最大值的同學
	if(data[i][3]<min){
		min=data[i][3];
		min1=name[i];
	}//找最小值的同學
	i++;
}
System.out.println("全班資料如下");
for(i=0;i<people;i++){
	System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"平均為"+data[i][3]);
}
System.out.println("不及格人數為"+v1);
System.out.println("成績最高為"+max1+max+"分,成績最低為"+min1+min+"分");
	}

}
