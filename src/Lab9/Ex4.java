package Lab9;


import java.util.*;

public class Ex4 {
    public static void main(String[] args) {

        Map<User, Integer> map = new LinkedHashMap<>();

        User us1 = new User("Маша");
        User us2 = new User("Паша");
        User us3 = new User("Саша");
        User us4 = new User("Витя");
        User us5 = new User("Оля");
        User us6 = new User("Даша");

        map.put(us1, 12);
        map.put(us2, 7);
        map.put(us3, 8);
        map.put(us4, 12);
        map.put(us5, 7);
        map.put(us6, 8);

       // вывести всех пользователей на печать
        String str= printInfo(map);
        System.out.println();

        // введите имя пользователя
        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // узнайте число очков у этого пользователя
        Integer points = getPoints(name, map);

    }

    //------------------------------------------------------------------------
    public static String printInfo(Map<User, Integer> map) {
        System.out.println("Список игроков:");
        int k= 0;
         for (User user : map.keySet()) {
            k=k+1;
            String name = user.getName();
            int points = map.get(user);
            System.out.println(name + "   " + points);
        }
        String str = "число игроков: " + k;
        System.out.println(str);
        return str;
    }

    //------------------------------------------------------------------------
    public static Integer getPoints(String name, Map<User, Integer> map) {

        Integer points = null;
        for (User user : map.keySet()) {
            String name1 = user.getName();

            if (name1.equals(name)) {
                points = map.get(user);
                break;
            }
        }

        if(points != null) {
            System.out.println("Имя пользователя: " + name);
            System.out.println("Количество очков: " + points);}
        else System.out.println("Пользователя с таким именем не существует");

        return points;
    }
}

