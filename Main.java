import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Podaj zdanie, sprzawdź czy podane zdanie jest palindromem");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            String sentence = scanner.nextLine();
            if (sentence.equals("koniec"))
            {
                break;
            }
            //kajak

            boolean isPalindrome = true;
            for (int i =0; i < sentence.length() / 2; i++ )
            {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i -1);

                if (currentChar != otherChar)
                {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome)
            {
                System.out.println("Zdanie: " + sentence + " jest palindromem.");
            }
            else
            {
                System.out.println("Zdanie: " + sentence + " nie jest palindromem.");
            }
            System.out.println("Podaj kolejne zdanie do sprawdzenia: ");

        }
    }
}