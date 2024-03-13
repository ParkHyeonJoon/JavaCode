package course2.part1;

import course2.model.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr= {5, 3, 9, 1, 7};
        // 메서드 기울어지는 이유는 static이라서...
        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);
        System.out.println("min = " + min + ", max = " + max);
    }
}
