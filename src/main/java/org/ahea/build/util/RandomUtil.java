package org.ahea.build.util;

import java.math.RoundingMode;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Random;


public class RandomUtil {

    private static final Random RANDOM = new SecureRandom();

    public static String getRandomNumberString(int size) {
        String format = "";
        for (int i = 0; i < size; i++) {
            format = format.concat("0");
        }
        DecimalFormat df = new DecimalFormat(format);
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(RANDOM.nextDouble() * Math.pow(10, size));
    }
}
