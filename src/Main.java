class Hogwarts {
    String name;
    int age;
    int courage;
    int intelligence;
    int kindness;
    int ambition;
    int magicPower;
    int transgressionDistance;

    public Hogwarts(String name, int age) {
        this.name = name;
        this.age = age;
        this.courage = 0;
        this.intelligence = 0;
        this.kindness = 0;
        this.ambition = 0;
    }

    public void description() {
        System.out.println("Студент: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Мужественность: " + courage);
        System.out.println("Умность: " + intelligence);
        System.out.println("Доброта: " + kindness);
        System.out.println("Амбиции: " + ambition);
        System.out.println("Сила магии: " + magicPower); // Добавлено
        System.out.println("Расстояние трансгрессии: " + transgressionDistance); // Добавлено
    }

    public int calculateTotalScore() {
        return courage + intelligence + kindness + ambition;
    }

    public void compareStudents(Hogwarts student1, Hogwarts student2) {
        int totalScore1 = student1.calculateTotalScore();
        int totalScore2 = student2.calculateTotalScore();

        if (totalScore1 > totalScore2) {
            System.out.println(student1.name + " является лучшим студентом.");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2.name + " является лучшим студентом.");
        } else {
            System.out.println("У студентов " + student1.name + " и " + student2.name + " одинаковый суммарный балл.");
        }
    }

    public void compareMagicAndTransgression(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower && student1.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student1.name + " лучше " + student2.name);
        } else if (student1.magicPower < student2.magicPower && student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(student2.name + " лучше " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны");
        }
    }
}

class Gryffindor extends Hogwarts {
    public Gryffindor(String name, int age, int courage, int magicPower, int transgressionDistance) {
        super(name, age);
        this.courage = courage;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
}

class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int age, int intelligence, int magicPower, int transgressionDistance) {
        super(name, age);
        this.intelligence = intelligence;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
}

class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int age, int kindness, int magicPower, int transgressionDistance) {
        super(name, age);
        this.kindness = kindness;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
}

class Slytherin extends Hogwarts {
    public Slytherin(String name, int age, int ambition, int magicPower, int transgressionDistance) {
        super(name, age);
        this.ambition = ambition;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
}

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", 17, 90, 100, 200);
        Ravenclaw hermione = new Ravenclaw("Гермиона", 17, 95, 120, 150);
        Hufflepuff ron = new Hufflepuff("Рон", 17, 80, 80, 250);
        Slytherin draco = new Slytherin("Драко", 17, 85, 110, 180);

        Hogwarts hogwarts = new Hogwarts("Тестовый студент", 0);

        System.out.println("Описание студентов:");
        hogwarts.description();
        System.out.println();

        harry.description();
        System.out.println();
        hermione.description();
        System.out.println();
        ron.description();
        System.out.println();
        draco.description();
        System.out.println();

        System.out.println("Сравнение студентов по общему баллу:");
        hogwarts.compareStudents(harry, hermione);
        hogwarts.compareStudents(ron, draco);
        System.out.println();

        System.out.println("Сравнение студентов по силе магии и расстоянию трансгрессии:");
        hogwarts.compareMagicAndTransgression(harry, ron);
        hogwarts.compareMagicAndTransgression(hermione, draco);
    }
}