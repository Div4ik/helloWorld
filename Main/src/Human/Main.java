package Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Роджер");
        Human teacher = new Teacher("Иван Иванович", "Math");
        Human student = new Student("Валя", "х31");

        human.printInfo();
        teacher.printInfo();
        student.printInfo();
    }
}
