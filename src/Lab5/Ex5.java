package Lab5;

public class Ex5 {

    public static void main(String[] args) {
        String str = "This is a test string";

        System.out.print("The given string is: "+ str +"\n");
        System.out.println("The string reversed word by word is: ");
        String str3 = transformWord(str);
        System.out.println(str3);
    }

    //-------------------------------------------------------------------

    private static String transformWord(String str) {
        String str2 ="";
        String[] str1 = str.split(" ");

        for (String word : str1) {
            StringBuilder builder = new StringBuilder(word);
            String word1 =  builder.reverse().toString();
            str2 = str2 +" "+word1;
        }

        return str2;
    }
}
