package com.skanderjabouzi;

import java.util.HashMap;
import java.util.Map;

public class StringDS {

    String compress(String s) {
        Character last = ' ';
        Character[] a = new Character[s.length() * 2];
        String result = "";
        int path = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                last = s.charAt(i);
                a[path] = last;
                a[path+1] = Integer.toString(1).charAt(0);
            } else {
                if (last == s.charAt(i)) {
                    a[path+1] = Integer.toString(Character.getNumericValue(a[path+1]) + 1).charAt(0);
                } else {
                    path+=2;
                    last = s.charAt(i);
                    a[path] = last;
                    a[path+1] = Integer.toString(1).charAt(0);
                }
            }
        }


        for(int j = 0; j <= path+1; j++) {
            if (a[j] != '1') result+= a[j];
        }

        return result;
    }

    boolean stringIsUniq(String s) {


        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            System.out.println("Insert " + i + " at pos : " + s.charAt(i) );
            hm.put(s.charAt(i), i);
        }

        System.out.println(" s : " + s.length() + " hm : " + hm.size());

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        return (s.length() == hm.size());
    }

    boolean stringsArePerm(String a, String b) {
        if (a.length() != b.length()) return false;

        return (stringAsciiSum(a) == stringAsciiSum(b));
    }

    int stringAsciiSum(String s) {
        int sum = 0;

        for (int i =0; i < s.length(); i++) {
            sum += (int) s.charAt(i);
        }

        System.out.println(sum);

        return sum;
    }

    String insetUrlSpaceAt(String s, int at) {
        StringBuilder s1 = new StringBuilder(s);

        for (int i = s1.length() - 1; i > at; i--) {
            s1.setCharAt(i, s1.charAt(i - 2));
        }

        s1.replace(at, at + 3, "%20");

        return String.valueOf(s1);
    }

    String urlFy(String s, int len) {

        for (int i = len; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                s = insetUrlSpaceAt(s, i);
            }
        }

        return s;
    }

    boolean isPalindrome(String s) {

        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }

        return true;
    }

    boolean isPalindromePerm(String s) {

        System.out.println("S: " + s);
        if (isPalindrome(s)) return true;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) != ' ') {
                if (Character.toLowerCase(s.charAt(i)) < 'a' || Character.toLowerCase(s.charAt(i)) > 'z') {
                    return false;
                } else {
                    if (hm.get(Character.toLowerCase(s.charAt(i))) == null)
                        hm.put(Character.toLowerCase(s.charAt(i)), 1);
                    else {
                        hm.put(Character.toLowerCase(s.charAt(i)), hm.get(Character.toLowerCase(s.charAt(i))) + 1);
                    }
                }
            }
        }

        int duplicate = 0;
        for (Map.Entry m : hm.entrySet()) {
            if ((int)m.getValue() % 2 == 1) {
                duplicate++;
            }

            if (duplicate > 1) return false;
        }
        return true;
    }

    boolean isOneway(String a , String b) {

        int diff = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (a.length() == b.length()) diff++;
                else if (a.length() < b.length() && a.charAt(i) != b.charAt(i + 1)) diff++;
                else if (a.length() > b.length() && b.charAt(i) != a.charAt(i + 1)) diff++;
            }
        }

        System.out.println(diff);

        return diff <= 1;
    }

}
