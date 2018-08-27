package binaryconverter;

public class Binary {
    
    public int binaryToDecimal (int number, int length) {
        
        //imports exponent class
        Exponent exponent = new Exponent();
        
        //isolates each digit by making truncating double to int
        double truncateFactor = exponent.power(10, length-1);
        double modifiedNumber = number;
        
        //each bit will have its own index
        int[] array;
        array = new int[length];
        
        int factor = 0;
        int result = 0;
        
        //isolates each digit then plugs into array
        for (int i = length; i > 0; i--) {
            
            modifiedNumber = number / truncateFactor;
            
            modifiedNumber = (int)modifiedNumber;
            
            //store in array
            array[i - 1] = (int)modifiedNumber;
            
            modifiedNumber *= truncateFactor;
            number -= modifiedNumber;
            truncateFactor /= 10;
                 
        }
        
        //Takes values in array and uses base: 2, exp: index
        for (int j = 0; j < length; j++) {
            
            factor = array[j] * exponent.power(2,j);
            result += factor;
            
        }
        
        return (int)result;
       
    }
    
}
