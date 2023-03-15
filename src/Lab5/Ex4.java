package Lab5;

public class Ex4 {

    public static void main(String[] args) {

        String str = " Тили-тили, трали-вали, это мы не проходили, это нам не задавали ";
        String substring = "ли";

        int a=countNumber (str, substring);

        System.out.println("Количество вхождений: " + a);
    }

//--------------------------------------------------------------------------------------
    public static int countNumber (String str, String substring) {

        String[] str1 = str.split(substring);
        int a = str1.length - 1;

        return a;
    }

}
