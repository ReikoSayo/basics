package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    int amount = 0;

    @Test
    public void testRemainGet1() {
        amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainGet0() {
        amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithAmountNull() {
        amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithAmountOne() {
        amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}