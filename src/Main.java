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
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
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
        while (sum <= 12000000) {
            sum += 15000 + (sum / 100) * 7;
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
        int year = 0;
        while (year <= 2124) {
            year += 79;
            if (2024 - year <= 200 && 2024 - year >= -100) {
                System.out.println(year);

            }
        }
    }
}
