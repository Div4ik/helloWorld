package Book;

import java.util.Objects;

public class Book {
    //�������� ����� Book, ������� �������� � ���� ������ � ��������,
    // ������ � ���� ���������� �����. ���� �����
    // ������ ���� String, Author (��� �� �������� � �. 2) � int.

    private String titleBook;
    private int yearOfPublication;
    private Author nameAuthor;

    public Book(String titleBook, int yearOfPublication, Author nameAuthor) {
        this.titleBook = titleBook;
        this.yearOfPublication = yearOfPublication;
        this.nameAuthor = nameAuthor;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


    public Author getNameAuthor() {
        return nameAuthor;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "�������� �����: '" + titleBook + '\'' +
                ", ��� ����������: " + yearOfPublication +
                ", �����: " + nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getTitleBook(), book.getTitleBook()) && Objects.equals(getNameAuthor(), book.getNameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitleBook(), getNameAuthor());
    }
}
