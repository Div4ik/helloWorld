package GarryPotter;

public class Kogtevran extends Hogvards{
    // Когтевранцы умны, мудры, остроумны и полны творчества.

    private int mind;// умны
    private int wisdom; // мудры
    private int wit; // остроумны
    private int creativity; // полны творчества

    public Kogtevran(String name, int magic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("умен на %d, обладает мудростью на %d, " +
                "остроумен на %d, креативен \n", mind, wisdom, wit, creativity);


    }

    public static void compareStudents (Kogtevran student1, Kogtevran student2) {
        int sumPoints1 = student1.getMagic() + student1.getTransgression() +
                student1.mind + student1.wisdom + student1.wit + student1.creativity;
        int sumPoints2 = student2.getMagic() + student2.getTransgression() +
                student2.mind + student2.wisdom + student2.wit + student1.creativity;

        if(sumPoints1 > sumPoints2) {
            System.out.println("Лучший ученик: " + student1.getName());

        } else if(sumPoints2 > sumPoints1) {
            System.out.println("Лучший ученик: " + student2.getName());

        } else {
            System.out.println("Ученики равны по силе!");
        }

    }


    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
