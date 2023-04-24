package GarryPotter;

import java.util.Objects;

public class Griffindor extends Hogvards{
    // Всем Гриффиндорцам присущи благородство, честь и храбрость Реализуйте 4 метода,
    // по одному для каждого факультета, которые сравнивают между собой двух учеников
    // одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы
    // по каждому свойству, которое присуще ученику данного факультета. Тот ученик,
    // у которого сумма свойств больше, считается лучшим учеником.

    private int nobility;  // благородство
    private int honor;  // честь
    private int bravery;  // отвага

    public Griffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareStudents (Griffindor student1, Griffindor student2) {
        int sumPoints1 = student1.getMagic() + student1.getTransgression() +
                student1.bravery + student1.honor + student1.nobility;
        int sumPoints2 = student2.getMagic() + student2.getTransgression() +
                student2.bravery + student2.honor + student2.nobility;

        if(sumPoints1 > sumPoints2) {
            System.out.println("Лучший ученик: " + student1.getName());

        } else if(sumPoints2 > sumPoints1) {
            System.out.println("Лучший ученик: " + student2.getName());

        } else {
            System.out.println("Ученики равны по силе!");
        }

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("благороден на %d, обладает честью в %d, " +
                "отважен на %d \n", bravery, nobility, honor);


    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }









}
