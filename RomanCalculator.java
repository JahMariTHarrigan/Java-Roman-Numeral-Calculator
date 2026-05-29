public class RomanCalculator {

   
   // This time around the calculator uses the converter class to translate Roman numerals into numbers so the calculator can do math.
   RomanConverter rc = new RomanConverter();

   
   // CALCULATOR METHODS BELOW (Ties into my main class)
   

               // (Goal in calculator to convert the roman numerals to integers first then do operations)


   // Addition (all same thing just different operations only exception is division)
   public int add(String rom1, String rom2) {
       int num1 = rc.fromRoman(rom1); // Converts first roman numeral to integer
       int num2 = rc.fromRoman(rom2); // Converts second roman numeral to integer
       return num1 + num2; // Returns the answer as an integer so main can display both forms
   }

   // Subtraction 
   public int subtract(String rom1, String rom2) {
       int num1 = rc.fromRoman(rom1);
       int num2 = rc.fromRoman(rom2);
       return num1 - num2;
   }

   // Multiplication 
   public int multiply(String rom1, String rom2) {
       int num1 = rc.fromRoman(rom1);
       int num2 = rc.fromRoman(rom2);
       return num1 * num2;
   }

   // Division 
   // (Applies to the zero check in main / only applies for division)
   public int divide(String rom1, String rom2) {
       int num1 = rc.fromRoman(rom1);
       int num2 = rc.fromRoman(rom2);
       return num1 / num2;
   }
}