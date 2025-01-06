package Day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        System.out.println(hasRedShoes==true); //prints true
        System.out.println(hasRedShoes==false);//prints false

        // = is assignment operator
        // == is equality operator

        int numStudents = 9;

        boolean largeClass = numStudents > 24;      // numStudents > 24 is false
        System.out.println("Large Class? " + largeClass);
        
        /*
         * == equals
         * > greater than
         * >= grater than equal
         * < less than
         * <= less than equal
         * != not equal
         * ! not
         */



         int x = 27;

         boolean a = x > 10;
         boolean b = x <=10;

         boolean c = a == !b;

        
    }

}
