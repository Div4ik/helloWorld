package Book;

public class Main {
    public static void main(String[] args) {


        Author tolstoy = new Author("���", "�������");
        Author pushkin = new Author("���������", "������");

        Book warAndPeace = new Book("����� � ���", 1851, tolstoy);
        Book fishermanAndFish = new Book("������ � ������ � �����", 1835, pushkin);

        warAndPeace.setYearOfPublication(1861);

        System.out.println(pushkin);
        System.out.println(pushkin.toString());
        System.out.println(warAndPeace);
        System.out.println(fishermanAndFish);
    }
}
