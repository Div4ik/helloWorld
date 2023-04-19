package Book;

public class Main {
    public static void main(String[] args) {


        Author tolstoy = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book warAndPeace = new Book("Война и мир", 1851, tolstoy);
        Book fishermanAndFish = new Book("Сказка о рыбаке и рыбке", 1835, pushkin);

        warAndPeace.setYearOfPublication(1861);

        System.out.println(pushkin);
        System.out.println(pushkin.toString());
        System.out.println(warAndPeace);
        System.out.println(fishermanAndFish);
    }
}
