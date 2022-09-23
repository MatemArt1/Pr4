public class Main {
   /* Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces. */


    public static int getCount(String str) {
        char [] ch = str.toCharArray();
        int n = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                n++;
        }
        return n;
    }
    public static void main (String args[]){

        System.out.println("Hello Java!");
    }
}
