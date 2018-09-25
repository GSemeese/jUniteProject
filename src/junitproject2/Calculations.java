
package junitproject2;

public class Calculations {
    
    public int sum(int a, int b){
        return a+b;
    }
    
    public float divide(int a, int b){
        if(a == 0){
            return 0;
        }
        if(b == 0){
            return 0;
        }
        return new Float(a/b);
    }
    
    public int substract(int a, int b){
        return a - b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
    
    public int modulo(int a, int b){
        return a%b;
    }
}
