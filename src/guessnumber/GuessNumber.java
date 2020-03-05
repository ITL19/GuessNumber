/*
 * Luke Weber
 * Mr.A
 * Slot Machine
March 4th 2020
 */
package guessnumber;

import java.util.Scanner;


public class GuessNumber {
    public static int Int(String in){
        return Integer.parseInt(in);
    }
    public static String input(String str){
        print(str);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void print(String str, Object param, Object param2, Object param3){
        System.out.println(str+param+param2+param3);
    }
    public static void print(String str, Object param){
        System.out.println(str+param);
    }
    public static void print(String str){
        System.out.println(str);
    }
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        String again = "yes"
money = 0
print("Welcome to the Slot Machine!")

while (again.lower() == "yes"):
    a = (int)(Math.random() * 10)
    b = (int)(Math.random() * 10)
    c = (int)(Math.random() * 10)
    print(a,"--",b,"--",c)

    if (a == b and b == c):
        print("Three matching numbers!")
        money += 500
    elif (a == b or b == c or a == c):
        print("2 matching numbers!")
        money += 100
    else:
        print("No matching numbers! :(")
        money -= 50

        again = input("Would you like to go again?: ");
        while (again.lower() != "yes" and again.lower() != "no"){
            print("Yes or No only please.");
            again = input("Enter a yes or a no ");

            print("Goodbye!");
        }
    }
}
