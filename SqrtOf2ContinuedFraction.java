// Task: Compute square root of 2 using its "continued fraction" representation.
// Recursion is used.
public class SqrtOf2ContinuedFraction {
     public static int recursiveMethod(int i, double value) {        
        if(i == 0) {  
            value--;
            System.out.printf("sqrt(2) = %.5f (limited to six s.f.)\n", value);
        }
        else {
            value = 2.0+1.0/value;
            recursiveMethod(--i, value);
        }
        return 0;
    }
    public static void main(String args[]) {         
       int a = recursiveMethod(10, 1.0);  // only 10 iterations is anough.
    }
}