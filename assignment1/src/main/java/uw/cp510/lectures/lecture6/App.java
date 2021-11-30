package uw.cp510.lectures.lecture6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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

    private static void printList(Collection<String> list, String start) {
        for (String item: list) {
            if (item.toLowerCase().startsWith(start.toLowerCase())) {
                System.out.println(item);
            }
        }
    }

    private static void addItems(Collection collection) {
        collection.add("Germany");
        collection.add("France");
        collection.add("Japan");
        collection.add("Australia");
        collection.add("Austria");
        collection.add("Denmark");
        collection.add("Egypt");
        collection.add("Poland");
    }

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        addItems(list);

        List<String> list2 = new LinkedList<>();
        addItems(list2);

        printList(list2);

        System.out.println();
        printList(list, "au");

        File alice = new File("/home/laptop/Documents/alice.txt");
        Set<String> hashSet = new HashSet<>();
        Set<String> hashSet2 = new TreeSet<>();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Map<String, Integer> counter = new TreeMap<>();
        try {
            Scanner myReader = new Scanner(alice);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                String[] words = data.split(" ");
                for (String word: words) {
                    String processed = word.toLowerCase()
                            .replace("\"", "")
                            .replace(";", "")
                            .replace(":", "")
                            .replace("!", "")
                            .replace("@", "")
                            .replace("#", "")
                            .replace("$", "")
                            .replace("%", "")
                            .replace(",", "")
                            .replace("(", "")
                            .replace(")", "")
                            .replace("[", "")
                            .replace("]", "")
                            .replace("“", "")
                            .replace("_", "");
                    if (counter.containsKey(processed)) {
                       Integer count = counter.get(processed);
                       counter.replace(processed, count + 1);
                    } else {
                        counter.put(processed, 1);
                    }
                    System.out.println(word);
                    hashSet.add(word);
                    arrayList.add(word);
                    linkedList.add(word);
                    hashSet2.add(word);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Finsh");
    }
}
