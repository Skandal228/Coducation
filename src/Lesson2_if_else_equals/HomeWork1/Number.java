package Lesson2_if_else_equals.HomeWork1;

import java.util.Scanner;
// Задача: считать число с консоли и проверить, положительное или отрицальное
public class Number {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Введи число на проверку");
        int a = src.nextInt();
        if (0<a){
            System.out.println("Число положительное");

        }else if (a==0){
            System.out.println("Ноль");
        }else  {
            System.out.println("Число отрицатьльное");
        }
    }
}
