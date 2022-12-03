package org.mimo.service;

/**
 *
 * @Author <a href="mailto:milad.mofidi@gmail.com">Milad Mofidi </a>
 *
 */

public class SplitAndReformatString
{


    public static String formatString(String s, int delimiterIndex){
        String[] strings = stringSplitter(extraCharactersRemover(s),delimiterIndex);
        String str = convertStringArrayToString(strings, " ");

        //If there are fewer than 6 characters(2 blocks of 3) in the final block you can use this method to divide the 2 latest blocks into blocks with size two.
        //str = splitIntoBlocks(str,2);
        return str;
    }


    /**
     * Method to remove spaces and extra none numeric and alphabetic characters
     * @param input
     * @return String
     */
    private static String extraCharactersRemover(String input){
        return input.trim().replaceAll("[^a-zA-Z0-9]", "");
    }

    /**
     * Method to split a string into blocks of n characters
     * @param input
     * @param delimiterIndex
     * @return String[]
     */
    private static String[] stringSplitter(String input, int delimiterIndex){
        return input.split("(?<=\\G.{"+delimiterIndex+"})");
    }

    /**
     * Converting an array of strings to a string by one space as a delimiter.
     * @param strArr
     * @param delimiter
     * @return
     */
    private static String convertStringArrayToString(String[] strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str).append(delimiter);
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * Checking the final block for dividing into two separate blocks with size two if there are less than 6 characters in final block.
     * @param str
     * @return
     */
    private static String divideFinalBlock(String str, int finalBlockLength)
    {
        return str.replaceAll("\\b(\\d{"+finalBlockLength+"})(\\d+) (\\d)$", "$1 $2$3");
    }


}
