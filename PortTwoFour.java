import java.util.Scanner; 
public class PortTwoFour {
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // (Goal is memorization) line reads what i type (my input)
        // 2 lines for objects below lets me use methods (so i dont have to copy/paste code for respective operations in notes)
        RomanConverter rc = new RomanConverter(); // object from romanconverter class to do conversions (same thing below but for calculator)
        RomanCalculator calc = new RomanCalculator();
        int choice = 0;

        // loops until I choose 3 which is to exit
        while (choice !=3) {
            System.out.println("\n==== Roman Numeral Calcverter  ====");        // prints title of program
            System.out.println("1. Calculator");
            System.out.println("2. Conversion");
            System.out.println("3. Exit");
            System.out.print("Enter your choice ");
            choice = scan.nextInt();                         // Stores what choice I choose out of the 5

  
         // CALCULATOR STUFF BELOW
            if (choice == 1) {
               int calcChoice = 0;
               while (calcChoice != 5) {

               System.out.println("\n==== Calculator Menu ====");
               System.out.println("1. Addition");
               System.out.println("2. Subtraction");
               System.out.println("3. Multiplication");
               System.out.println("4. Division");
               System.out.println("5. Back to Main Menu");
               System.out.print("Enter your choice: ");
               calcChoice = scan.nextInt();

               
          // Addition Part
               if (calcChoice == 1) {
                  System.out.print("Enter first Roman Numeral: ");
                  String rom1 = scan.next();                           // Saves the input of my first numeral
                  System.out.print("Enter second Roman Numeral: ");
                  String rom2 = scan.next();                           // Saves the input of my second numeral
        
                  int answer = calc.add(rom1, rom2);                   // Sends it to my calculator class for conversions and calculations (more detailed in summary)
                  System.out.println("\n" + rom1.toUpperCase() + " + " + rom2.toUpperCase() + " = " + rc.intToRoman(answer));
                  System.out.println(rc.fromRoman(rom1) + " + " + rc.fromRoman(rom2) + " = " + answer);
               }

               
           // Subtraction Part
               else if (calcChoice == 2) {
                  System.out.print("Enter first Roman Numeral: ");
                  String rom1 = scan.next();                           
                  System.out.print("Enter second Roman Numeral: ");
                  String rom2 = scan.next();                           

                  int answer = calc.subtract(rom1, rom2);
                  System.out.println("\n" + rom1.toUpperCase() + " - " + rom2.toUpperCase() + " = " + rc.intToRoman(answer));
                  System.out.println(rc.fromRoman(rom1) + " - " + rc.fromRoman(rom2) + " = " + answer);
               }

               
           // Multiplication Part
               else if (calcChoice == 3) {
                  System.out.print("Enter first Roman Numeral: ");
                  String rom1 = scan.next();
                  System.out.print("Enter second Roman Numeral: ");
                  String rom2 = scan.next();

                  int answer = calc.multiply(rom1, rom2);
                  System.out.println("\n" + rom1.toUpperCase() + " x " + rom2.toUpperCase() + " = " + rc.intToRoman(answer));
                  System.out.println(rc.fromRoman(rom1) + " x " + rc.fromRoman(rom2) + " = " + answer);
               }

              
            // Division Part
               else if (calcChoice == 4) {
                  System.out.print("Enter first Roman Numeral: ");
                  String rom1 = scan.next();
                  System.out.print("Enter second Roman Numeral: ");
                  String rom2 = scan.next();

            // Division check happens here (checks if second roman num is 0)
                  if (rc.fromRoman(rom2) == 0) {
                     System.out.println("Error: Can't divide by zero!");
                  } else {
                     int answer = calc.divide(rom1, rom2);
                     System.out.println("\n" + rom1.toUpperCase() + " / " + rom2.toUpperCase() + " = " + rc.intToRoman(answer));
                     System.out.println(rc.fromRoman(rom1) + " / " + rc.fromRoman(rom2) + " = " + answer);
                  }
               }
               else if (calcChoice == 5) {
                  System.out.println("Returning you to the main menu!");
               }
               else {
                  System.out.println("Not an option! Try again!");
               }
            }
         }



        
         // CONVERSION STUFF BELOW
     else if (choice == 2) {
        int convChoice = 0;

        while (convChoice != 3) {
            System.out.println("\n==== Conversion Menu ====");
            System.out.println("1. Roman to Integer");
            System.out.println("2. Integer to Roman");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            convChoice = scan.nextInt();

            
            // Roman To Integer
            if (convChoice == 1) {
                System.out.print("Enter a Roman Numeral: ");
                String romanInput = scan.next();

                int converted = rc.fromRoman(romanInput); // Uses roman converter class for roman to integer conversions

                if (converted == 0) {                  // (Literally no roman num for 0)
                    System.out.println("\nRoman Numeral: " + romanInput.toUpperCase());
                    System.out.println("Integer: N/A");
                } else {
                    System.out.println("\nRoman Numeral: " + romanInput.toUpperCase());
                    System.out.println("Integer: " + converted);
                }
            }

            
            // Integer To Roman
            else if (convChoice == 2) {
                System.out.println("You chose Integer to Roman!");
                System.out.print("Enter an integer: ");

                if (scan.hasNextInt()) {
                    int num = scan.nextInt();
                    String roman = rc.intToRoman(num); // Uses roman converter class for integer to roman conversions

                    System.out.println("\nInteger: " + num);
                    System.out.println("Roman Numeral: " + roman);
                } else {
                    scan.next();
                    System.out.println("\nInteger: N/A");
                    System.out.println("Roman Numeral: N/A");
                }
            }
            else if (convChoice == 3) {
                System.out.println("Returning you to the main menu!");
            }
            else {
                System.out.println("Not an option! Try again!");
            }
        }
     }

     else if (choice == 3) {
      System.out.println("Program closing...");
     }
     else
      System.out.println("Not an option! Try again!");

     }
     scan.close();
   }
}