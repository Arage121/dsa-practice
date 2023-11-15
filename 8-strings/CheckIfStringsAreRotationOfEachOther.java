//https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
public class CheckIfStringsAreRotationOfEachOther {
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Check if lengths of both strings are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate s1 with itself
        String temp = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return temp.contains(s2);
    }
}
