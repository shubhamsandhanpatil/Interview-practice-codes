/*  public class ReverseStringWords{

    public static void main(String[] args) {
        String str = "shubham sandhan patil";

                                                                   // Split the string into words
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
                                                                    // Reverse each word and append to the result
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

                                                                     // Convert StringBuilder to String and trim the last space
        System.out.println(result.toString().trim());
    }
}
    // mahbuhs nahdnas  litap


*/



// /****************************************************************************           */


// public class ReverseStringWords{
//     public static void main(String[] args) {
//         String str = "shubham sandhan patil";
        
//         // Convert String to StringBuilder to use the reverse() method
//         String reversed = new StringBuilder(str).reverse().toString();
        
//         System.out.println(reversed);
//     }
// }
// litap nahdnas mahbuhs

// *****************************************************************************************

// import java.util.Arrays;
// import java.util.stream.Collectors;

// public class ReverseStringWords{
//     public static void main(String[] args) {

//         String str = "shubham sandhan  patil";

//         String reversed = Arrays.stream(str.split(" "))
//                 .map(word -> new StringBuilder(word).reverse().toString())
//                 .collect(Collectors.joining(" "));

//         System.out.println(reversed);
//     }
// }
// mahbuhs nahdnas  litap


// ********************************************************************************************

// public class ReverseStringWords {
//     public static void main(String[] args) {

//         String str = "shubham sandhan  patil";
//         String[] words = str.split(" ");
//         StringBuilder reverseString = new StringBuilder();

//         for (String word : words) {
//             StringBuilder reverseWord = new StringBuilder(word);
//             reverseString.append(reverseWord.reverse().toString()).append(" ");
//         }

//         System.out.println(reverseString.toString().trim());
//     }
// }
// mahbuhs nahdnas  litap

// *****************************************************************


// public class ReverseStringWords {
//     public static void main(String[] args) {

//         String str = "shubham sandhan  patil";
//         String[] words = str.split(" ");
//         String reverse_String = "";

//         for (String w : words) {
//             String reverse_word = "";
//             for (int i = w.length() - 1; i >= 0; i--) {
//                 reverse_word = reverse_word + w.charAt(i);
//             }
//             reverse_String = reverse_String + reverse_word + " ";
//         }

//         System.out.println(reverse_String.trim());
//     }
// }
// mahbuhs nahdnas  litap

// ******************************************************************

public class ReverseStringWords {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}

