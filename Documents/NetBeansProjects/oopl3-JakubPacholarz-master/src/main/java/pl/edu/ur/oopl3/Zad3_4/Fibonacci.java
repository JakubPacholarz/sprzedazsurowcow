package pl.edu.ur.oopl3.Zad3_4;

import pl.edu.ur.oopl3.Interfaces.FibonacciInterface;

/**
 */
public class Fibonacci implements FibonacciInterface {
    @Override
    public int sumOfFicbonacci(int numberOfElement) {
        switch (numberOfElement) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return sumOfFicbonacci(numberOfElement-1)+sumOfFicbonacci(numberOfElement-2);
        }
    }
}
