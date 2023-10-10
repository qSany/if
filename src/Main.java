public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний ");


        } else {
            System.out.println("Вы не достигли совершеннолетия , нужно немного подождать");

        }


        System.out.println("Задача2");

        int temp = 4;
        int temp1 = 5;
        if (temp <= 5) {
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp >= 5) {
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 120;

        if (speed > 60) {
            System.out.println("Cкорость = " + speed + ", придется заплатить штраф!");
        } else {
            System.out.println("Cкорость = " + speed + ", можно ехать спокойно.");
        }
        System.out.println("Задача 4");

        int year = 2;
        if (year > 2 && year < 6) {
            System.out.println("Если возраст человека равен " + year + "то ему нужно ходить в садик");
        } else  if (year > 7 && year < 17){
       System.out.println("Если возраст человека равен " + year + "то ему нужно ходить в школу");

        } else if (year > 18 && year < 24) {
            System.out.println("Если возраст человека равен " + year + "то его место в университете");
        } else {

            System.out.println("Если возраст человека равен " + year + "то ему пора ходить на работу");
        }


        System.out.println("Задача 5");
        int year1 = 5;
        if (year1 <= 5 ) {
            System.out.println("Если возраст ребенка равен "+year1+" то ему нельзя кататься на аттракционе");
        } else  if (year1 > 5 && year1 < 14){
            System.out.println("Если возраст ребенка равен "+year1+" можно кататься на аттракционе в сопровождении /");
        } else if (year1 >= 14 ) {
            System.out.println("Если возраст ребенка равен " + year1 + " без сопровождения взрослого");
        }




        System.out.println("Задача 6");

        int total = 102;
        int sitting = 60;
        int standing = total - sitting;
        int busySitting = 50;
        int busyStanding = 42;
        boolean freeSpace = total>(busyStanding+busySitting);
        if(freeSpace){
            System.out.println("В вагоне осталось "+(sitting-busySitting)+" сидячих и "+(standing-busyStanding)+" стоячих мест");
        } else {
            System.out.println("Все места заняты");
        }
        System.out.println();


        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {

            System.out.println("Наибольшие число one");

        } else if (two > three) {
            System.out.println("Наибольшие число two");
        } else
            System.out.println("Наибольшие число three");

    }
}










