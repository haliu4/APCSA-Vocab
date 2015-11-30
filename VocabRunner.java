import java.util.Scanner;
public class VocabRunner
{
    public static void main(String[] argas)
    {
        System.out.println(Vocab.getGreeting());
        System.out.println(Vocab.getRandomDefinition());
        Scanner in = new Scanner (System.in);
        String anw = in.nextLine();
        
        while (!anw.equals("Bye"))
        {
            System.out.println(Vocab.getResponse(anw));
            anw = in.nextLine();
        }
    }
}