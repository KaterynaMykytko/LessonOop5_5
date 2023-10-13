package org.courses.ex5_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendsList = new ArrayList<>();

        friendsList.add("Juliya");
        friendsList.add("Ksenia");
        friendsList.add("Elena");
        friendsList.add("Yurii");
        friendsList.add("Evgenia");
        friendsList.add("Vadim");
        friendsList.add("Anton");
        friendsList.add("Vlad");

        System.out.println(friendsList);

        Collections.sort(friendsList);

        System.out.println(friendsList);

    }
}
