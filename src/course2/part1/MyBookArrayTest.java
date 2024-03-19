package course2.part1;

import course2.model.BookArray;
import course2.model.BookDTO;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new BookDTO("자바", 150000, "한빛", "홍길동"));
        list.add(new BookDTO("C++", 170000, "한빛", "길동"));
        list.add(new BookDTO("Python", 160000, "한빛", "동"));

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
