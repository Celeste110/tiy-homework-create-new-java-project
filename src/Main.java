/**
 * Created by katherine_celeste on 8/3/16.
 * This program stores a list of quotes in an ArrayList, then prints it out to the screen.
 */
import java.util.*; // need to import the util package to be able to create an ArrayList and Iterator object
public class Main {
    public static void main (String[] args){

        System.out.println("10 awesome quotes to get you inspired....\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        // Create an ArrayList containing 10 inspiring quotes
        List <String> listOfQuotes = new ArrayList ();

        /* REMEMBER: all these strings are being upcasted implicitly into Object. Must downcast later.
        * Each line below adds a quote to the ArrayList
        */
        listOfQuotes.add("1. Talent is given, greatness is earned.\n");
        listOfQuotes.add("2. Don't let someone else's opinion of you become your reality.\n");
        listOfQuotes.add("3. Listen, smile, agree and then do whatever you were going to do anyway.\n");
        listOfQuotes.add("4. It's never too late to be what you might have been.\n");
        listOfQuotes.add("5. Great minds discuss ideas. Average minds discuss events. Small minds discuss people.\n");
        listOfQuotes.add("6. If opportunity doesn't knock, build a door.\n");
        listOfQuotes.add("7. The higher you climb, the better the view.\n");
        listOfQuotes.add("8. It's important to make someone happy, and it's important to start with yourself.\n");
        listOfQuotes.add("9. Death is not the greatest loss in life; the greatest loss is what dies inside while you're still alive.\n");
        listOfQuotes.add("10. If you want something you've never had then you've got to do something you've never done.\n");


        // Iterate through the list and print out quotes
        Iterator iter = listOfQuotes.iterator(); // Creates an Iterator object and attaches the ArrayList to it
        while (iter.hasNext()){ // Check to see if there is another item in the ArrayList
            String str = (String) iter.next(); //Need to downcast explicitly (Object -> String)
            System.out.println(str); // Prints out the quote
        }

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        }

}
