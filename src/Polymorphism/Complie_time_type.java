package Polymorphism;

// Java Program for Method overloading
// By using Different Types of Arguments

// Class 1
// Helper class
class Helper2 {

    // Method with 2 integer parameters
    static int Multiply2(int a, int b)
    {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply2(double a, double b)
    {

        // Returns product of double numbers
        return a * b;
    }
}

// Class 2
// Main class
class GFG2 {

    // Main driver method
    public static void main(String[] args)
    {

        // Calling method by passing
        // input as in arguments
        System.out.println(Helper2.Multiply2(2, 4));
        System.out.println(Helper2.Multiply2(5.5, 6.3));
    }
}

