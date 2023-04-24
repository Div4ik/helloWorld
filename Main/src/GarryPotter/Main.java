package GarryPotter;

public class Main {
    public static void main(String[] args) {
        Griffindor garryPotter = new Griffindor("Гарри Поттер", 5,3,2,1, 45);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер" ,100,40,30,20,40);
        Griffindor.compareStudents(garryPotter, hermioneGranger);
        garryPotter.printInfo();


        Slizerine dracoMalfoy = new Slizerine("Драко Малфой", 30, 80, 80,
                30, 50 ,70, 38);

        Slizerine grahamMontague = new Slizerine("Грэхэм Монтегю", 30, 40, 50,
                70, 30, 20,11);

        Slizerine.compareStudents(dracoMalfoy, grahamMontague);

        grahamMontague.printInfo();

        // На факультет Пуффендуй учатся "Захария Смит", "Седрик Диггори", "Джастин Финч-Флетчли".

        Puffendui zachariasSmith = new Puffendui("Захария Смит",30, 40,50, 30, 20);
        Puffendui cedricDiggory = new Puffendui("Седрик Диггори",50,40,30, 20, 30);
        Puffendui justinFinchFletchley = new Puffendui("Джастин Финч-Флетчли",99,30,99, 20, 30);
        Puffendui.compareStudents(zachariasSmith, cedricDiggory);
        justinFinchFletchley.printInfo();


        // На факультете Когтевран учится Чжоу Чанг и Маркус Белби

        Kogtevran zhouChang = new Kogtevran("Чжоу Чанг", 31, 100, 30, 15, 15, 30);
        Kogtevran marcusBelby = new Kogtevran("Чжоу Чанг", 31, 100, 30, 15, 15, 30);

        Kogtevran.compareStudents(zhouChang, marcusBelby);

        zhouChang.printInfo();

    }
}
