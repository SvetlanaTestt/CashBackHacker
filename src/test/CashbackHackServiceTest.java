package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateMissingAmount(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMissingAmountIfMore1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMissingAmountIf1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}