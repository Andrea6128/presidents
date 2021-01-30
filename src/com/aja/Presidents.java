package com.aja;

import java.util.*;

public class Presidents {

    // fill up dictionary method
    public Map<Integer, String> fillDictionary() {
        Map<Integer, String> presidents = new LinkedHashMap<>();
        presidents.put(1918, "Tomas Garrigue Masaryk");
        presidents.put(1935, "Edvard Benes");
        presidents.put(1938, "Emil Hacha");
        presidents.put(1948, "Klement Gottwald");
        presidents.put(1953, "Antonin Zapotocky");
        presidents.put(1957, "Antonin Novotny");
        presidents.put(1968, "Ludvik Svoboda");
        presidents.put(1975, "Gustav Husak");
        presidents.put(1989, "Vaclav Havel");
        presidents.put(2003, "Vaclav Klaus");
        presidents.put(2013, "Milos Zeman");
        presidents.put(9999, "last item");
        return presidents;
    }

    public void showResult(Map<Integer, String> presidents, int year) {
        int lastK = -1;
        for (int k : presidents.keySet()) {
            int currentK = k;
            if (year >= lastK && year < k) {
                System.out.println("In the year " + year + ", the president was " + presidents.get(lastK) + " (since " + lastK + ").");
            }
            lastK = currentK;
        }
    }

    // user input method
    public int getYear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a year (1918-2021): ");
        int yearEntered = scan.nextInt();

        if (yearEntered < 1918 || yearEntered > 2021) {
            System.out.println("Wrong entry!");
            System.exit(0);
        }
        return yearEntered;
    }

    public static void main(String[] args) {
        Presidents myClassInstantion = new Presidents();

        int yearEntered = myClassInstantion.getYear();

        Map<Integer, String> presidents = myClassInstantion.fillDictionary();

        myClassInstantion.showResult(presidents, yearEntered);

    }
}