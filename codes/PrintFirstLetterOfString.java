public class PrintFirstLetterOfString {
    public static void main(String[] args) {
        String s = "Koi Mil Gaya";
        for (int i = 0; i < s.length(); i++) {
            // if (s.charAt(i) != ' ') {
                if (i==0||s.charAt(i - 1) == ' ') {
                    System.out.println(s.charAt(i) + " ");
                // }
            }
        }
    }

}
