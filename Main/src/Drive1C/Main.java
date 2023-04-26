package Drive1C;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Person("Андрей", 31, 305353),
                new Person("Дмитрий", 37, 305354),
                new Person("Василий", 33, 305355),
                new Customer("Андрей", 31, 305353, 32325535),
                new Customer("Дмитрий", 37, 305354, 33332323),
                new Customer("Василий", 33, 305355, 3232323),
                new Gamer("Андрей", 31, 305353, "ps"),
                new Gamer("Дмитрий", 37, 305354, "xbox"),
                new Gamer("Василий", 33, 305355, "ps")
        };


        for (Person person: people) {
            System.out.println(person);
        }





    }


}
