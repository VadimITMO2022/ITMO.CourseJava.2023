package Lab10;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Ex1
        String file1 = "files/file1.txt";
        List<String> listString = readAsList(file1);
        System.out.println(listString);

        //Ex2
        String file2 = "files/file2.txt";
        String str = "каждая несчастливая семья несчастлива по-своему";
        writeInFile(str, file2);


       // Ex3
        String file3 = "files/file3.txt";
        mergeTwoFiles(file1, file2, file3);


        // Ex4
        String file4 = "files/file4.txt";
        String file5 = "files/file5.txt";
        changeTo$(file4, file5);

    }

    //---------------------------------------------------------------------------

    //-Ex1------метод читает текстовый файл и возвращает его в виде списка строк
    public static List<String> readAsList(String file) {
        List<String> listString = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                listString.add(str);
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        return listString;
    }

    //-Ex2----метод записывает в файл fail строку str, переданную параметром

    public static void writeInFile(String str, String file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //-Ex3-------метод склеивает два текстовый файла file1 и file2 в один файл file3

    public static void mergeTwoFiles(String file1, String file2, String file3) {
        List<String> listString1 = readAsList(file1);
        StringBuilder builder1 = new StringBuilder();
        for (String line1 : listString1) {
            builder1.append(line1);
        }
        String str1=builder1.toString();

        List<String> listString2 = readAsList(file2);
        StringBuilder builder2 = new StringBuilder();
        for (String line2 : listString2) {
            builder2.append(line2);
        }
        String str2=builder2.toString();

        String str3= str1+"\n"+str2;
        writeInFile(str3, file3);
    }


    //-Ex4-метод заменяет в файле file4 все кроме букв и цифр на знак ‘$’ и записывает в file5
    public static void changeTo$(String file4, String file5) {
        List<String> stringList = readAsList(file4);
        StringBuilder builder = new StringBuilder();
        String changedLine;

        for (String line : stringList) {
            changedLine = line.replaceAll("[^а-яА-Яa-zA-Z0-9]",
                    "\\$");
            builder.append(changedLine);
        }

        String str =builder.toString();
        writeInFile(str, file5);
    }
}
