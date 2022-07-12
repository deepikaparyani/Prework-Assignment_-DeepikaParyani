/*
You are provided with a string.
Your task is to create a string with the first letter of every word in the string.
Sample Test Case
Input: 
great learning
Output: 
gl
*/

class FirstLetterPrinter {
public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
  // write your code here
        String str1[] = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i =0 ; i <str1.length;i++){
            for(int j =0;j <  1;j++){
                result.append(str1[i].charAt(j));
            }
        }
        return result.toString();
 }
}
