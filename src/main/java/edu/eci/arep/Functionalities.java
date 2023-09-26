package edu.eci.arep;

public class Functionalities {

    public static void main(String[] args) {

    }

    public static Double cosin(String number) {
        Double convNumber = Double.parseDouble(number);
        return Math.cos(convNumber);
    }

    public static Double sin(String number) {
        Double convNumber = Double.parseDouble(number);
        return Math.sin(convNumber);
    }

    public static Boolean palindrome(String word) {
        Boolean palin = true;
        int len = word.length();
        for (int i = 0; i < (len / 2); ++i) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                palin = false;
            }
        }
        return palin;
    }

    public static Double magnitude(String vector1, String vector2) {
        Double vect1 = Double.parseDouble(vector1);
        Double vect2 = Double.parseDouble(vector2);

        Double result = Math.sqrt(Math.pow(vect1, 2) + Math.pow(vect2, 2));
        return result;
    }

}