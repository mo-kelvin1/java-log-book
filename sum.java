import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        //this is a program to find the sum of the first n even numbers
        Scanner input = new Scanner(System.in);
        //taking in the value of n
        System.out.println("This program finds the sum of the first n even numbers, Please enter a value for n");
        int number=input.nextInt();
        //declaring a variable to check the number of times the loop runs
        int iterations=0;
        //declaring a variable to store the sum of the numbers at the end of each iteration
        int sum=0;
        //declaring a variable to show the start of the iteration
        int start=0;
        while(iterations< number){
            start+=2;
            sum+=start;
            iterations++;
        }
        //printing the final answer
        System.out.println("The sum of the first "+ number +" even numbers is "+ sum);
    }
}