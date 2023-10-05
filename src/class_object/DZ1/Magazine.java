package class_object.DZ1;

import java.util.Scanner;

public class Magazine {
    /* И домашка к нему:
Задача 1 Создать класс Phone с атрибутами:
название
цена
цвет

В мейне создать массив Phone[] на 5 элементов.
Заполните массив объектами класса Phone любым способом и выполните действия с массивом:
1. Вывести все телефоны из массива (название, цвет и цену каждого телефона)
2. Вывести только те телефоны, чья цена ниже x (где x юзер вводит с консоли)
3. Вывести только те, чья цена ниже x и цвет равен y (x,y юзер вводит с консоли)*/

    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone.model = "Samsung";
        phone.cena = 500;
        phone.collor = "orange";

        phone1.model = "Apple";
        phone1.cena = 1000;
        phone1.collor = "green";

        phone2.model = "Motorolla";
        phone2.cena = 700;
        phone2.collor = "blue";

        phone3.model = "Simens";
        phone3.cena = 800;
        phone3.collor = "red";

        phone4.model = "LG";
        phone4.cena = 600;
        phone4.collor = "black";

        Phone[] arr = new Phone[5]; // теперь я создаю массив в типе phone на 5 элементов
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    arr[i] = phone;
                    break;
                case 1:
                    arr[i] = phone1;
                    break;
                case 2:
                    arr[i] = phone2;
                    break;
                case 3:
                    arr[i] = phone3;
                    break;
                case 4:
                    arr[i] = phone4;
                    break;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].cena + " " + arr[i].model + " " + arr[i].collor); // вывели все вложенные массивы в объект массива Phone
        }
        System.out.println();
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите цвет");
        String cursorCollor = scr.nextLine();
        System.out.println("Введите цену");
        int cursorPrice = scr.nextInt();
        boolean isExist = false;

        for (int i = 0; i < arr.length; i++) {
            if (cursorCollor.equals(arr[i].collor) && cursorPrice == arr[i].cena) {
                System.out.println("Да есть именно такой");// точное совпадение
                System.out.println("Модель: " + arr[i].model);
                System.out.println("Цвет: " + arr[i].collor);
                System.out.println("Стоимость: " + arr[i].cena);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            for (int i = 0; i < arr.length; i++) {
                if (cursorCollor.equals(arr[i].collor)) {
                    System.out.println("Есть именно в таком ЦВЕТЕ альтернативный вариант:"); // совпадение только по цвету
                    System.out.println("Модель: " + arr[i].model);
                    System.out.println("Цвет: " + arr[i].collor);
                    System.out.println("Стоимость: " + arr[i].cena);
                    isExist = true;
                    break;
                }
            }
        }

        if (!isExist) {
            for (int i = 0; i < arr.length; i++) {
                if (cursorPrice == arr[i].cena) {
                    System.out.println("Есть именно за такую СТОИМОСТЬ альтернативный вариант:");
                    System.out.println("Модель: " + arr[i].model);
                    System.out.println("Цвет: " + arr[i].collor);
                    System.out.println("Стоимость: " + arr[i].cena);
                    isExist = true;
                    break;
                }
            }
        }

        if (!isExist) {
            System.out.println("Нет подходящих телефонов.");
        }
    }
}
// 1. добавить совпадение если совпадает только цвет ( из цвета есть такой)
// 2. добавить совпадение если только цена( из похожей стоимости есть такой)
class Phone {
    String model;
    int cena;
    String collor;
}
