package GarryPotter;

public class Slizerine extends Hogvards {
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustOfPower; // жажда власти

    public Slizerine(String name, int magic, int transgression, int cunning,
                     int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public static void compareStudents (Slizerine student1, Slizerine student2) {

        int sumPoints1 = student1.getMagic() + student1.getTransgression() +
                student1.cunning + student1.determination + student1.ambition +
                student1.resourcefulness + student1.lustOfPower;

        int sumPoints2 = student2.getMagic() + student2.getTransgression() +
                student2.cunning + student2.determination + student2.ambition +
                student2.resourcefulness + student2.lustOfPower;

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
        System.out.printf("Хитер на %d, решителен %d, " +
                "амбициозен на %d, находчив на %d, имеет жажду власти %d \n",
                cunning, determination, ambition, resourcefulness, lustOfPower);

    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

}
