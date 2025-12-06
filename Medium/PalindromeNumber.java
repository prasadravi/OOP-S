/*Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?*/


class PalindromeNumber{
    public static void main(String arg[]){
        int x = 1221333;
        String s = Integer.toString(x);
        int pal = 1;
        int  i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) !=s.charAt(j)){
                System.out.println("Not a Planidrome");
                pal = 0;
                break;
            }
            i++;
            j--;
        }
    if (pal == 1){
    System.out.println("Is palindrome.");
        }
    }
}