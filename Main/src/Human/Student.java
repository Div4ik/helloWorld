package Human;

public class Student extends Human {
    private String group;

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo(){
        System.out.println("Это человек " + super.getName() + " " + group);
    }

}
