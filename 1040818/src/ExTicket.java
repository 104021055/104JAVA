import java.util.Scanner;
public class ExTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請問買幾項商品");
		int i=scn.nextInt();
		Ticket Tidata[]=new Ticket[i];
		System.out.print("店名");
		String Tishop=scn.next();
		System.out.print("電話");
		String Tiphone=scn.next();
		int j=0;
		int sum=0;
		while(j<i){
			System.out.println("品項名稱與價格");
			Tidata[j].Tithing(scn.next());
			Tidata[j].Tipoint(scn.nextInt());
			j++;
		}

	}

}
class Ticket{
	private String Tithing,Tiphone,Tishop;
	private int Tipoint;
	public Ticket(String thing,String shop,String phone,int point){
		Tithing=thing;
		Tiphone=phone;
		Tishop=shop;
		Tipoint=point;
	}
	public void Tithing(String str){
		Tithing=str;
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
		System.out.println(Tishop);
		System.out.println("電話:"+Tiphone);
		System.out.println("品項名稱:"+Tithing);
		System.out.println("價格:"+Tipoint);
	}
	
}