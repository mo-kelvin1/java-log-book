public class frequency {
    public static void main(String args[]) {
        //a java program to determine frequency of ratings that are stored in an array
        //creating an array to store ratings
        int[] ratings={1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        //creating a variable to store the frequency of each rating
        int[] frequency={0,0,0,0,0};
        for(int i=0; i<ratings.length;i++){
            frequency[ratings[i]-1]+=1;
        }
        for(int i=0;i<frequency.length;i++){
            System.out.println("Rating "+(i+1)+": "+frequency[i]);
        }
    }
}
