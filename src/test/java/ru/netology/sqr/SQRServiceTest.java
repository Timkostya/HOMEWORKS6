package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestWithFewCoincidence() {
        SQRService service = new SQRService();
        int actual = service.calc(10, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTestWithOneConcidence() {
        SQRService service = new SQRService();
        int actual = service.calc(0, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWithNoCoincidence() {
        SQRService service = new SQRService();
        int actual = service.calc(10, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestForLimitValues() {
        SQRService service = new SQRService();
        int actual = service.calc(9, 98);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}