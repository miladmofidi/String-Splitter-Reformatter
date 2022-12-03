package org.mimo;

import org.mimo.service.SplitAndReformatString;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] demoStrings = new String[]{"ABC#123 EFG -1","ABC372654","0 - 22 1985--324", "00-44 48 5555 8361"};
        Arrays.stream(demoStrings).forEach(str -> System.out.println(SplitAndReformatString.formatString(str, 3)) );
    }
}