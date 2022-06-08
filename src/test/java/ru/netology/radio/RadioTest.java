package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldShowStationNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);

        int expected = 10;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrevMinNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrevTheNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrevMaxNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextMaxNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextTheNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowNextMinNumberFulfillingTheCondition() {
        Radio radio = new Radio(10);
        radio.setNumberOfRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldShowStationNumberAny() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(9);

        int expected = 9;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowStationNumberMax() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowStationNumberMin() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfRadioStation();

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
        radio.setMaxStation(9);


        int expected = 9;
        int actual = radio.getMaxStation();

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
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

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
    void shouldShowTheCurrentVolumeUpFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowTheCurrentVolumeDownFulfillingTheCondition() {
        Radio radio = new Radio();
        radio.setVolume(-1);

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
    void shouldShowVolumeUpMax() {
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
        radio.setVolume(4);

        radio.volumeDown();

        int expected = 3;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowVolumeDownMin() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}
