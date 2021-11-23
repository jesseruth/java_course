package uw.cp510.lectures.lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

    private static void printList(List<String> list) {
//        for (String item: list)
//            System.out.println(item);
        ListIterator<String>
                iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printList(List<String> list, String start) {
        for (String item: list) {
            if (item.toLowerCase().startsWith(start.toLowerCase())) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Germany");
        list.add("France");
        list.add("Japan");
        list.add("Australia");
        list.add("Austria");
        list.add("Denmark");
        list.add("Egypt");
        list.add("Poland");

        List<String> list2 = new LinkedList<>();
        list2.add("Germany");
        list2.add("France");
        list2.add("Japan");
        list2.add("Australia");
        list2.add("Austria");
        list2.add("Denmark");
        list2.add("Egypt");
        list2.add("Poland");

        printList(list2);

        System.out.println();
        printList(list, "au");
    }
}
