package learning.java;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
	int x = 153;
	int temp1 = x;
	int len = 0;
	while(temp1!=0) {
	temp1 = temp1/10;
	len++;
	}
	int temp2= x;
	int sum = 0;
	int rem;
	while(temp2!=0) {
		rem = temp2%10;
		sum+=Math.pow(rem,len);
		temp2 = temp2/10;
	} 
	if(sum==x) {
		System.out.print("armstrong value");
	}else {
		System.out.print(" not armstrong value");
	}
	
	

	}

}
