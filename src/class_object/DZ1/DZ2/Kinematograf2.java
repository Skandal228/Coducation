package class_object.DZ1.DZ2;

import java.util.Scanner;

public class Kinematograf2 {





    public static void main(String[] args) {

        Film film = new Film();
        Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();
        Film film5 = new Film();
        Film film6 = new Film();
        Film film7 = new Film();
        Film film8 = new Film();
        Film film9 = new Film();

        film.nameFilm = "Зеленая Миля";
        film.nameDirector = "Дарабонт";
        film.rating = 9.1;
        film.duration = 3.09;

        film1.nameFilm = "Форрест Гамп";
        film1.nameDirector = "Роберт Земекис";
        film1.rating = 8.9;
        film1.duration = 2.22;

        film2.nameFilm = "Побег из Шоушенка";
        film2.nameDirector = "Дарабонт";
        film2.rating = 9.1;
        film2.duration = 2.22;

        film3.nameFilm = "Один + Один";
        film3.nameDirector = "Оливье Накаш";
        film3.rating = 8.8;
        film3.duration = 1.52;

        film4.nameFilm = "Список Шиндлера";
        film4.nameDirector = "Стивен Спилберг";
        film4.rating = 8.9;
        film4.duration = 3.15;

        film5.nameFilm = "Интерстеллар";
        film5.nameDirector = "Кристофер Нолан";
        film5.rating = 8.9;
        film5.duration = 2.29;

        film6.nameFilm = "Властелин колец: Возвращение короля";
        film6.nameDirector = "ДараПитер Джексон";
        film6.rating = 8.9;
        film6.duration = 3.35;

        film7.nameFilm = "Тайна Коко";
        film7.nameDirector = "Ли Анкрич";
        film7.rating = 8.8;
        film7.duration = 1.45;

        film8.nameFilm ="Бойцовский клуб";
        film8.nameDirector = "Дэвид Финчер";
        film8.rating = 8.8;
        film8.duration = 2.19;

        film9.nameFilm = "Унесённые призраками";
        film9.nameDirector = "Миядзаки";
        film9.rating = 8.8;
        film9.duration = 2.05;

        Film[] arr = new Film[10];
        arr[0] = film;
        arr[1] = film1;
        arr[2] = film2;
        arr[3] = film3;
        arr[4] = film4;
        arr[5] = film5;
        arr[6] = film6;
        arr[7] = film7;
        arr[8] = film8;
        arr[9] = film9;

        Scanner src = new Scanner(System.in);
        System.out.println("Введите рейтинг фильма");
        double cursorRating = src.nextDouble();
        System.out.println("Введите длительность фильма");
        double cursorDuration = src.nextDouble();

        //3. Вывести все фильмы, чья длительность меньше x и рейтинг выше y (x, y юзер вводит с консоли)*/

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].duration<cursorDuration && arr[i].rating>cursorRating){
                System.out.println("Название фильма: " + arr[i].nameFilm);
                System.out.println("Режисер: " + arr[i].nameDirector);
                System.out.println("Рейтинг: " + arr[i].rating);
                System.out.println("Длительнойсть: " + arr[i].duration);
                System.out.println();
            }

        }





    }
}
