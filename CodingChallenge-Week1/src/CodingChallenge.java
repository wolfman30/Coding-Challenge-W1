import java.util.Arrays;

public class CodingChallenge
{
    public static boolean isAscending(String str)
    {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int start;
        int length = str.length();

        for (char character: chars)
        {
            if (Character.isDigit(character))
            {
                stringBuilder.append(character);
            }
        }
        if (stringBuilder.length() != str.length())
        {
            return false;
        }

        for (int i = 0; i < length / 2; i++)
        {
            int midIndex = length / 2;
            str.substring(0, i++); 
            str.substring(midIndex, length - 1);
            StringBuilder newString = stringBuilder;
        }

        return true;
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
        printNsquare(4);
        printNsquare(6);
        printNsquare(10);
        printNsquare(0);
    }
}
