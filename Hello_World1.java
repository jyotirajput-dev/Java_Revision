package Practice1;
/*
Package: Practice1
A package in Java is used to organize related classes together.
It works like a folder in a computer.
Example Structure:
Project
 └── Practice1 (package)
      └── Hello_World (class)
Why we use packages:
1. To organize code properly
2. To avoid class name conflicts
3. To manage large projects easily
*/

public class Hello_World1 {
    /*
    Class: Hello_World
    A class is a blueprint for creating objects.
    In Java, every program is written inside a class.
    Important Rule:
    The class name must be the same as the file name.
    File name: Hello_World.java
    */

    public static void main(String[] args) {

        /*
        main() Method
        This is the starting point of every Java program.
        The program execution begins from this method.
        Breakdown:
        public  → Accessible from anywhere
        static  → Runs without creating an object
        void    → Does not return any value
        main()  → Entry point of the program
        String[] args → Used to receive command line arguments
        */

        System.out.println("Hello World");
        /*
        Printing Output
        System.out.println() is used to print text on the screen.
        System  → Java system class
        out     → Standard output stream
        println → Prints text and moves to the next line
        Output:
        Hello World
        */
    }
}
