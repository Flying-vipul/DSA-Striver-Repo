package Recursion;

public class ReverseofStrings {

    public void reverseString(char[] s) {
        // We start the recursion by pointing at the very first and very last character
        recursiveReverse(s, 0, s.length - 1);
    }

    private void recursiveReverse(char[] s, int left, int right) {
        //BAse Case
        if (left>=right) return;

        // swapping
        char temp;
        temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        //recursive call
        recursiveReverse(s,left+1,right-1);
    }
}
