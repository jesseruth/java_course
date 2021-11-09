package uw.cp510.lectures.lecture4;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("\u0660");
        sb.append("\n");
        sb.append("\u0661");

        sb.append("\n");
        sb.append("\u0662");

        sb.append("\n");
        sb.append("\u0663");

        sb.append("\n");
        sb.append("\u0664");

        sb.append("\n");
        sb.append("\u0665");

        sb.append("\n");
        sb.append("\u0666");
        System.out.println(sb);


        Scanner console = new Scanner(System.in);
        String s = null;
        StringBuilder list = new StringBuilder();
        do {
            if(s != null && s.length() > 0) {
                list.append(s);
                list.append("\n");
            }

            System.out.println("item or n");
            s = console.next();
        } while (!s.equalsIgnoreCase("n"));
        System.out.println(list);

    }
}
