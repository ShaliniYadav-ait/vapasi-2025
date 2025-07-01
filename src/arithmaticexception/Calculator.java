package arithmaticexception;

class Calculator {
    double caldouble(int n) throws MyArithException{
        if (n < 0) {
            throw new MyArithException("Age cannot be negative.");
        } else if (n == 0) {
            throw new MyArithException("Age cannot be zero.");
        }
        return n;
    }
}
