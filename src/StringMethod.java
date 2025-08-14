public class StringMethod  {
    public static void main(String[] args) {
        // Initialize some strings
        String str1 = "   Hello, World!   ";
        String str2 = "Hello, World!";
        String str3 = "hello, world!";
        String str4 = "   Welcome to Java programming.   ";

        // 1. length() - Get the length of the string
        System.out.println("Length of str1: " + str1.length()); // 18

        // 2. charAt() - Get character at a specific position
        System.out.println("Character at index 0 of str2: " + str2.charAt(0)); // H

        // 3. substring() - Extract a substring from the string
        System.out.println("Substring of str2 from index 7: " + str2.substring(7)); // World!
        System.out.println("Substring of str2 from index 0 to 5: " + str2.substring(0, 5)); // Hello

        // 4. equals() - Check if two strings are equal (case-sensitive)
        System.out.println("str2 equals str3: " + str2.equals(str3)); // false

        // 5. equalsIgnoreCase() - Check if two strings are equal (case-insensitive)
        System.out.println("str2 equalsIgnoreCase str3: " + str2.equalsIgnoreCase(str3)); // true

        // 6. compareTo() - Compare two strings lexicographically
        System.out.println("str2 compareTo str3: " + str2.compareTo(str3)); // Positive value (because "H" > "h")

        // 7. toUpperCase() - Convert the string to uppercase
        System.out.println("str3 in uppercase: " + str3.toUpperCase()); // HELLO, WORLD!

        // 8. toLowerCase() - Convert the string to lowercase
        System.out.println("str2 in lowercase: " + str2.toLowerCase()); // hello, world!

        // 9. trim() - Remove leading and trailing spaces
        System.out.println("str1 after trim: '" + str1.trim() + "'"); // "Hello, World!"

        // 10. replace() - Replace a character or substring with another
        System.out.println("str2 after replace 'World' with 'Java': " + str2.replace("World", "Java")); // Hello, Java!

        // 11. split() - Split the string into an array of substrings
        String[] words = str4.split(" ");
        System.out.println("Words in str4: ");
        for (String word : words) {
            System.out.println(word);
        }

        // 12. contains() - Check if the string contains a specific sequence of characters
        System.out.println("str2 contains 'World': " + str2.contains("World")); // true

        // 13. indexOf() - Find the index of the first occurrence of a character or substring
        System.out.println("Index of 'World' in str2: " + str2.indexOf("World")); // 7

        // 14. lastIndexOf() - Find the index of the last occurrence of a character or substring
        String str5 = "Java is a programming language. Java is fun.";
        System.out.println("Last index of 'Java' in str5: " + str5.lastIndexOf("Java")); // 29

        // 15. startsWith() - Check if the string starts with a particular substring
        System.out.println("str2 starts with 'Hello': " + str2.startsWith("Hello")); // true

        // 16. endsWith() - Check if the string ends with a particular substring
        System.out.println("str2 ends with 'World!': " + str2.endsWith("World!")); // true

        // 17. isEmpty() - Check if the string is empty
        String emptyStr = "";
        System.out.println("emptyStr is empty: " + emptyStr.isEmpty()); // true

        // 18. valueOf() - Convert other data types to string
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Value of num as string: " + numStr); // 123

        // 19. format() - Format the string using placeholders
        String formattedStr = String.format("The value of pi is approximately %.2f", 3.14159);
        System.out.println(formattedStr); // The value of pi is approximately 3.14

        // 20. concat() - Concatenate strings
        String str6 = "Java ";
        String str7 = "Programming";
        System.out.println("Concatenated string: " + str6.concat(str7)); // Java Programming
    }
}
