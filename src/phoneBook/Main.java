package phoneBook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Kate", "89652366525");
        phoneBook.addContact("Anna", "89857452512");
        System.out.println(phoneBook);

        phoneBook.removeContact("Anna");
        System.out.println(phoneBook);
    }
}
