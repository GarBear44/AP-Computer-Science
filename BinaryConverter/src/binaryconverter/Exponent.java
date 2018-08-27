package binaryconverter;

//Math library was not working correctly so I made the method manually

public class Exponent {
    
    static int power (int base, int exponent) {
        
        int result = base;
        
        if (exponent != 0) {
            
            //Multiplies answer by base
            
            for (int i = exponent-1; i > 0; i--) {
                
                result *= base;
                
            }
            
            return result;
            
        }
        //Anything to the 0 power is 1
        else {
            
            return 1;
            
        }
    }    
}
