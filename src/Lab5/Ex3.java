package Lab5;

public class Ex3 {

    public static void main(String[] args) {
        String str = "бяка - это такая бяка. Слово бяка не должно быть в нашей фразе";
        String word = "бяка";
        String replaceWord = "[вырезано цензурой]";

        String str1 = substitute(str, word, replaceWord);

        System.out.println(str);
        System.out.println(str1);
    }

    //-----------------------------------------------------------------------------------
    public static String substitute(String str, String word, String replaceWord) {

        String str1 = str.replaceAll(word, replaceWord);
        return str1;
    }


}
