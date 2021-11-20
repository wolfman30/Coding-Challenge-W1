import java.util.Arrays;

public class CodingChallenge
{
    /**
     * Part 1 of the coding challenge for staging
     * @param stringToCheck   the string that is checked for ascending consecutive numbers
     * @return  boolean stringToCheck does or does not have only ascending consecutive numbers without spaces
     */
    public static boolean isAscending(String stringToCheck)
    {

        /*
        *  this just checks if the string contains any spaces
        *  or any non-digit characters
        */
        char[] chars = stringToCheck.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char character: chars)
        {
            if (Character.isDigit(character))
            {
                stringBuilder.append(character);
            }
        }
        if (stringBuilder.length() != stringToCheck.length())
        {
            return false;
        }

        /*
        *  this checks if the original string has a sequence of
        *  increasing consecutive numbers
        */
        int length = stringBuilder.length();

        for (int i = 0; i < length / 2; i++)
        {
            String newString = stringBuilder.substring(0, i + 1);

            int number = Integer.parseInt(newString);

            while (newString.length() < length)
            {
                number++;

                newString += String.valueOf(number);
            }

            if (newString.equals(stringToCheck))
                return true;
        }

        return false;
    }

    /**
     * Part 2 of coding challenge
     * @param n  the number of rows and columns and the number repeated in the array
     * @return   squareArray[][]  the square array with n rows and n columns
     */
    public static int[][] printNsquare(int n)
    {
        int squareArray[][] = new int[n][n];

        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < n; k++)
            {
                squareArray[j][k] = n;
            }
        }
        if (n == 0)
        {
            squareArray = new int[][]{};
            System.out.println(Arrays.toString(squareArray));
            return squareArray;
        }
        for (int[] arr: squareArray)
        {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(" ");
        return squareArray;
    }


    public static void main(String[] args)
    {
        System.out.println("'232425' should be true: " + isAscending("232425"));
        System.out.println("'232 425' should be false: " + isAscending("232 425")); //should be false
        System.out.println("Result from 123456789 is " + isAscending("123456789"));
        System.out.println("Result of 199200 should be true: " + isAscending("199200"));
        printNsquare(4);
        printNsquare(6);
        printNsquare(10);
        printNsquare(0);
    }
}
