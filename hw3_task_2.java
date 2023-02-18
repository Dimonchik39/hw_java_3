import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, 
// максимальное и среднее арифметическое из этого списка.

public class hw3_task_2 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        double average = 0;
            ArrayList<Integer> numberList = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                numberList.add(randomNumber.nextInt(1, 100));
                average += numberList.get(i);
        }
        
        System.out.println("Список целочисленных чисел: " + numberList.toString());
        System.out.println("Минимальное число: " + Collections.min(numberList));
        System.out.println("Максимальное число: " + Collections.max(numberList));
        System.out.println("Среднее арифметическое: " + average/ numberList.size());
    }
}
