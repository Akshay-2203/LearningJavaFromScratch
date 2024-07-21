package learning.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 153;
		int len = 0;
		int temp1 = x;
		while(temp1!=0) {
			temp1=temp1/10;
			len++;
		}
		int temp2 = x;
		int n=0;
		int rem;
		while(temp2!=0) {
			rem = temp2%10;
			n +=Math.pow(rem,len);
			temp2 = temp2/10;
		}
		if(n==x) {
			System.out.print("Armstrong");
		}
		else {
			System.out.print("Not Armstrong");
		}
	}

}
