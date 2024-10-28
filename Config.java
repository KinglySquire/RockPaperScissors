public class Config {
    public static String printRules()
    {
        // TODO
        return "Rock paper scissors (also known by several other names and word orders, see § Names) is an intransitive hand game, usually played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are rock (a closed fist), paper  (a flat hand), and  scissors (a fist with the index finger and middle finger extended, forming a V). The earliest form of  rock paper scissors -style game originated in China and was subsequently imported into Japan, where it reached its modern standardized form, before being spread throughout the world in the early 20th century.";
    }

    public static int calculateWinner(int playerChoice, int nonPlayerChoice)
    {
        // should work supposedly but it's still A STRING AND HE NEVER TOLD ME HOW TO CHANGE IT
        // should work now?

        if (playerChoice == 0 && nonPlayerChoice == 2 || playerChoice == 1 && nonPlayerChoice == 0 ||
            playerChoice == 2 && nonPlayerChoice == 1)
        {
            return 0;
        }
        else if (playerChoice == 0 && nonPlayerChoice == 1 || playerChoice == 1 && nonPlayerChoice == 2 || playerChoice == 2 && nonPlayerChoice == 0)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static String printOutcome(int foobar)
    {
        // TODO
        if (foobar == 0)
        {
            return "WIN, EPIC";
        }
        else if (foobar == 1)
        {
            return "you absolute failure. you lost a random tossup. congrats.";
        }
        else
        {
            return "TIE";
        }
    }

    public static String printPcChoice(int inttoString)
    {
        String strpc = "";
        if (inttoString == 0)
        {
            strpc = "YOU CHOSE: ROCK";
        }
        else if (inttoString == 1)
        {
            strpc = "YOU CHOSE: PAPER (but you already knew this)";
        }
        else
        {
            strpc = "YOU CHOSE(YES YOU): SCISSORS";
        }
        return strpc;
    }

    public static String printNpcChoice(int inttoString)
    {
        String strnpc = "";
        if (inttoString == 0)
        {
            strnpc = "I CHOSE: ROCK";
        }
        else if (inttoString == 1)
        {
            strnpc = "I CHOSE: PAPER";
        }
        else
        {
            strnpc = "I CHOSE: SCISSORS";
        }
        return strnpc;
    }
}
