package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean maxFirstOrSecond = first > second;
        int resultFirstOrSecond = maxFirstOrSecond ? first : second;
        if (resultFirstOrSecond == first) {
            boolean maxFirstOrThird = first > third;
            int resultFirstOrThird = maxFirstOrThird ? first : third;
            return resultFirstOrThird;
        }
        if (resultFirstOrSecond == second) {
            boolean maxSecondOrThird = second > third;
            int resultSecondOrThird = maxSecondOrThird ? second : third;
            return resultSecondOrThird;
        }
        return resultFirstOrSecond;
    }
}