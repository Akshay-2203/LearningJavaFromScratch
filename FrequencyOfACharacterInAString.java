package learning.java;

public class FrequencyOfACharacterInAString {

	public static void main(String[] args) {
		String str = " Banana is good for me ";
		char arr[] = str.toCharArray();
		int[] count =  new int[ arr.length];
		int i,j;
		for(i=0; i<arr.length;i++) {
			count[i]=1;
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					arr[j] = '0';
					count[i]++;
				
				}
			}
		}
		System.out.println(str);
		for(i=0;i<arr.length;i++) {
			if(arr[i]!='0' && (arr[i]!=' ') ) {
				System.out.println(arr[i] + " " + count[i]);
			}
		}

	}

}
