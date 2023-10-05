package Lesson2_if_else_equals;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a");
        int a =scn.nextInt();
        System.out.println("Enter b");
        int b = scn.nextInt();
        if (a==b){
            System.out.println("a = b " + a +" = "+b);
        }else if (a<b){
            System.out.println("a < b " + a + " < " + b );
        }else if (a>b){
            System.out.println("a > b " + a + " > " + b );
        }
        else {
            System.out.println("оишибка ввода!");
        }


    }
}
