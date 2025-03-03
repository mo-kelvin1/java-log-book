import java.util.Scanner;
public class frequency2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the total number of ratings");
        int ratings=input.nextInt();
        int[] ratingsArray=new int[ratings];
        //taking input into the array
        for(int i=0;i<ratings;i++){
            System.out.println("Enter the rating");
            int value=input.nextInt();
            if(value>5 || value<1){
                System.out.println("Invalid rating");
                i--;
                continue;
            }
            ratingsArray[i]= value;
        }
        //creating an array to store the frequency of each rating
        int[] frequency={0,0,0,0,0};
        for(int i=0;i<ratingsArray.length;i++){
            frequency[ratingsArray[i]-1]+=1;
        }
        for(int i=0;i<frequency.length;i++){
            System.out.println("Rating "+(i+1)+": "+frequency[i]);
        }
        input.close();  
    }
}
