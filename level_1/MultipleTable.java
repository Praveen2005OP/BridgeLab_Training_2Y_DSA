package level_1;

import java.util.Scanner;

public class MultipleTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        input.close();
    }
}