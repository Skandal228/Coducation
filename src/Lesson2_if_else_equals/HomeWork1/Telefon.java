package Lesson2_if_else_equals.HomeWork1;

import java.util.Scanner;
/* Задача: считать с консоли номер телефона и определить, кому он принадлежит, исходя из следующих данных
79207884517 - Иван
79611517799 - Петр
 */
public class Telefon {
    public static void main(String[] args) {
      Scanner src = new Scanner(System.in);
        System.out.println("введите номер");
      long number1 = src.nextLong();
      if (number1 == 79207884517l){
          System.out.println("Иван");
      }else if (number1==79611517799l){
          System.out.println("Олег");
      }else{
          System.out.println("кто вы?");
      }

    }
}


