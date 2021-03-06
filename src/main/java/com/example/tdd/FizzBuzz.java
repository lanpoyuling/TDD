package com.example.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FizzBuzz
 * @Description FizzBuzz
 * @Author 10932
 * @Date 6/29/2021 3:27 PM
 **/
public class FizzBuzz {
    public static final String NUMBER_MUST_GREATER_THAN_0 = "number must greater than 0";
    protected static final String FIZZ_BUZZ = "FizzBuzz";
    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private int number;

    public FizzBuzz() {

    }

    public FizzBuzz(int number) {
        this.number = number;
    }

    /**
     * 根据用户输入生成对应长度的FizzBuzz 数组
     *
     * @param number 用户输入 数字
     * @return java.lang.String[]
     * @author 1093
     * @date 6/29/2021 4:50 PM
     */
    public String[] generate(int number) {
        numberMustGreaterThanZero(number);
        String[] strings = new String[number];
        for (int i = 1; i <= number; i++) {
            strings[i - 1] = new FizzBuzz().of(i);
        }
        return strings;
    }

    public String of(int number) {
        numberMustGreaterThanZero(number);
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.canBeDivide(THREE) && fizzBuzz.canBeDivide(FIVE)) {
            return FIZZ_BUZZ;
        }
        if (fizzBuzz.canBeDivide(THREE)) {
            return FIZZ;
        }
        if (fizzBuzz.canBeDivide(FIVE)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private void numberMustGreaterThanZero(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NUMBER_MUST_GREATER_THAN_0);
        }
    }

    private boolean canBeDivide(int i) {
        return this.number % i == 0;
    }

    public List<String> fizzBuzz(int n) {
        numberMustGreaterThanZero(n);
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add(FIZZ);
            } else if (i % 5 == 0) {
                list.add(BUZZ);
            } else {  //how to remove the else
                list.add(String.valueOf(i));
            }

        }
        return list;
    }


}
