package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> treeSet = new TreeSet<>();
        char ch;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
            while (bufferedReader.ready()) {
                ch = (char) bufferedReader.read();
                if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
                    treeSet.add(Character.toLowerCase(ch));
                }
            }
        }
        int i = 5;
        for (Character c : treeSet) {
            if (treeSet.size() < i) {
                i = treeSet.size();
            }
            System.out.print(c);
            i--;
            if (i == 0) {
                break;
            }
        }
        System.out.println();
    }
}
