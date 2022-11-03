package CollectionsPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integerSet = new HashSet<>();
        String[] arr=("1, 2, 77, 4, 4, 5".replace(" ","").split(","));
        for (String i:arr) {
            integerSet.add(Integer.parseInt(i));
        }
        System.out.println(integerSet);
//
//        Integer integer = scanner.nextInt();
//
//        Set<Integer> integerSet = new HashSet<>();
//
//        while (integer != 0) {
//            integerSet.add(integer % 10);
//            integer /= 10;
//        }
//
//        System.out.println(integerSet);

    }
}
