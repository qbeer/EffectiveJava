package qbeer.github.io;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        MobileNumber alex = new MobileNumber(20, 5880655);
        MobileNumber sarah = new MobileNumber(30, 8750164);

        HashMap<MobileNumber, String> contacts = new HashMap<>();
        contacts.put(alex, "Alex");
        contacts.put(sarah, "Sára");

        System.out.println(contacts.containsKey(new MobileNumber(20, 5880655)));
        System.out.println(contacts.containsValue("Alex"));

        System.out.println(alex.equals(sarah));
        System.out.println(alex.equals(new MobileNumber(20, 5880655)));
        System.out.println(sarah.equals(new MobileNumber(20, 3412342)));

        System.out.println("\nContact list: ");
        contacts.forEach((mobileNumber, name) -> {
            System.out.println(name + " " + mobileNumber);
        });

    }
}
