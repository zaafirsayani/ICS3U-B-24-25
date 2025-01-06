package day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        // loops allow us to repeat code multiple times
        // this unit we will learn the for loop and the while loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        // for loops are MEANT to count
        // they have an initial/starting value
        // a condition to keep going/counting as long as it is true
        // how it counts

        // create a for loop to print the numbers 10, 8, 6, 4, 2, 0, -2, -4 with no if statements
        for (int counter = 10; counter > -5; counter-=2) {
            System.out.println(counter);
            
        }

        // count the vowels in the string str

        String str = "alphabet soup";
        String vowels = "aeiou";

        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i,i+1);
            if (vowels.indexOf(letter)>=0){
                numVowels++;

            }
            
        }
        System.out.println("There are " + numVowels + " in " + str);

    }

}


// // public int countCode(String str) {
  
//   int numCode = 0;
  
//   for (int i = 0; i<=str.length() - 4; i++){
//     String co = str.substring(i,i+2);
//     String e = str.substring(i+3,i+4);
//     if (co.equals("co") && e.equals("e"))
//       numCode++;
//   }
  
//   return numCode;