package com.wh.interview.helpers;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// Class with some utlils useful to calculate and compare expected
public abstract class Helper {
    // Method that calculates return from the bet considering stake and odd values
    public static String calculateReturn(Double stake, String odd) {
        double calculatedReturn;
        if (!odd.contains("/")) {
            throw new IllegalStateException("Invalid bet format, doesn't contain slash: " + odd);
        }
        String[] splittedOdd = odd.split("/");
        calculatedReturn = (Double.valueOf(splittedOdd[0]) / Double.valueOf(splittedOdd[1]) + 1) * stake;

        return setNumberFormat(calculatedReturn);
    }

    // Method that rounds and sets number to 2 decimal places and returns it as string
    public static String setNumberFormat(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(number);
    }
}