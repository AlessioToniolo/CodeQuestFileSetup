import java.util.*;
import java.util.stream.*;
// a class for longer and mroe complicated helper methods
public class Helper2 
{
    public static void main(String[] args)
    {
        System.out.println(equals("hello", "h`llo", '`'));
    }
    

    public static int[] linearIntersection(String fun1, String fun2)//finds intersection of two lines
    {
        return new int []{1};
    }

    public static void selectionSort(int[] arr)//sorts array
    {
        

    }
    public static boolean equals(String one, String two, char wild)//checks if two strings are equal but the wild character is automatically considered matching exampe if wild character was ! wild would equal w!ld
    {
        if(one.length() != two.length())
        {
            return false;
        }
        for(int i = 0; i < one.length(); i++)
        {
            if(one.charAt(i) == wild || two.charAt(i) == wild)
            {
                continue;
            }
            if(one.charAt(i) != two.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean equals(String one, String two)
    {
        return equals(one, two, '~');
    }
    public static int findLargestSubsequence(String example, String input)//copied this from an old codehs problem I did, needs to be tested
    {
        //row column
       int[][] algorithm = new int[input.length()][example.length()];
       int saved = 0; 
       int current = 0;
       for(int r = 0; r < input.length(); r++)
       {
           for(int c = 0; c < example.length(); c++)
           {
               if(r == 0 || c == 0)
               {
                   if(Helper.letterAt(input, r).equals(Helper.letterAt(example,c)))
                   {
                       algorithm[r][c] = 1;
                   }
               }
               else if(Helper.letterAt(input, r).equals(Helper.letterAt(example,c)))
               {
                   int row = r -1;
                   int col = c - 1;
                   int greatest = 0;
                   int cur = 0;
                   while(row >= 0)
                   {
                       while(col >= 0)
                       {
                           cur = algorithm[row][col];
                           if(cur > greatest)
                           {
                               greatest = cur;
                           }
                           col--;
                       }
                       col = c - 1;
                       row--;
                   }
                   algorithm[r][c] = greatest + 1;
               }
               else
               {
                   algorithm[r][c] = 0 ;
               }
               current = algorithm[r][c];
               if(current > saved)
               {
                   saved = current;
               }
           }
          
        }
        return saved;
    }


}