
package Exceptions;

public class LimiteCharException extends RuntimeException{
    public int i;
    public LimiteCharException(int i) {
        this.i = i;
    }
    
}
