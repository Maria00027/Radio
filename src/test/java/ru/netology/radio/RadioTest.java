package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldShowStationNumber() {
        Radio radio = new Radio();
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowTheCurrentNamber() {
        Radio radio = new Radio();
        radio.setStation(2);

        int expected = 2;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentNamberReturn() {
        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextTheNamber() {
        Radio radio = new Radio();
        radio.setStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextTheNamberFulfillingTheCondition() {
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
    void shouldShowPrevTheNamberFulfillingTheCondition() {
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
        radio.setVolume(2);

        int expected = 2;
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
    void shouldShowVolumeDowne() {
        Radio radio = new Radio();
        radio.setVolume(6);

        radio.volumeDown();

        int expected = 5;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeDowneFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.volumeDown();

        int expected = 9;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }
}