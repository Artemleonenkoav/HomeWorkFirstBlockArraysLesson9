//// Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
////массива задает пользователь).
////Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
////элементов, среднее арифметическое всех элементов.

public class Task2 {
    public static void main(String[] args) {

//        Наименьшее значение
//        int[] list = {7, 8, 9, -17, -19, 21, 10, 11, -48, 8};
//        int min = list[0];
//        for (int i = 1; i < list.length; i++) {
//            if (list[i] < min)
//                min = list[i];
//        }
//        System.out.println("Min is " + min);

//        Наибольшее значение
//
//        int[] list = {7, 8, 9, -17, -19, 21, 10, 11, -48, 8};
//        int max = list[0];
//        for (int i = 1; i < list.length; i++) {
//            if (list[i] > max)
//                max = list[i];
//        }
//        System.out.println("Max is " + max);


//        Среднее арифметическое  значение
        int num [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("Среднее арифметическое чисел равно: " + sum/num.length);

    }
}
