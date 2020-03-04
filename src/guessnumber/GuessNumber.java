/*
 * Luke Weber
 * Mr.A
 * Slot Machine
March 4th 2020
 */
package guessnumber;


public class GuessNumber {

    
    public static void main(String[] args) {
        again = "yes"
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

    again = str(input("Would you like to go again?: "))
    while (again.lower() != "yes" and again.lower() != "no"):
        print("Yes or No only please.")
        again = str(input("Enter a yes or a no "))

print("Goodbye!")
        
    }
    
}
