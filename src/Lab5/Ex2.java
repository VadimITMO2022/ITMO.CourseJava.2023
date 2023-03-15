package Lab5;

public class Ex2 {

    public static void main(String[] args) {

// Фраза
        String str = "Лилипут сома на мосту пилил";
        // Палиндром или нет - True or false
        boolean b1 =isTest(str);
        System.out.println("Фраза \"" + str + "\" " + (b1 ? " - " : " не") + " палиндром");
    }

    public static boolean isTest(String str) {
        String str1 = str.toLowerCase();
        String str2 = str1.replaceAll("(?U)[\\pP\\s]", "");
        StringBuilder builder = new StringBuilder(str2);
        String str3 = builder.reverse().toString();
        boolean b=str2.equals(str3);
        return b;
    }
}
