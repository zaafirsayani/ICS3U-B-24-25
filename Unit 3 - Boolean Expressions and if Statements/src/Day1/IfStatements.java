package Day1;

public class IfStatements {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        // if (hasRedShoes==true){
        if (hasRedShoes) {
            System.out.println("I like your red shoes");
        }

        // if (hasRedShoes == false) {
        if (!hasRedShoes) {
            System.out.println("You should buy red shoes. Dorothy did");
        }

        int numStudents = 9;
        final int BIG_CLASS = 24;

        if (numStudents >= BIG_CLASS)
            System.out.println("This is a big class. time to get someone to drop the course ");
        
    }

}
