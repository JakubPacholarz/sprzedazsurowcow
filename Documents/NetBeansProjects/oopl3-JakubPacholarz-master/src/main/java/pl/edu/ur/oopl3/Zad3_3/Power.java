package pl.edu.ur.oopl3.Zad3_3;

import pl.edu.ur.oopl3.Interfaces.PowerInterface;

/**
 */
public class Power implements PowerInterface {

    @Override
    public double recursionPow(double a, double b) {
        if(b == 0)
            return 1;
        return a * recursionPow(a,  --b);
        }
    }

    @Override
    public double noRecursionPow(double a, double b) {
        return 0;
    }
}
