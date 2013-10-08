// Here I'm defining a new class (Blueprint) named HelloWorld
// public tells Java that this should be available to all other classes

import java.util.Scanner;
import javax.swing.JOptionPane;

// classes are blue prints used to design objects that contain attributes (variables) and methods (functions)
// HelloWorld is just what you named your program. That allows you to reference it later
// { is the opening brace that surrounds the code used by HelloWorld

public class MoreInfo {
    // public allows other classes to use this function
    // static means that only a class can call for this function to execute
    // void states that this function doesn't return any values after it is done executing
    // main is required in every Java program. This function is always executed first
    // Every main function must except an array of string objects

    // Class variables must start with static if you want to access them with any other methods in the class
    static String randomString = "String to print";

    // Constant variables are defined with the word final
    static final double PINUM = 3.1415929;

    public static void main(String[] args) {
        // System.out is an object that outputs information
        // println is a function that prints to the screen what ever you provide between braces
        // "Hello World" is a string of characters. Strings must be surrounded with quotes
        // Every statement ends with a semicolon ;
        System.out.println("Hello World");

        // Variable names are case sensitive. Age is not the same as age.
        // Variables must begin with a letter and contain numbers, _, or $
        // You must declare all variables before you can use them with a data type
        /* You can use any variable name except for
         * abstract     continue    for     new     switch  assert  default goto    package     synchronized
         * boolean  do  if  private this    break   double  implements  protected   throw
         * byte else    import  public  throws  case    enum    instanceof  return  transient
         * catch    extends int short   try char    final   interface   static  void
         * class    finally long    strictfp    volatile    const   float   native  super   while
         */
        // This is a declaration statement
        // integerOne is a local variable to the main function. It can only be accessed in main
        int integerOne = 22;

        int integerTwo = integerOne + 1; // This is an expression statement

        // White space has no meaning in Java, aside from variables and keywords
        integerTwo
                = integerOne
                + 3;

        System.out.println(integerTwo);

        // Javas Primitive Types
        byte bigByte = 127; // Minimum value -128 Maximum value 127
        short bigShort = 32767; // Minimum value -32768 Maximum value 32767
        int bigInt = 2147483647; // Minimum value -2147483648 Maximum value 2147483647
        long bigLong = 9223372036854775807L; // Minimum value -9223372036854775808L

        float bigFloat = 3.14F; // You must end a float with an F
        double bigDouble = 3.1234567890D; // The D is not required with doubles
        System.out.println(Float.MAX_VALUE); // Float is precise to 6 decimal places
        System.out.println(Double.MAX_VALUE); // Double is precise to 15 decimal places

        boolean trueOrFalse = true; // Booleans are True or False, not 1 or 0

        // A char will except a number or a character surrounded by apostrophes
        char randomChar = 65; // Character Code for A is 65 Minimum value 0 Maximum value 65535
        char anotherChar = 'A';
        System.out.println(randomChar);

        // chars can also contain escaped characters
        char backSpace = '\b';
        char formFeed = '\f';
        char lineFeed = '\n';
        char carriageReturn = '\r';
        char horizontalTab = '\t';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backSlash = '\\';

        // A string conatins a series of characters
        String randomString = "I'm just a random";
        String anotherString = "string";

        // You combine strings with a +
        String combinedString = randomString + ' ' + anotherString;
        System.out.println(combinedString);

        // How to convert any other type to a string
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);
        String charString = Character.toString(randomChar); // You don't need to do this

        System.out.println(charString);

        // Can't do this because char is a primitive data type
        // System.out.println(randomChar.getClass());
        // You can do this because String is an object
        System.out.println(charString.getClass());

        // You use casting to convert from one primitive type to another
        // If you convert from a number that is to big the largest possible value will be
        // used instead
        double aDoubleValue = 3.1456789;
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);

        /* To cast to other primitive types just proceed with the conversion to type
         * ie (byte) (short) (long) (double)
         * (float) & (boolean) & (char) don't work.
         * (char) stays as a number instead of a character
         */
        // Use parseInt to convert a string into an integer
        int stringToInt = Integer.parseInt(intString);

        int randomInt = (int) (Math.random() * 11); // Math.random is 0.0 - 0.9999999 (never 1 there fore for 1 .. 10 put * 11)
        
        int valueOne = 1, valueTwo = 2;
        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        
        char grade = 'B';
        switch (grade) {
            case 'A':
                //A
                break;
            case 'b':
            case 'B':
                //B
                break;
            case 'C':
                //C
                break;
            case 'D':
                //D
                break;
            case 'F':
                //F
                break;
            default:
                //everything else
                break;
        }
        int m, n;
        for (m=1, n=2; m<=9; m+=2, n+=2) {
            System.out.println(m + "\n" + n);
        }
        String name[] = new String[5];
        name [0] = "Hello";
        name [1] = "bob";
        name [2] = "how";
        name [3] = "are";
        name [4] = "you";
        for (String names: name) {
            System.out.println(names);
        }
        
        int one = 1, one2 = 1, two = 1;
        one = ++two; // = 2 (one ads one)
        one2 = two++; // = 1 (two = 2) (one equals two, two adds 1)
        System.out.println(one + " " + one2);
                
              

        /* Logical Operators:
         * Java has 6 logical operators
         * ! : Converts the boolean value to its right to its opposite form ie. true to false
         * & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
         * && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
         * | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
         * || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
         * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
         - See more at: http://www.newthinktank.com/2011/12/java-video-tutorial-3/#sthash.lmfSKqAw.dpuf

         /* Other parse functions
         * parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
         * There is no reason to parse a Character
         */
    }
    // You must provide a closing brace } so Java knows when the function has ended
    
    public static void main1(String[] args) {
        Scanner get = new Scanner(System.in);
        String num;
        num = get.nextLine();
        System.out.println(Integer.parseInt(Character.toString(num.charAt(0))) + Integer.parseInt(Character.toString(num.charAt(1))) + Integer.parseInt(Character.toString(num.charAt(2))));
        System.out.println("HA");
    }
     public static void main2(String[] args) {
        String string = JOptionPane.showInputDialog("Do Some Stuff?");
    }
}
 // See more at: http://www.newthinktank.com/2011/12/java-video-tutorial/#sthash.wJVJ2IIr.dpuf 
