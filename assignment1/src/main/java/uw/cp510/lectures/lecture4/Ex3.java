package uw.cp510.lectures.lecture4;

public class Ex3 {

    public static void main(String[] args) {
       String g = "Sku is blur";
       int count = 0;
       while (count < g.length()) {
           if (g.charAt(count) == ' ') {
               System.out.println(g.substring(count + 1));
               break;
           }
           count++;
       }
    }
}
