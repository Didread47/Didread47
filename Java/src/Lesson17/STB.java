package Lesson17;

import java.sql.SQLOutput;

public class STB {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hi, babyi!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("!",2));
        String s = sb2.substring(5);
        System.out.println(s);
        System.out.println(sb2.subSequence(4,10));
        System.out.println(sb2.append("TRUE"));
        System.out.println(sb2.insert(4,"55"));
        StringBuilder st12 = new StringBuilder("Всем привет!");
        st12.replace(4,13, " Вантуз!");
        System.out.println(st12);
        System.out.println(st12.capacity());










    }
}
