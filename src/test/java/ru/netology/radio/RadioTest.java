package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldShowStationNumber() {
        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentNumber() {
        Radio radio = new Radio();
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowTheCurrentNumberReturn() {
        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextTheNumber() {
        Radio radio = new Radio();
        radio.setStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextTheNumberFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrevThe() {
        Radio radio = new Radio();
        radio.setStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowPrevTheNumberFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentVolumeFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeUp() {
        Radio radio = new Radio();
        radio.setVolume(3);

        radio.volumeUp();

        int expected = 4;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeUpFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.volumeUp();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeDown() {
        Radio radio = new Radio();
        radio.setVolume(6);

        radio.volumeDown();

        int expected = 5;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeDownFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.volumeDown();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }
}