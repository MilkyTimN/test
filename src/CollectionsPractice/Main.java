package CollectionsPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer integer = scanner.nextInt();

        Set<Integer> integerSet = new HashSet<>();


        while (integer != 0) {
            integerSet.add(integer % 10);
            integer /= 10;
        }

        System.out.println(integerSet);

    }
}
