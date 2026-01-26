package level_1;

import java.util.*;

public class CanVoteOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the age of Students.");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=18){
                System.out.println("Can vote");
            }
            else{
                System.out.println("Cannot vote");
            }
        }
    }
}
