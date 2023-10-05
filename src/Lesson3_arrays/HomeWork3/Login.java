package Lesson3_arrays.HomeWork3;

import java.util.Random;
import java.util.Scanner;

/* Требуется создать массив из логинов. И через консоль если он существет в массиве то программа выводит на консоль вы
* успешно вошли в сис-му, если же нет то такого логина нет */
public class Login {
    public static void main(String[] args) {

        String[] arrLogin = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrLogin.length; i++) {
            arrLogin[i] = "login" + i; // пока генерация названия нам не доступна, мы просто добавим к [i] приставку login
            //System.out.println(arrLogin[i] + " ");
        }
        System.out.println("Введите логин");
        String loginName = sc.next();
        boolean isExist = false;
        for ( int i = 0; i < arrLogin.length; i ++) {
            if (arrLogin[i].equals(loginName)) {
                System.out.println(loginName + " вы успешно вошли в систему");
                isExist = true;
            }

        }
        if (!isExist){ // else писать не надо ( например если я введу login3 на экран вылезет "логин не найден" 4 раза, т.к. он будет крутится по порядку индекса поэтому я создал доп. переменну.
            System.out.println("логин не найден");

        }

    }

}
