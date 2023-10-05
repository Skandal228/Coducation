package String_split_replace_contains;

public class GlobalUser {
    public static void main(String[] args) {


        // Юзер вводит имена людей с консоли через знак тире
        //1. Заменить тире на пробел
        //2. Получить каждое имя по отдельности получить результат

        String user = "Mark - Ivan - Petr - Elena -     Natalia";
        user=user.replace(" ", "");// меняем пробел на пустую строчку
        String[]data =null;
        String action = null;
        if (user.contains("-")) {
            data=user.split("-");
        }

        else {
            System.out.println();
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
    }
}
