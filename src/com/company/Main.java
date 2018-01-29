package com.company;

public class Main {
    String membervariable = "i am a member variable, i have class level scope";
    Main main = new Main();
    main.aMethod

    public static void main(String[] args) {


    }

    private void aMethod() {
        String localvariable = "i am a local variable i can only ber used in this variable";
        System.out.println("inside first method");
        System.out.println(membervariable);
        System.out.println(localvariable);
        private void anothermethod() {
            System.out.println("inside second method");
        }

    }
    private void methodForLoopVariables () {
        String localVariable = "just another member variable inside our main loop";
        System.out.print(localVariable);
        boolean runDoLoop = true;
        do {
            String loopVariable = "i am a loop variable inside of our do while loop";
            System.out.println("inside our do while loop:");
            System.out.println(localVariable);
            runDoLoop = false;
        } while (runDoLoop);
        System.out.println("inside thirf method, just outside do while loop");
        System.out.println(localVariable);
        System.out.println();


    }
}

