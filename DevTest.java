import java.util.Scanner;


public class DevTest
{
    void main() {


        Scanner in = new Scanner(System.in);

/*
        String name = getNonZeroLenString(in, "Enter your name");
        System.out.println("Name is " + name);



        int age = getInt(in, "Enter your age");
        System.out.println("Age is " + age);


        double decimal = getDouble(in, "Enter how much money you have");
        System.out.println("Money: " + decimal);



        int rangedInt = getRangedInt(
                in, "Enter a number", 1, 10);
        System.out.println("Age is: " + rangedInt);

*/


        double rangedDouble = getRangedDouble(
                in, "Enter a price", 0.50, 10.00);

        System.out.println("Price is: " + rangedDouble);




        boolean yesNo = getYNConfirm(
                in, "Do you want to continue");
        System.out.println("You said: " + yesNo);



        String regex = getRegExString(
                in, "Enter a three digit number", "^\\d{3}$");
        System.out.println("Regex result: " + regex);



        in.close();
    }

    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            SafeInput.prettyHeader("Message Centered Here");

            in.close();
        }

    private String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do {
            System.out.print(prompt + "; ");
            retVal = pipe.nextLine();
        } while(retVal.length() == 0);

        return retVal;

    }


    public static int getInt(Scanner pipe, String prompt){
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + "; ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        } while(!done);

        return retVal;
    }


    public static double getDouble(Scanner pipe, String prompt){
        double retVal = 0;

        do {
            System.out.print(prompt + ": ");

            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                break;
            }
            else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid amount, not " + trash);
            }
        } while (true);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;

                }
                else
                {
                    System.out.println("That age is not in range[" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int in range [" + low + " - " + high + "]: ");
            }
        } while(!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;

                }
                else
                {
                    System.out.println("That age is not in range[" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int in range [" + low + " - " + high + "]: ");
            }
        } while(!done);

        return retVal;
    }


    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean done = false;
        boolean retVal = false;

        do {
            System.out.print(prompt + "[Y/N]: ");
            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            }
            else {
                System.out.println("You must enter Y or N.");
            }
        } while (!done);

        return retVal;

    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (!retVal.matches(regEx)) {
                System.out.println("Invalid input. please try again.");

            }
        } while (!retVal.matches(regEx));

        return retVal;
    }



}

