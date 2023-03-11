package Lab2.Ex1;

public class Main {

    public static void main(String[] args) {
        Calculator calcul = new Calculator();

        double xd1 =4.65d;
        double xd2 = -3.31d;


        long xl1 = 29284579L;
        long xl2 = -32848284L;

        int xi1= 25;
        int xi2 = -36;

        System.out.println("Начальные данные:");
        System.out.println("   " + xd1+ "     " +xl1+"      " +  xi1);
        System.out.println("   " + xd2+ "     " +xl2+"      " +  xi2);
        System.out.println("  ");

        double a1= calcul.add(xd1, xd2);
        long a2= calcul.add(xl1, xl2);
        int a3= calcul.add(xi1, xi2);
        System.out.println("Cложение:   " + a1+ "   " +a2+"   "+ a3);


        double b1= calcul.subtract(xd1, xd2);
        long b2= calcul.subtract(xl1, xl2);
        int b3= calcul.subtract(xi1, xi2);
        System.out.println("Вычитание:   " + b1+ "   " +b2+"   "+ b3);

        double c1= calcul.multiplicate(xd1, xd2);
        long c2= calcul.multiplicate(xl1, xl2);
        int c3= calcul.multiplicate(xi1, xi2);
        System.out.println("Умножение:   " + c1+ "   " +c2+"   "+ c3);

        double d1= calcul.divide(xd1, xd2);
        double d2= calcul.divide(xl1, xl2);
        double d3= calcul.divide(xi1, xi2);
        System.out.println("Деление:   " + d1+ "   " +d2+"   "+ d3);



    }

}
