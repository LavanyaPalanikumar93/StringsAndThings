package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int count = 0;
        String temp[] = input.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].trim().endsWith("y") || temp[i].trim().endsWith("z"))
                count++;
        }
        return count;
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < base.length(); i++) {
            int flag = 0;
            for (int j = 0; j < remove.length(); j++) {
                if (base.charAt(i) == remove.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag != 1)
                ans.append(base.charAt(i));
        }
        return ans.toString();
    }
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'i') && (input.charAt(i + 1) == 's')) {
                count1++;
            }
            if ((input.charAt(i) == 'n') && (input.charAt(i + 1) == 'o') && (input.charAt(i + 2) == 't')) {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
        public Boolean gIsHappy(String input) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'g') {
                    if (i > 0 && input.charAt(i - 1) == 'g') {
                        continue;
                    }
                    if (i < input.length() - 1 && input.charAt((i + 1)) == 'g') {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if ((input.charAt(i + 1) == input.charAt(i)) && (input.charAt(i + 2) == input.charAt(i)))
            {
                count++;
            }
        }

       return count;
}}