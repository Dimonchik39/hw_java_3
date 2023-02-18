import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из 
// него четные числа (в языке уже есть что-то готовое для этого).

public class hw3_task_1 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
            ArrayList<Integer> numberList = new ArrayList<>(15);
            for (int i = 0; i < 15; i++) {
                numberList.add(randomNumber.nextInt(1, 100));
        }
        
        System.out.println(numberList.toString());
            for (int i = 0; i < numberList.size(); i++) {
                if(numberList.get(i) % 2 == 0) {
                    numberList.remove(i);
                    i--;
                }
        }
        System.out.println(numberList.toString());
    }
}
    