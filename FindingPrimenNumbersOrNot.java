package learning.java;

public class FindingPrimenNumbersOrNot {

	public static void main(String[] args) {
int no = 9;
int temp=0;

for(int i=2; i<=no-1;i++) {
	if(no%2 ==0) {
		temp= temp+1;
	}
}
if(temp>0) {
	System.out.print("no is not prime");
}else {
	System.out.print("no.is prime");
}
	
	
	}

}
