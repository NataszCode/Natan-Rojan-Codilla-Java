package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException, ChildException {
        if (a > b) {
            throw new ChildException("Za duża różnica");
        }
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        // TODO try catch finally
//        try {
//            throwableMethod();
//        } catch (ChildException exception) {
//            System.out.println("ERROR THROWS CHILD EXCEPTION WITH MESSAGE: "+ exception.getMessage());
//        } catch (Exception exception) {
//            System.out.println("ERROR THROWS GENERAL EXCEPTION WITH MESSAGE: "+ exception.getMessage());
//        } finally {
//            System.out.println("ENDS EVERYTIME");
//        }


        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Exception:"+exception.getMessage());
        } catch (ChildException exception) {
            System.out.println("ChildException:"+exception.getMessage());
        } finally {
            System.out.println("FINISHED");
        }
    }
    static class ChildException extends Exception {
        public ChildException(String msg) {
            super("ChildException:"+msg);
        }
    }
}

