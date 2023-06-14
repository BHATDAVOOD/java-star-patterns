package src;

import java.util.Scanner;

public class RightAngledTriangleStarPattern {

    /*
    * Write a program to print a pattern of stars in the shape of a right-angled triangle.
    * Example :- Input - 4
    * Output :- *
    *           * *
    *           * * *
    *           * * * *
    * */

    public static void main(String[] args) {

        int input;
        System.out.println("Enter the number of rows that you want.....");
        try (Scanner sc = new Scanner(System.in)) {
            input = sc.nextInt();
        }

        printStars(input);
    }

    public static void printStars(int input){

        for(int row = 1; row <= input; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
