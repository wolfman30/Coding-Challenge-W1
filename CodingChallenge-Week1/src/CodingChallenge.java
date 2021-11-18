import java.util.Arrays;

public class CodingChallenge
{
    /**
     * Part 1 of the coding challenge for staging
     * @param str   the input string that is checked for ascending consecutive numbers
     * @return  true or false as to whether the string has only ascending consecutive numbers without spaces
     */
    public static boolean isAscending(String str)
    {
//        char[] chars = str.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (char character: chars)
//        {
//            if (Character.isDigit(character))
//            {
//                stringBuilder.append(character);
//            }
//        }
//        if (stringBuilder.length() != str.length())
//        {
//            return false;
//        }

        int start;
        int length = str.length();

        for (int i = 0; i < length / 2; i++)
        {
            String newString = str.substring(0, i + 1);

            int number = Integer.parseInt(newString);

            start = number;

            while (newString.length() < length)
            {
                number++;

                newString += String.valueOf(number);
            }

            if (newString.equals(str))
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
        System.out.println(isAscending("232425"));
        System.out.println(isAscending("232 425")); //should be false
        System.out.println("Result from 123456789 is " + isAscending("123456789"));
        printNsquare(4);
        printNsquare(6);
        printNsquare(10);
        printNsquare(0);
    }
}
