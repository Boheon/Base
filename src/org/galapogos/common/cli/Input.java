package org.galapogos.common.cli;

import java.util.List;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    // Facade Pattern
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue){
        System.out.printf("%s(%s)", title, defaultValue);
        String answer = sc.next();

        return answer.isEmpty() ? defaultValue : answer;

    }

    public static int readInt(String title) {
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine();//엔터 제거를 위해
        return answer;
    }

    public static boolean confirm(String title, boolean defaultValue){
        String yn = defaultValue ? "(Y.N)" : "(y/N)";
        System.out.printf("%s (%s) : ", title, yn);

        String answer = sc.nextLine();
        if(answer.isEmpty()) return defaultValue;

        return answer.equalsIgnoreCase("y");

    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }

    public static <T> T select(String title, List<T> list){
        for(int i = 0; i < list.size(); i++){
            T el = list.get(i);
            System.out.printf("%d) %s\n", (i+1), el);
        }

        int sel = readInt(title);
        return list.get(sel-1);
    }
}
