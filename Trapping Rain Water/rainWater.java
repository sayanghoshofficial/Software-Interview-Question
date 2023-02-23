import java.util.Scanner;

public class rainWater {

    public static int maxWater(int[] arr, int n)
    {
        int ans = 0;
  
        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {
  
            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
  
            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
  
            // Update maximum water value
            ans += Math.min(left, right) - arr[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array");
        int n = sc.nextInt();
        int i = 1;
        int arr[] = new int[n];
        while(i < n){
            System.out.println("Enter "+i+"th element of the array");
            arr[i] = sc.nextInt();
            i++;
        }
  
        System.out.print(maxWater(arr, n));
    }
}
