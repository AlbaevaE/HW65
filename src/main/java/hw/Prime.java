package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    public static Integer findPrimeNumber(Integer number) {
        List<Integer> primeList = new ArrayList<>();
        primeList.addAll(Arrays.asList(2, 3));
        Integer initializer = 4;
        while (primeList.size() < number) {
            if (isPrime(initializer, primeList)) {
                primeList.add(initializer);
            }
            initializer++;
        }
        return primeList.get(primeList.size() - 1);
    }

    public static Boolean isPrime(Integer input, List<Integer> primeList) {
        return !(primeList.parallelStream().anyMatch(i -> input % i == 0));
    }
}
