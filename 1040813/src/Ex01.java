import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�H��");
int people=scn.nextInt();
float data[][]=new float[people][4];
String name[]=new String[people];
int i=0,v1=0;
float min=999;
float max=0;
String max1=(""),min1=("");
while(i<people){
	System.out.print("�п�J��"+(i+1)+"��P�ǦW�r");
	name[i]=scn.next();
	System.out.print("�п�J�T�즨�Z");
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
	}//��̤j�Ȫ��P��
	if(data[i][3]<min){
		min=data[i][3];
		min1=name[i];
	}//��̤p�Ȫ��P��
	i++;
}
System.out.println("���Z��Ʀp�U");
for(i=0;i<people;i++){
	System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"������"+data[i][3]);
}
System.out.println("���ή�H�Ƭ�"+v1);
System.out.println("���Z�̰���"+max1+max+"��,���Z�̧C��"+min1+min+"��");
	}

}
