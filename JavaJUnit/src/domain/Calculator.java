package domain;

public class Calculator {
   
    public static double discount(double cost, int discount) {        
        return cost - ((cost * discount) / 100);
    }
    
    // constructor
    public Calculator() {
    }
    
}
