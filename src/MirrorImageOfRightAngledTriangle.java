package src;

import java.util.Scanner;

public class MirrorImageOfRightAngledTriangle {

    /*
     * Write a program to print a pattern of stars in the shape of mirror image of Right angled triangle.
     * Example :- Input - 4
     * Output :-  *
     *          * *
     *        * * *
     *      * * * *
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
        for(int i = 1; i <= input; i++){
            for(int j =1; j <= input-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
