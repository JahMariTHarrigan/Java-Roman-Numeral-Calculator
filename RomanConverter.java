public class RomanConverter {


      // CONVERTER METHODS BELOW (Ties into my main class)


   // Integer To Roman PORTION
   public String intToRoman(int number) {
       String result = "";
       // Subtracts the largest possible roman and loops while the number is big enough to use (starts by checking if its great or equal to 1000)
       //    Basically breaks down the integer you put in into a roman numeral (hard for me to explain in text but easier to show on paper)
       while (number >= 1000) {
           result += "M";
           number -= 1000;
       }
       while (number >= 100) {
           result += "C";
           number -= 100;
       }
       while (number >= 50) {
           result += "L";
           number -= 50;
       }
       while (number >= 10) {
           result += "X";
           number -= 10;
       }
       while (number >= 5) {
           result += "V";
           number -= 5;
       }
       while (number >= 1) {
           result += "I";
           number -= 1;
       }
       return result;
   }

   // Roman To Integer PORTION
   public int fromRoman(String roman) {
       int result = 0;
       roman = roman.toUpperCase(); // Makes all letters uppercase so valueOf() can read them properly (similar to port 5)

       // Loops to check each character first to make sure its valid
       for (int i = 0; i < roman.length(); i++) {
           if (valueOf(roman.charAt(i)) == 0) { // Returns 0 if the letter isn't a valid roman numeral (ex: M,C,L,X,V,I) (see if "N/A" works later to replace 0)
               System.out.println("Invalid Roman Input Try Again!");
               return 0;
           }
       }

       for (int i = 0; i < roman.length(); i++) { // Loops through the string one character at a time (similar to port 5)
           int current = valueOf(roman.charAt(i)); // Gets the value of the roman numeral (example: X=10)

           // Gets value of next letter, but if it's at last letter there is no next so it will use 0 
           int next = (i + 1 < roman.length()) ? valueOf(roman.charAt(i + 1)) : 0;

           if (current < next) {                           // if current number is smaller than the next subtract if not it adds
               result -= current; 
           } else {
               result += current; 
           }
       }
       return result;
   }

   
   // tells program value of each roman num
   public int valueOf(char c) {
       if (c == 'M') return 1000;
       else if (c == 'C') return 100;
       else if (c == 'L') return 50;
       else if (c == 'X') return 10;
       else if (c == 'V') return 5;
       else if (c == 'I') return 1;
       else return 0;
   }
}