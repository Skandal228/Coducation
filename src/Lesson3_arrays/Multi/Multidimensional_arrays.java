package Lesson3_arrays.Multi;

public class Multidimensional_arrays {

    public static void main(String[] args) {
        int[][] matrace ={{1,2,3},{4,5,6},{7,8,9}};

        // как проводится цикличность вывода массивов на экран
        // - сначало идет внешний цикл строк
        // - далее идет внутренний цикл столбцов
        // - далее выводим на экран 2 переменные →строк[i] и → столбцов[j]
        // - после окончания цикла начинаем с новой строки потому что если этого не сделать выведенный массив будет показан на одной строке

        for (int i = 0; i<matrace.length; i++){
            for (int j = 0; j < matrace.length; j++) {
                System.out.print(matrace[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();

// через foreach
        int[][] numbers ={{1,2,3},{4,5,6},{7,8,9}};
        for (int[] row : numbers) { // объявляем переменную row
            for (int element : row) { // объявляем переменную element которая идет уже по внутреннему циклу через столбцы
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}


