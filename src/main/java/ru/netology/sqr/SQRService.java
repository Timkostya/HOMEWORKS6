package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min) {
                if (square <= max) {
                    result = result + 1;
                }
            }
        }
        return result;

    }


}
