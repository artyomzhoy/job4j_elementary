package ru.job4j.condition;

public class MultiMax {
    /*public int max(int first, int second, int third) {
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
    public int max(int first, int second, int third) {
        boolean firstOrSecond = first > second;
        int result = firstOrSecond ? first : second;
        result = result ? first : third;
        return result;

    }*/
    public int max(int first, int second, int third) {
        int result;
        result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }
}