package lec05api;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("1.01");
        System.out.println(Math.pow(1.01, 365));
        System.out.println(Math.pow(0.99, 365));
        System.out.println(b.pow(365));
        System.out.println(b.divide(new BigDecimal("7"), 10, BigDecimal.ROUND_UP));
    }
}
