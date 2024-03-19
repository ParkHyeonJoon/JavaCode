package course2.model;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5; // 변수에 final 붙으면 수정 불가라 상수가 된다.
    private BookDTO[] elements;
    private int size = 0;

    // 생성동작
    public BookArray() {
        elements = new BookDTO[DEFAULT_CAPACITY];
    }

    // 저장하는 동작
    public void add(BookDTO element) {
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 데이터 얻는 동작
    public BookDTO get(int index) {
        // index 체크
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index 범위 초과");
        }
        return elements[index];
    }

    // 배열 사이즈 반환
    public int size() {
        return size;
    }

    // 배열 크기 늘림
    public void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

}
