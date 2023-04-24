package GarryPotter;

public class Hogvards {
    private String name;
    private int magic;
    private int transgression;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hogvards(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void printInfo() {
        System.out.printf("%s может колдовать с мощностью %d, " +
                "может трансгрессировать %d м,\n", name, magic, transgression);
    }


    public int getTransgression() {
        return transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
