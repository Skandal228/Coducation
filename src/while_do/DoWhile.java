package while_do;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value; // ОБЪЯВЛЯТЬ ПЕРЕМЕННУЮ ОБЯЗАТЕЛЬНО ПЕРЕД ЦИКЛОМ, Т.К. ПОМНИ ПРО ОБЛАСТЬ ЕЁ ВИДИМОСТИ {}

        do {
            System.out.println("Press to 5");
            value = scanner.nextInt();
        } while (value!=5);
        System.out.println("Yes, press 5");

    }
}

// смысл програмы do while сначала выполнять инструкци{}и потом проверить условия().
// do while позволяет хотя бы однократное выполнение инструкции или {того что здесь написанно}