package Lab5;

public class Ex1 {

    public static void main(String[] args) {

        // текстовая строка
        String str = "Все счастливые семьи счастливы одинаково, каждая несчастливая семья несчастлива по-своему" ;

        // напечатать текстовую строку
        System.out.println(str+"\n");

        // найти самое длинное слово с строке
        String word2=longestWord(str);

        // напечатать самое длинное слово в строке
        System.out.println("Самое длинное слово в строке: " + word2);

    }

    //------------------------------------------------------
    private static String longestWord(String str) {

        String[] words = str.split(" ");

        int a1, a_max=0;
        String word_max = " ";

        for (String word : words) {
            String word1 = word.replaceAll("(?U)[\\pP\\s]", "");
            a1 = word1.length();

            if (a1 > a_max) {
                a_max = a1;
                word_max = word1;
            }
        }
        return word_max;
    }
}
