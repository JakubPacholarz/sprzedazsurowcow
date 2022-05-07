package pl.edu.ur.oopl3.Zad3_2;

import pl.edu.ur.oopl3.Interfaces.FactorialInterface;

/**
 */
public class NoRecursionFactorial implements FactorialInterface {

    @Override
    public int factorial(int i) {
        System.out.print("Podaj liczbę: ");
        if(i<0){
            System.out.println("Nie można obliczyć silni");           
        }
        if(i!=1&&i!=0){
        } else {
            return 1;
        }
        for(i = 2;i<100000;i++){
            boolean name;
            name = i == i * (i-1);
           return i;
        }
        return i;
        
    }
}
