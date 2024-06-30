import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println( " Задача 1");
        int age = 17;
        if (age > 17) {
            System.out.println(" Если возраст человека равен " + age + " он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println( " Задача 2");
        int temper = 4;
        if (temper < 5) {
            System.out.println("На улице " + temper + " градусов, на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temper + " градусов, на улице тепло, можно идти без шапки");
        }

        System.out.println( " Задача 3");
        int speed = 70;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        }

        System.out.println( " Задача 4");
        int agePerson = 2;
        if (agePerson >= 2 && agePerson<=6){
            System.out.println(" Если возраст человека равен " + agePerson + " то ему нужно ходить в сад");
        } else if (agePerson >= 7 && agePerson<=17){
            System.out.println(" Если возраст человека равен " + agePerson + " то ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson <=24 ){
            System.out.println(" Если возраст человека равен " + agePerson + " то ему нужно ходить в университет");
        } else if (agePerson > 24) {
            System.out.println(" Если возраст человека равен " + agePerson + " то ему нужно ходить на работу");
        } else {
            System.out.println(" Будь с мамочкой");
        }

        System.out.println( " Задача 5");

int ageAtrakcion=9;

if(ageAtrakcion<5) {
    System.out.println(" Если возраст ребенка равен " + ageAtrakcion + " ,то ему нельзя кататься.");

} else if (ageAtrakcion>5&& ageAtrakcion<14 ) {
    System.out.println(" Если возраст ребенка равен " + ageAtrakcion + " ,то ему можно каться в сопровождении взрослого.");
} else if (ageAtrakcion>14 )  {
    System.out.println(" Если возраст ребенка равен " + ageAtrakcion + " ,то ему можно кататься без сопровождения взрослого.");

}
        System.out.println( " Задача#7");


        int one = 1;
        int two = 4;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее число.");
        } else if (one < two && two<three ) {
            System.out.println("Число " + three + " наибольшее число.");
        } else if ( one<two&&two>three ) {
            System.out.println("Число " + two + " наибольшее число.");
        } else {

            System.out.println( "Числа равны.");
        }
    }

    }
