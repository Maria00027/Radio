package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    void shouldShowNextCurrentStationMin() {
        Radio radio = new Radio(20);
        radio.setStation(15);

        radio.next();

        int expected = 16;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextCurrentStationLimitValueMax() {
        Radio radio = new Radio(20);
        radio.setStation(19);

        radio.next();

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrevCurrentStation() {
        Radio radio = new Radio(20);
        radio.setStation(15);

        radio.prev();

        int expected = 14;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowCurrentPrevStationLimitValueMin() {
        Radio radio = new Radio(20);
        radio.setStation(0);

        radio.prev();

        int expected = 19;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMinStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);


        int expected = 0;
        int actual = radio.getMinStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(10);


        int expected = 10;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowCurrentStationAny() {
        Radio radio = new Radio();
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentStationLimitValueMin() {
        Radio radio = new Radio();
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowTheCurrentStationLimitValueMax() {
        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);

        int expected = 100;
        int actual = radio.getMaxVolume();

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
        radio.setVolume(101);

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
        radio.setVolume(100);

        radio.volumeUp();

        int expected = 100;
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

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }
}