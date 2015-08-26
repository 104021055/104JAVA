import java.util.Scanner;
public class ExMethod0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("n=?");
        long n =scn.nextLong();
        int sum =(int)fun(n);
        System.out.println(" "+sum);
	}
        public static long fun(long v1){
        long sum = 0;
        String m=""+v1;
        int len = m.length();
        char[] a =m.toCharArray();
        for(int i=0;i<len;i++){
        	int c=a[i]-'0';
        sum+=c;	
        }
        return sum;
	}

}
