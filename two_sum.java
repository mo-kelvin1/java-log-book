//importing the scanner class to take input
import java.util.Scanner;
public class two_sum{
    public static void main(String[] args){
        Scanner scanner=new  Scanner(System.in);
        //checking the number of integers that are in to be stored in the array
        System.out.println("Enter the number of integers you want to store in the array");
        int n=scanner.nextInt();
        //creating an array of size n
        int[] nums=new int[n];
        //taking in the values of the array
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        //taking in the target value
        System.out.println("Enter the target value");
        int target=scanner.nextInt();
        //creating an array two_sum to store the indices of the first two numbers that add up to the target
        int[] two_sum={0,0};
        //calling the function twoSum to get the indices of the two numbers that add up to the target
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    two_sum[0]=i;
                    two_sum[1]=j;
                }
            }
        }
        // printing the result
        System.out.println("Indices: [" + two_sum[0] + ", " + two_sum[1] + "]");
        scanner.close();
    }
}