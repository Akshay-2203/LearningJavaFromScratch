import java.util.Arrays;

public class AirportGates {
    public static int findMinimumGates(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n = arr.length;
        int i = 0, j = 0;
        int currentGates = 0, maxGates = 0;
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                currentGates++;
                maxGates = Math.max(maxGates, currentGates);
                i++;
            } else {
                currentGates--;
                j++;
            }
        }
        
        return maxGates;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
        int[] dep1 = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Minimum number of gates required: " + findMinimumGates(arr1, dep1));
        
        int[] arr2 = {900, 940};
        int[] dep2 = {910, 1200};
        System.out.println("Minimum number of gates required: " + findMinimumGates(arr2, dep2));
    }
}