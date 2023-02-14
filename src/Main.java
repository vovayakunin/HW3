public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var oneBox = 78.2;
        var twoBox = 82.7;


        var totalWeight = oneBox + twoBox;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг!");

        var difference = twoBox - oneBox;
        System.out.println("Разница между весами бойцов " + difference + " кг!");

        System.out.println("Задание 7");
        var differenceBox = twoBox - oneBox;
        System.out.println("Разница спортсменов " + differenceBox + " кг!");

        var differenceBoxs = twoBox % oneBox;
        System.out.println("Разница спортсменов " + differenceBoxs + " кг!");

        System.out.println("Задание 8");
        var totalHours = 640;
        var onePerson = 8;
        var totalPeople = totalHours / onePerson;
        System.out.println("Всего работников в компании - " + totalPeople + " человек.");

        var newPeople = 94;
        var totalPerson = totalPeople + newPeople;
        var hoursPeople = totalPerson * onePerson;
        System.out.println("Если в компании работает " + totalPerson + " человек, то всего " + hoursPeople + " часов работы может быть поделено между сотрудниками.");


    }

}