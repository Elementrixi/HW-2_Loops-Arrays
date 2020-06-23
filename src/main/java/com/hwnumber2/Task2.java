package main.java.com.hwnumber2;

public class Task2 {
    void findDiagon() {
        String[][] arrayStr = {{"a", "a1", "a3", "a4", "a5", "a6"},
                {"b", "b1", "b3", "b4", "b5", "b6"},
                {"c", "c1", "c3", "c4", "c5", "c6"},
                {"d", "d1", "d3", "d4", "d5", "d6"},
                {"e", "e1", "e3", "e4", "e5", "e6"},
                {"f", "f1", "f3", "f4", "f5", "f6"}};
        System.out.println("Part 2: ");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i][i] + " ");
        }
    }
}
