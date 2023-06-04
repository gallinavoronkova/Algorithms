package lesson20230515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayAndLinkedListComparison {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        long start, end;

        start = System.currentTimeMillis();
        generateValues(array);
        end = System.currentTimeMillis();
        System.out.println("ArrayList insert time is : " + (end - start));
        start = System.currentTimeMillis();
        generateValues(list);
        end = System.currentTimeMillis();
        System.out.println("LinkedList insert time is : " + (end - start));


        start = System.currentTimeMillis();
        randomPickupValues(array);
        end = System.currentTimeMillis();
        System.out.println("ArrayList pick up time is : " + (end - start));
        start = System.currentTimeMillis();
        randomPickupValues(list);
        end = System.currentTimeMillis();
        System.out.println("LinkedList pick up time is : " + (end - start));
    }

    private static void generateValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(i, random.nextInt());
        }
    }

    private static void randomPickupValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.get(random.nextInt(100000));
        }
    }
}
