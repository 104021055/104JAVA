import java.util.Scanner;
public class ExTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�аݶR�X���ӫ~");
		int i=scn.nextInt();
		Ticket Tidata[]=new Ticket[i];
		System.out.print("���W");
		String Tishop=scn.next();
		System.out.print("�q��");
		String Tiphone=scn.next();
		int j=0;
		while(j<i){
			System.out.println("�~���W�ٻP����");
			Tidata[j] = new Ticket();
			Tidata[j].a(Tishop);
			Tidata[j].a(Tiphone);
			Tidata[j].Tithing(scn.next());
			Tidata[j].Tipoint(scn.nextInt());
			j++;
		}
		j=0;
		System.out.println("�C�L�o��");
		System.out.println(Tishop);
		System.out.println("�q��:"+Tiphone);
		int sum=0;
		while(j<i){	
			System.out.println("��"+(j+1)+"���ӫ~�G");
			Tidata[j].show();
			sum += Tidata[j].getpoint();
			j++;
			if(j==i){
				System.out.print("�`����"+sum);
			}
		}
		
	}

}
class Ticket{
	private String Tithing,Tiphone,Tishop;
	private int Tipoint;
	public Ticket(){
		
	}
	public Ticket(String thing,String shop,String phone,int point){
		Tithing=thing;
		Tiphone=phone;
		Tishop=shop;
		Tipoint=point;
	}
	public void Tithing(String str){
		Tithing=str;
	}
	
	public void a(String str){
		Tishop=str;
	}
	public void b(String str){
		Tiphone=str;
	}
	
	public String getthing(){
		return Tithing;
	}
	public void Tishop(String str){
		Tishop=str;
	}
	public String getshop(){
		return Tishop;
	}
	public void Tiphone(String str){
		Tiphone=str;
	}
	public String getphone(){
		return Tiphone;
	}
	public void Tipoint(int n){
		Tipoint=n;
	}
	public int getpoint(){
		return Tipoint;
	}
	public void show(){
		System.out.println("�~���W��:"+Tithing);
		System.out.println("����:"+Tipoint);
	}
	//
	public void show2(){
		int sum=0;
		sum+=Tipoint;
		System.out.println("�`���欰"+sum);
	}
	//
	
}