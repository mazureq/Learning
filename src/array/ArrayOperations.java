package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

        double theAverage = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average().getAsDouble();
        System.out.println(theAverage);
        return theAverage;
    }
}
