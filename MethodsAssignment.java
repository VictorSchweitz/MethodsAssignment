import java.util.Locale;
import java.util.Scanner;

public class MethodsAssignment
{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {


        // 1.
        double userInputOne = scanner.nextDouble();
        double userInputTwo = scanner.nextDouble();
        double userInputThree = scanner.nextDouble();

        double lowestValue = returnLowestValue(userInputOne, userInputTwo, userInputThree);


        // 2.
        double userNumberInput = scanner.nextInt();
        double checkNumberValue = isAboveOrUnderZero(userNumberInput, userInputTwo, userInputThree);
        System.out.println(checkNumberValue);


        // 3.
        String name = scanner.nextLine();
        returnMiddleCharacter(name);


        // 4.
        double sideOne = scanner.nextDouble();
        double sideTwo = scanner.nextDouble();
        double sideThree = scanner.nextDouble();
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;

        double totalTriangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree)); // Area = √[s(s-a)(s-b)(s-c)]

        double triangleArea = triangleArea(totalTriangleArea);
        System.out.println(totalTriangleArea);


        // 5.
        String password = scanner.nextLine();
        boolean passwordLength = checkPasswordValidity(password);
        System.out.println(passwordLength);


        // 6.
        int number = scanner.nextInt();
        int counter = printNumbers(number);
    }


    // EXERCISE 1 //
    // Write a Java method to find the smallest number among three numbers.
    // The number should come from a user inputting 3 numbers
    public static double returnLowestValue(double userInputOne, double userInputTwo, double userInputThree)
    {
      if(userInputOne < userInputTwo && userInputOne < userInputThree)
      {
          System.out.println("The smallest value is " + userInputOne);
      }
      else if(userInputTwo < userInputOne && userInputTwo < userInputThree)
      {
          System.out.println("The smallest value is " + userInputTwo);
      }
      else
      {
          System.out.println("The smallest value is " + userInputThree);
      }
          return 0;
    }




    // EXERCISE 2 //
    // Write a method that as a parameter gets a number.
    // It should then print to the console if the number is negative, positive or zero
    public static double isAboveOrUnderZero(double userNumberInput, double userInputTwo, double userInputThree)
    {

                  if(userNumberInput > 0)
                  {
                       System.out.println("The number " + userNumberInput + " is positive");
                       return 0;
                  }
                  else if(userNumberInput < 0)
                  {
                       System.out.println("The number " + userNumberInput + " is negative");
                       return userNumberInput;
                  }
                  else
                  {
                      System.out.println("0 is neither positive nor negative");
                      return 0;
                  }
    }




    // EXERCISE 3 //
    // Write a method to find the middle character of a string. The method should take a String as parameter
    // Think about if the word is odd, even, empty character
    public static void returnMiddleCharacter(String middleCharacter)
    {
        int oddOrEven = middleCharacter.length() % 2;
        char returnMiddleCharacterOfString = middleCharacter.charAt(middleCharacter.length() / 2 - 1);

        if(returnMiddleCharacterOfString % 2 != 0)
        {
            System.out.println(returnMiddleCharacterOfString);
        }

        if(returnMiddleCharacterOfString % 2 == 0)
        {
            middleCharacter.charAt(middleCharacter.length() / 2);
        }

        if(middleCharacter.length() == 0)
        {
            System.out.println("String is empty");
        }
    }



    // EXERCISE 4 //
    // Write a Java method to calculate the area of a triangle.
    // It should take 3 sides as parameter
    // Formula: Area = √[s(s-a)(s-b)(s-c)]
    public static double triangleArea(double triangleArea)
    {
        return triangleArea;
    }




    // EXERCISE 5 //
    // Write a Java method to check whether an entered string is a valid password. Here are the requirements:
    // A password must have at least eight characters (x)
    // A password must consists of only letters and digits (x)
    // It cannot contain the string "secret" (x)
    // The first character must not be a dash (-) (x)
    // The method should return true if the password is valid otherwise false

    public static boolean checkPasswordValidity(String password)
    {

        // Check password length and if password contains numbers
        if(password.length() > 8 && password.matches(("[a-zA-Z1-9]+\\.?")))
        {
            String secret = "secret";

            // Check if contains substring "secret"
            for (int i = 0; i < password.length() - 6; i++)
            {
                if(password.substring(i, i + secret.length()).toLowerCase().equals("secret"))
                {
                    return false;
                }
            }

            return true;
        }
        else if(password.length() < 8 && password.matches(("[1-9]+\\.?")))
        {
            return false;
        }

        // Checking if anything is entered or if password is an empty string
        if(password == null || password == "")
        {
            return false;
        }

        if(password.charAt(0) == '-')
        {
            return false;
        }

        return true;
    }

    public static int printNumbers(int number)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.println("[" + (i + 1) + "]");
        }
        return 0;
    }
}


