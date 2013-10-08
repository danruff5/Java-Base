/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Courtney
 */
public class JavaInfo {
    public static void main(String[] args) {
        System.out.println("what would you like your name to be...?");
        String name;
        Scanner X = new Scanner(System.in);
        name = X.nextLine();
        System.out.println("i like your name " + name);
        /* --<another comment type (everything inside will comment
        
         END LINES WITH ( { ) OR ( ; )
         proper form to make variable like this : thisIsAVariableName (which means first letter is lowercase and every first letter after is uppercase).
         you can make comments with // then your comment goes here
        
         ---------VARIABLE TYPES-----------
        
         String --> Words, Sentences, Letters, Numbers in "quotations" ==> ("Whats up"),("No. 8"), ("w").
         String variableString = "hello"
         int--> Number w/o Decimals ==> (2), (3).
         int variableInt= 21
         double --> Number w/ Decimals ==> (3.14159265258979323.....),(2.000000000000000).
         double variableDouble = 3.13
         boolean --> True/False test ==> if i hit you, variable (COLLISION) = true, if not then variable (CONTACT) = false.
         boolean variableBoolean = true
         char --> single letter input in 'single quotations' == keyPressed = 'w'        
         char variableChar = 'w'
         -------------OUTPUTS---------------
        
         System.out.print (OUTPUT GOES HERE); --> will out put what is in the brackets onto the output display, need (;) at end, print means it will allow text to be written to the line.
         System.out.println (OUTPUT GOES HERE); --> will out put what is in the brackets onto the output display, need (;) at end, println means it will make it one line, nothing else can be added to it.
        
         ------------INPUTS-----------------
        
         Scanner scanner = new Scanner(System.in); -->a way of setting up a input. ([scanner] is the variable name but you can use anything you want, just what most people use)
         import java.util.Scanner; --> NEED THIS FOR SCANNER TO WORK.
         (MAKE YOUR variableName THE SAME TYPE OF VARIABLE FOR INPUT (nextLine = String), (nextDouble = double)
         varibaleName = scanner.nextLine (); --> makes a variable what String you input next
         ...nextDouble (); --> makes a variable what double you input next
         ...nextInt (); --> makes a variable what int you input next
         ...nextBoolean (); --> makes a variable what boolean you input next
         ...nextChar (); --> makes a variable what char you input next
        
         ------------COUNTERS---------------
        
         variableIntOrDouble = variableIntOrDouble + 1
         variableIntOrDouble += 1
         variableIntOrDouble ++ 
         THESE ARE ALL THE SAME, just the bottom one can only do +1 and the other two can do more that 1.
         -------------GROUPS---------------
         FORLOOP
         for (int i = 0; i <= 5; i++){
         System.out.println(i + " Hello ");
         }
         WHILELOOP
         while (this is true){
         System.out.println("repaeting so much");
         }
         if (this is true){
         System.out.println("This is true");
         }else if (this one is true) {
         System.out.println("This is true, not that other thing");
         }else if(this one is true) {
         System.out.println("This is true, not that other thing");
         } else {
         System.out.println("nothing is true, we will all die");
         }
        
         \/----this is the end of the comment range.
         */
    }
}