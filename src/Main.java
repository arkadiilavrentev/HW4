public class Main {
    public static void main(String[] args) {

        // Задача 1
        {
            System.out.println("Задача 1");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (int j = 10; j > 0; j--)
                System.out.print(j + " ");
            System.out.println("");
            System.out.println("");
        }
        // Задача 2

        System.out.println("Задача 2");
        int firstFriday = 6;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчёт.");
            firstFriday += 7;
        }
        System.out.println("");

        // Задача 3

        System.out.println("Задача 3");
        int actualYear = 2021;
        int firstComet = actualYear - 200;
        while (firstComet % 79 != 0)
            firstComet++;
        System.out.println(firstComet);
        while (firstComet < actualYear) {
            firstComet += 79;
            System.out.println(firstComet);
        }
        System.out.println("");

        // Задача 4

        System.out.println("Задача 4");
        for (int i = 1; i <= 30; i++){
            System.out.print(i + ": ");
            if (i % 3 == 0){
                System.out.print("ping ");
            }
            if (i % 5 == 0){
                System.out.print("pong ");
            }
            System.out.println();
        }
        System.out.println("");

        // Задача 5

        System.out.println("Задача 5");
        int a1 = 0;
        System.out.print(a1 + " ");
        int a2 = 1;
        System.out.print(a2 + " ");
        int a3 = a1 + a2;
        for (int j = 0; j < 8; j ++){
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
        }
    }
}