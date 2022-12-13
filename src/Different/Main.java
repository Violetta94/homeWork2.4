package Different;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Set<ClassAiB> classAiBS = new HashSet<>();

        while (classAiBS.size() < 15) {
            ClassAiB classAiB = new ClassAiB(random.nextInt(10), random.nextInt(10));
            classAiBS.add(classAiB);
            System.out.println(classAiB);
        }

        Set<Passport> passports = new HashSet<>();
        passports.add( new Passport("4526","Lad","Vanil","Vaniella", LocalDate.now().minusYears(24)));
        passports.add( new Passport("4525","Lad","Vanil","Vaniella",  LocalDate.now().minusYears(24)));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }
}
