package main;

/**
 * Demonstrates various String operations and SQL query construction.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D06_Strings {
    /**
     * The main method demonstrates usage of String methods and basic SQL query
     * construction.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        String text = "Hello World";

        int length = text.length(); // Gets the length of the text

        char characterAtIndex7 = text.charAt(7); // Retrieves character at index 7
        char firstCharacter = text.charAt(0); // Retrieves the first character
        char lastCharacter = text.charAt(length - 1); // Retrieves the last character

        System.out.println("length: " + length);
        System.out.println("characterAtIndex7: " + characterAtIndex7);
        System.out.println("firstCharacter: " + firstCharacter);
        System.out.println("lastCharacter: " + lastCharacter);

        String columns = "id";
        String table = "flight";
        String condition = "city = 'Ravensburg'";
        String sqlQuery = "SELECT " + columns + " FROM " + table + " WHERE " + condition + ";";

        // Alternative query format with string interpolation syntax - not currently
        // functional
        // String sqlQuery2 = STR."SELECT \{ columns } FROM \{ table} WHERE
        // \{condition};";
        System.out.println(sqlQuery);

    }

}
