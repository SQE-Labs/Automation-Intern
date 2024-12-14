public class AddToASCII {
    public static void main(String[] args) {
        // Define the character
        char character = 'd';

        // Add 3 to its ASCII value
        char newCharacter = (char) (character + 3);

        // Print the result
        System.out.println("Original character  : " + character);
        System.out.println("New character after adding 3 to ASCII value: " + newCharacter);
    }
}