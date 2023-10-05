package String_split_replace_contains;

public class Main2 {
    // split - позволяет разделить строку по какому-то символу разделителю
    // replace
    // contains

    public static void main(String[] args) {
        String str ="123+124";

        //String[] data = str.split("+"); если убрать комм., то в параметре сплита будет ошибка

        String[] data = str.split("\\+"); // все потому что ошибка подразумевает регулярное выражение (гугли!!!)

        for ( int i = 0; i< data.length; i++) {
            System.out.println(data[i]);
        }


        // Вывести цитату на консоль в ковычках
            // Цитата: "Это цитата"
            System.out.println("Цитата: \"Это цитата\"");// Эти слеши конвертируют наши кавычки в допускаемые символы на вывод

        // contains - проверяет знак




    }

}

