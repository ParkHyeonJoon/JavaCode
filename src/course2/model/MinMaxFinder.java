package course2.model;

public class MinMaxFinder {
    // 의도적으로 다른 클래스에서 생성자 선언 하지 못하게
    //private MinMaxFinder() { }

    // static 선언한 메서드는 다른 클래스에서 사용할 때
    // 클래스 이름.메서드명() 으로 사용 가능
    public static int findMin(int[] arr) {
        int min = arr[0]; // 초기값
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // 초기값
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
