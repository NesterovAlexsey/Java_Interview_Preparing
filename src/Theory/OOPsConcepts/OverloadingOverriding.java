package Theory.OOPsConcepts;

//Question: Explain method overloading and method overriding.

/**
 * Answer:
 * Method overloading occurs when there are two or more methods
 * in a class with the same name but with different number/type of
 * arguments.
 */

public class OverloadingOverriding {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a) {
        return a + a;
    }

    /**
     * Answer:
     * Method overriding occurs when there is a method in a sub–class
     * that has the same name and number of arguments as a super–
     * class method.
     *
     * In this repository, I go through junior's most likely interview questions collected from various sources.
     */

    public class Animal {
        public void saySomething() {
            System.out.println("I am Animal");
        }
    }

    public class Dog extends Animal {
        @Override
        public void saySomething() {
            System.out.println("I am a dog");
        }
    }
}
