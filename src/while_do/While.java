package while_do;

import java.util.Scanner;

public class While {
    // Требуется закончить ввод как только мы введум 5ку с консоли
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаем сканер
        System.out.println("Enter the number 5: "); // введите на экран число 5
        int value = scanner.nextInt(); // создаем переменную сканер некстинт для того чтобы вводить число
        while (value != 5) { // создаем условие, при котором если мы не введем 5 цикл продолжит просить ввести 5ку
            System.out.println("Your enter 5"); // создаем уведомление если не ввели 5ку
            value = scanner.nextInt(); // принуждаем опять вводить с консоли
        }
        System.out.println("Yes, your enter the 5!"); // И если мы ввели нужное число программа останавливается с данным выводом на экран сообщения
    }
}

// Смысл программы While проверить условия(), далее выполнить инструкции{}.
// Но в данном случае лучше использовать do while, т.к. мы дублируем код строка 9,10 и 12,13 дублируются поэтому переходим к do while