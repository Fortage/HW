package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите вашу фразу");
        Scanner in = new Scanner(System.in);
        String sequence = in.nextLine().toLowerCase(Locale.ROOT);
        in.close();
        String[] words;
        words = sequence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
        {
            if(!map.containsKey(word))
            {
                map.put(word, 1);
            }
            else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);
    }
}
