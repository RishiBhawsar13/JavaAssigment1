public class AlphabetVowel {
    public static void main(String[] args) {
        char ch = 'e';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Alphabet and Vowel");
            else
                System.out.println("Alphabet but Consonant");

        } else {
            System.out.println("Not an Alphabet");
        }
    }
}
