import java.util.Scanner;

public class GetUserName
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        Scanner in = new Scanner(System.in);

        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
}
