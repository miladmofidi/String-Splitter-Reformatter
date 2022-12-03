package org.mimo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitAndReformatStringTest
{

    @Test
    void formatString()
    {
        String str1 = "00-44 48 5555 8361";
        String expectedStr1 = "004 448 555 583 61";
        String str2 = "ABC372654";
        String expectedStr2 = "ABC 372 654";
        String str3 = "0 - 22 1985--324";
        String expectedStr3 = "022 198 532 4";
        String str4 = "02-219 8 53 24";
        String expectedStr4 = "022 198 532 4";

        String actualResult1 = SplitAndReformatString.formatString(str1,3);
        String actualResult2 = SplitAndReformatString.formatString(str2,3);
        String actualResult3 = SplitAndReformatString.formatString(str3,3);
        String actualResult4 = SplitAndReformatString.formatString(str4,3);

        assertEquals(actualResult1,expectedStr1);
        assertEquals(actualResult2,expectedStr2);
        assertEquals(actualResult3,expectedStr3);
        assertEquals(actualResult4,expectedStr4);
    }
}