public class PrettyHeader {
    public static void prettyHeader(String msg)
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        int spaces = 54 - msg.length();
        int leftSpaces = spaces / 2;
        int rightSpaces = spaces - leftSpaces;

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");


        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}
