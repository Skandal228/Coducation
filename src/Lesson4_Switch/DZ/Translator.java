package Lesson4_Switch.DZ;

import java.util.Scanner;
/*Сделать переводчик, т.е. пользователь вводит каое-то число по русски или по английски  программа должна это распознать и вывести цифру
One, одни →1
Two, два→2
 */
public class Translator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число от 1-5 словом на английской раскладке");
        String str = scr.next();

        switch (str){
            case "one": case "One": case "ONE":
                System.out.println("Один (1)");
                break;
            case "two": case "Two": case "TWO":
                System.out.println("Два (2)");
                break;
            case "Three": case "three": case "THREE":
                System.out.println("Три (3)");
                break;
            case "Four": case "four": case "FOUR":
                System.out.println("Четыре (4)");
                break;
            case "Five": case "FIVE": case "five":
                System.out.println("Пять (5)");
                break;
            default:
            {
                System.out.println("вы ввели не правильно");
            }
        }

    }
}
