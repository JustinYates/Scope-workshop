package com.company;

public class Main {
    String membervariable = "i am a member variable, i have class level scope";
    Main.main = new Main();

    public static void main(String[] args) {


    }

    private void aMethod() {
        String localvariable = "i am a local variable i can only ber used in this variable";
        System.out.println("inside first method");
        System.out.println(membervariable);
        System.out.println(localvariable);
        private void anothermethod () {
            System.out.println("inside second method");
        }

    }

    private void methodForLoopVariables() {
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

    private void membersVsLocalVariables() {

        int localInt = 7;

        localInt *= 2;
        memberInt *= 2;
        if (count <= 2) {
            System.out.println("memberInt *= 2" + memberInt);
            System.out.println("localInt *= 2" + localInt);
            Count++;

        }
    }
}

