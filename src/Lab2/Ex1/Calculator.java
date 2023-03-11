package Lab2.Ex1;

public class Calculator {

    public double add(double x1, double x2) {
        double x3 = x1 + x2;
        return x3;
    }

    public long add(long x1, long x2) {
        long x3 = x1 + x2;
        return x3;
    }

    public int add(int x1, int x2) {
        int x3 = x1 + x2;
        return x3;
    }

    //--------------------------------------------------------------------
    public double subtract(double x1, double x2) {
        double x3 = x1 - x2;
        return x3;
    }

    public long subtract(long x1, long x2) {
        long x3 = x1 - x2;
        return x3;
    }

    public int subtract(int x1, int x2) {
        int x3 = x1 - x2;
        return x3;
    }

    //------------------------------------------------------------------------
    public double multiplicate(double x1, double x2) {
        double x3= x1 * x2;
        return x3;
    }

    public long multiplicate(long x1, long x2) {
        long x3= x1 * x2;
        return x3;
    }

    public int multiplicate(int x1, int x2) {
        int x3= x1 * x2;
        return x3;
    }

    //------------------------------------------------------------------------
    public double divide(double x1, double x2) {
        double x3;
        if(x2 != 0.d)
        {x3= (double)x1 / x2;}
        else
        {
            System.out.println("ERROR не допускается деление на нуль");
            x3 = 99999999999999999d;
        }
        return x3;
    }

    public double divide(long x1, long x2) {
        double x3;
        if(x2 != 0L)
        {x3= (double)x1 / x2;}
        else
        {
            System.out.println("ERROR не допускается деление на нуль");
            x3 = 99999999999999999L;
        }
        return x3;
    }

    public double divide(int x1, int x2) {
        double x3;
        if(x2 != 0)
        {x3= (double)x1 / x2;}
        else
        {
            System.out.println("ERROR не допускается деление на нуль");
            x3 = 99999999999999999d;
        }
        return x3;
    }



}
