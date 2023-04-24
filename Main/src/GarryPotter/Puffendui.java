package GarryPotter;

public class Puffendui extends Hogvards{
    // Студенты Пуффендуя трудолюбивы, верны, честны.
    private int industrious; // трудолюбивы
    private int loyal; // верны
    private int honest; // честны

    public Puffendui(String name, int magic, int transgression, int industrious, int loyal, int honest) {
        super(name, magic, transgression);
        this.industrious = industrious;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("трудолюбив на %d, верны на %d, " +
                "честны на %d \n", industrious, loyal, honest);


    }

    public static void compareStudents (Puffendui student1, Puffendui student2) {
        int sumPoints1 = student1.getMagic() + student1.getTransgression() +
                student1.industrious + student1.loyal + student1.honest;
        int sumPoints2 = student2.getMagic() + student2.getTransgression() +
                student2.industrious + student2.loyal + student2.honest;

        if(sumPoints1 > sumPoints2) {
            System.out.println("Лучший ученик: " + student1.getName());

        } else if(sumPoints2 > sumPoints1) {
            System.out.println("Лучший ученик: " + student2.getName());

        } else {
            System.out.println("Ученики равны по силе!");
        }

    }

    public int getIndustrious() {
        return industrious;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
