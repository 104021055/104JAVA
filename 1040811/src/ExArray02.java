import java.util.Scanner;
import java.util.Random;

public class ExArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[10];
		boolean flag = false;
		int i = 0;
		while (i < 10) {
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
		for (i = 0; i < 10; i++) {
			System.out.println(data[i]);
		}
	}

}