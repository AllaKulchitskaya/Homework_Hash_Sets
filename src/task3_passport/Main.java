package task3_passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат задачи 3 (дз 3):");
        System.out.println();
        Passport passport1 = new Passport("763975", "Петров", "Иван",
                "Антонович", LocalDate.now().minusYears(38));
        Passport passport2 = new Passport("284028", "Круглов", "Валерий",
                "Васильевич", LocalDate.now().minusYears(48));
        Passport passport3 = new Passport("187394", "Токорева", "Ирина",
                "Владимировна", LocalDate.now().minusYears(25));
        Set<Passport> passports = new HashSet<>();
        passports.add(passport1);
        passports.add(passport2);
        passports.add(passport3);
        PassportDataBase passportDataBase = new PassportDataBase(passports);

        System.out.println(passportDataBase);
    }
}
