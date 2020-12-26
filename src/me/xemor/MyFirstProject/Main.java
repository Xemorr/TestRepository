package me.xemor.MyFirstProject;

/** Write your code here **/
public class Main
{

    public static void main(String[] args) {
        System.out.println(Main.myPow(2, 3));
    }

    public static double myPow(double x, int n) {
        return myPow(x, n, 0);
    }

    public static double myPow(double x, int n, int currentIteration) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            return 1.0 / x;
        }
        double previousPower = myPow(x, n/2, currentIteration + 1);
        double currentValue = previousPower * previousPower;
        if (Math.floorMod(n, 2) == 1) {
            if (n > 0) {
                currentValue *= x;
            }
            else {
                currentValue /= x;
            }
        }
        return currentValue;
    }
}