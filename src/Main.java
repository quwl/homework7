public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total += 15000;
            month += 1;
            System.out.println("Месяц " + month + " Сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 2");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12000000;
        int years = 0;
        while (years < 10) {
            population += (population / 1000) * 17;
            population -= 8;
            years++;
            System.out.println("Год " + years + " Численность населения составляет " + population);
        }
        System.out.println("Задание 4");
        int sum = 0;
        int mont = 0;
        int sumNeeded = 12000000;
        int montPercent = 7;
        while (sum <= sumNeeded) {
            sum += 15000 + (sum / 100) * montPercent;
            mont++;
            System.out.println("Сумма накоплений " + sum + " Месяц " + mont);
        }
        System.out.println("Задание 5");
        int sumM = 0;
        int montH = 0;
        while (sumM <= 12000000) {
            sumM += 15000 + (sumM / 100) * 7;
            montH++;
            if (montH % 6 == 0) {
                System.out.println("Сумма накоплений " + sumM + " Месяц " + montH);
            }
        }
        System.out.println("Задание 6");
        int suM = 0;
        int monT = 0;
        int halfYear = 0;
        while (halfYear < 18) {
            suM += 15000 + (suM / 100) * 7;
            monT++;
            if (monT % 6 == 0) {
                halfYear += 1;
                System.out.println("Сумма накоплений " + suM + " полугодие " + halfYear);
            }
        }
        System.out.println("Задание 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт ");
            friday += 7;
        }
        System.out.println("Задание 8");
        int yeaR = 0;
        while (yeaR <= 2124) {
            yeaR += 79;
            if (2024 - yeaR <= 200 && 2024 - yeaR >= -100) {
                System.out.println(yeaR);

            }
        }
    }
}
