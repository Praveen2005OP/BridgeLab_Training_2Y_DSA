package level_1;

import java.util.*;

public class positiveNegativeOrZero {
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
            if(arr[i]>0){
                System.out.println("Positive");
            }
            else if(arr[i]<0){
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }
    }
}
