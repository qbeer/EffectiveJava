package qbeer.github.io;

public class Main {

    public static void main(String[] args) {

        int size = 10;

        System.out.println(--size);
        System.out.println(size++);
        System.out.println(size--);
        System.out.println(--size);

        Stack stack = new Stack();
        for(int i = 0; i < 100; i++) {
            stack.push(i);
        }

        for(int i = 0; i < 15; i++) {
            System.out.println(stack.pop());
        }

    }
}
