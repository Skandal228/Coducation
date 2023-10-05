package Lesson4_Switch.DZ;

import java.util.Scanner;

public class Main {
    /*Задача:
    Пользователь вводит с консоли оценку в виде буквы A = 5, B = 4, C = 3, D = 2, E = 1
    Соответственно наша программа должна сконвертировать её в число*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву");
        String mark = sc.next();

        switch (mark){ //если переменная равна одному из кейсов
            case "A":
                System.out.println(5);
                break; // break нужен всегда когда true операция закончена в противном случае если нет брейка то автоматом мы перейдем на следующий кейс либо некончится свитч
            case "B": case "b":
                System.out.println(4);
                break;

            case "C": case "c":
                System.out.println(3);
                break;
            case "D": case "d":
                System.out.println(2);
                break;
            case "E": case "e":
                System.out.println(1);
                break;
            default:
                System.out.println("invalid value");

        }

    }
}