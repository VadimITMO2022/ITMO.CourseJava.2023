package Lab5;

public class Ex3 {

    public static void main(String[] args) {
        String str = "бяка - это такая бяка. Слово бяка не должно быть в нашей фразе";
        String word = "бяка";
        String replaceWord = "[вырезано цензурой]";

        System.out.println(str);
        String str1=str.replaceAll(word, replaceWord);
        System.out.println(str1);
    }
}
