package com.pragra;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.print("He\"llo");
        System.out.println(1 + 3);
        System.out.println(154354354368L);
        long result = 4733455L * 4376655L;
        System.out.println(result);
        double num = 999999999.999999999;
        DecimalFormat df = new DecimalFormat("#.#########");
        System.out.println(df.format(num));
        String num1 = "99999999.999999999";
        double num2 = Double.parseDouble(num1) - 0.001;
        String num3 = String.format("%.3f",num2);
        System.out.println(num3);
        BigDecimal numb1 = new BigDecimal("99999.9999999");
        BigDecimal numb2 = new BigDecimal("0.0001");

        BigDecimal result1 = numb1.subtract(numb2);

        System.out.println(result1);

    }
}
