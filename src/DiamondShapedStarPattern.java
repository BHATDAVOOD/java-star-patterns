package src;

import java.util.Scanner;

public class DiamondShapedStarPattern {

    /*
     * Write a program to print a pattern of stars in the shape of a diamond.
     * Example :- Input - 4
     * Output :-
     *            *
     *           * *
     *          * * *
     *         * * * *
     *         * * * *
     *          * * *
     *           * *
     *            *
     * */

    public static void main(String[] args) {

        int input;
        System.out.println("Enter the length of the Pattern.....");
        try (Scanner sc = new Scanner(System.in)) {
            input = sc.nextInt();
        }

        printStars(input);

    }

    public static void printStars(int input){
        for(int row = 1; row <= input; row++){
            for(int spaces = 1; spaces <= input-row; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 1; row <= input; row++){
            for(int spaces = 1; spaces < row; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <= input - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
