package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;
        //вызываем целевой метод:
        int actual = service.calculateSum(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test

    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 15;
        //вызываем целевой метод:
        int actual = service.calculateAverage(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        //вызываем целевой метод:
        int actual = service.findMax(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        //вызываем целевой метод:
        int actual = service.findMin(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        //вызываем целевой метод:
        int actual = service.moreAverage(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        //вызываем целевой метод:
        int actual = service.lessAverage(sales);
        //производим проверку(сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
