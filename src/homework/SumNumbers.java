package homework;

import java.util.*;

public class SumNumbers {
    /*
    Дан List<Integer>. Написать метод, который определит, есть ли в этом списке такая пара чисел,
    которые в сумме дают заданное число N.
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 7, 12);
        int sumN = 18;

        findSumN(numbers, sumN);
    }

    public static void findSumN(List<Integer> numbers, int sumN) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (map.containsKey(sumN - numbers.get(i))) {
                System.out.println(numbers.get(map.get(sumN - numbers.get(i))));
                return;
            }
            map.put(numbers.get(i), i);
        }

        System.out.println("No such numbers ");
    }
}
