public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        double myString = 3.14159;
        //When changing the myString variable from a String to a char I receive an error that states that the "char" variable is incompatible which is causing the string to not be converted to char.
        //Assigning the myString code the value of 3.14159 returns an error.

        double myNumber = 3.14;
        System.out.println(myNumber);
        //java: incompatible types: possible lossy conversion from double to long
        // this worked due to the integer falling within range for long integers and is also not a decimal.
        // the number 3.14 cannot be compiles when declared as a long. You can fix this by changing it to a float or double.
        // when myNumber is declared as a float the number cannot be compiled that way either. If you convert it to double or int, it will render the result.

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // the output for this code takes the int value of 5 and increments it by 1 and outputs the value of 6 for the first output function. For the second output function the value of x returns back to its original value of 5.

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // the output for the first function takes the value of x and increments it by 1 to give a new value of 6. The second output renders the same value of 6 after running the second function.

        // The post-increment and pre-increment operators for x in both function both return x with the value of 6, but the difference depends on where and when the increment is placed relative to the usage of the variable in the expression.

//        public class class {
        // java returns an error stating an illegal start of an expression
//        }

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // an error occurred after running this code. Results matched my expectations.

//        int three = (int) "three";
        // int takes in the value of variable String theNumberThree and assigns it value of o as an int in the first function. In the second function, int three is assigned with another int that has a value of three as a string.
        // this code block also returns an error stating that the string cannot be converted to an integer.

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;






    }
}


