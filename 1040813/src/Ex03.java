import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�X���X���x�}");
		int i = scn.nextInt();
		int j = scn.nextInt();
		int l = scn.nextInt();
		int k = scn.nextInt();
		int p = 0 ;
		int q = 0 ;
		if (j != l) {
			System.out.println("�x�}���~");
		}
		int data1[][] = new int[i][j];
		int data2[][] = new int[j][k];
		int dataAnswer[][] = new int[i][k];
		System.out.println("��J�Ĥ@�x�}�Ʀr");
		for (int w = 0; w < i; w++) {
			for (int x = 0; x < j; x++) {
				data1[w][x] = scn.nextInt();
			}
		}
		System.out.println("��J�ĤG�x�}�Ʀr");
		for (int x = 0; x < j; x++) {
			for (int z = 0; z < k; z++) {
				data2[x][z] = scn.nextInt();
			}
		}
		for (int w = 0; w < i; w++) {
			for (int z = 0; z < k; z++) {
				for (int x = 0; x < j; x++) {
					dataAnswer[p][q] += data1[w][x] * data2[x][z];
				}
				q++;
			}
			p++;
			q = 0;
		}
		for (p = 0; p < i; p++) {
			for (q = 0; q < k; q++) {
				System.out.print(dataAnswer[p][q] + "\t");
			}
			System.out.println();
		}
	}

}
