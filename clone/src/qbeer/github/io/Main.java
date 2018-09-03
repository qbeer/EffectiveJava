package qbeer.github.io;

public class Main {

    public static void main(String[] args) {

        FaultyStack primary = new FaultyStack();
        FaultyStack secondary;
        secondary = primary.clone();
        primary.push(12);
        primary.push(13);
        primary.push("hello");
        primary.push("arrrrg");
        secondary.push("PUSHED TO SECONDARY");
        // the object array copy is not handled
        System.out.printf("[FAULTY IMPL.] Primary elements == Secondary elements : %s\n",
                primary.getObjectArrayReference().equals(secondary.getObjectArrayReference()));

        ProperStack stack1 = new ProperStack();
        stack1.push(12);
        stack1.push(13);
        stack1.push(15);

        // the object array is copied not just the class itself
        ProperStack stack2 = stack1.clone();
        System.out.printf("[PROPER IMPL.] Primary elements == Secondary elements : %s\n",
                stack1.getObjectArrayReference().equals(stack2.getObjectArrayReference()));

    }
}
