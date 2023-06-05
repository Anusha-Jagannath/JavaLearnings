package exceptionhandling;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning exception handling");

        try {
            int a = 5;
            int b = 4;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fun2();
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fun1();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("finally runs always");
        }

    }

    static void fun1() {
        int a = 5;
        int b = 0;
        int c = a / b;
        System.out.println(c);
    }


    static void fun2() {
        boolean isDanger = true;
        if (isDanger) {
            throw  new ArrayIndexOutOfBoundsException("danger was comming");
        }
    }

    static void fun3() throws ArrayIndexOutOfBoundsException {
        boolean isDanger = true;
        if (isDanger) {
            throw new ArrayIndexOutOfBoundsException("danger was coming");
        }
    }


}
