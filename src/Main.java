public class Main {

    // Scope describes the accessibility of a variable.
    // 'in scope' means a variable can be used by an executing block or any nested blocks.
    // 'out of scope' means the variable is no longer available
    // Local variable are always in scope, in the block they are declared
    // They are also in scope for any nested blocks or blocks contained within the outer block


    public static void main(String[] args) { // starts on outer block - like the method block here

        int firstVariable = 1;
        int secondVariable = 2;

        if (firstVariable > 0) { //flow statement block starts inner block

            // inner block code has access to outer block's variables
            System.out.println(secondVariable);
        }
    }



    // Local variable are always out of scope for outer blocks, or the containing blocks they are declared in
    public static void aMethod(boolean aBoolean){

        if (aBoolean) {
            int myCounter = 10;  // myCounter is local to this if block
        }
        System.out.println(myCounter); // myCounter is out of scope here
    }


    // It is considered best practice:
    // To declare and initialize variables in the same place if possible
    // And to declare variables in the narrowest scope


}