package section;

public class Book {
    // 1. 속성(변수)
    private String title;
    private String author;

    // 2. 생성자(조립 설명서)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 3. 기능(메서드, 함수)

    /**
     * 더하기 기능
     */
    int add(int num1, int num2) {
        return num1 + num2;
    }

}
