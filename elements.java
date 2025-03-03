import java.util.Arrays;
import java.util.Scanner;
public class elements {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] even= new int[3][3];
        int[][] odd=new int[3][3];
        int evenindex=0;
        int oddindex=0;
        for(int i=0; i<18; i++){
            System.out.println("Enter values from 1 to 18");
            int value=input.nextInt();
            if(value%2==0){
                if(evenindex<3){
                    even[0][evenindex]=value;
                    evenindex+=1;
                }else if(evenindex<6){
                    even[1][evenindex-3]=value;
                    evenindex+=1;
                }else{
                    even[2][evenindex-6]=value;
                    evenindex+=1;
                }
            }else{
                if(oddindex<3){
                    odd[0][oddindex]=value;
                    oddindex+=1;
                }else if(oddindex<6){
                    odd[1][oddindex-3]=value;
                    oddindex+=1;
                }else{
                    odd[2][oddindex-6]=value;
                    oddindex+=1;
                }
            }
        }
        
    }
}
