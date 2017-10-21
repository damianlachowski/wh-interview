package com.wh.interview.helpers;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Helper {
    public static String calculateReturn(Double stake, String odd) {
        double calculatedReturn = 0.;
        if (!odd.contains("/")) {
            throw new IllegalStateException("Invalid bet format, doesn't contain slash: " + odd);
        }
        String[] splittedOdd = odd.split("/");
        calculatedReturn = (Double.valueOf(splittedOdd[0]) / Double.valueOf(splittedOdd[1]) + 1) * stake;

        return String.valueOf(setNumberFormat(calculatedReturn));
    }

    public static String setNumberFormat(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(number);
    }
}