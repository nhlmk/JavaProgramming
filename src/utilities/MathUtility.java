package utilities;

public class MathUtility {


    // returns sum of two integers.
    public static int sum(int a, int b){
        return a+b;
    }

    // returns sum of two decimals.
    public static double sum(double a, double b){
        return a+b;
    }

    // return subtraction of two integers.
    public static int subtraction(int a, int b){
        return a-b;
    }

    // return subtraction of two decimals.
    public static double subtraction(double a, double b){
        return a-b;
    }

    // return multiplication of two integers.
    public static int multiplication (int a, int b){
        return a*b;
    }

    // return multiplication of two decimals.
    public static double multiplication (double a, double b){
        return a*b;
    }

    // return division of two decimals.
    public static double division (double a, double b){
        return a/b;
    }

    // is an integer even or not.
    public static boolean isEven(int a){
        boolean result = false;
        if(a%2==0){
            result = true;
        }
        return result;
    }

    // is an integer even or not.
    public static boolean isOdd(int a){
        boolean result = false;
        if(a%2!=0){
            result = true;
        }
        return result;
    }

    // maximum number between two integers.
    public static int max(int a, int b){
        int max = 0;
        if(a>b){
            a=max;
        }else{
            b=max;
        }
        return max;
    }

    // maximum number between two decimals.
    public static double max(double a, double b){
        double max = 0;
        if(a>b){
            a=max;
        }else{
            b=max;
        }
        return max;
    }

    // minumun number between two integers.
    public static int min(int a, int b){
        int min = 0;
        if(a<b){
            a=min;
        }else{
            b=min;
        }
        return min;
    }

    // minimum number between two decimals.
    public static double min(double a, double b){
        int min = 0;
        if(a<b){
            a=min;
        }else{
            b=min;
        }
        return min;
    }

    // return the square of an integer.
    public static int square(int a){
        return a*a;
    }

    // return the square of a decimal.
    public static double square(double a){
        return a*a;
    }

    // return the cube of an integer.
    public static int cube(int a){
        return a*a*a;
    }

    // return the cube of a decimal.
    public static double cube(double a){
        return a*a;
    }

}
