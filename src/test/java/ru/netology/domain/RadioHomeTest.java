package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioHomeTest {


    @Test
    void shouldInitMax() {
        RadioHome radio2 = new RadioHome(7);
        assertEquals(6, radio2.getMaxRadioStationNumber());
    }

    @Test
    void shouldInitMaxNoArgs() {
        RadioHome radioHome = new RadioHome();
        assertEquals(9, radioHome.getMaxRadioStationNumber());
    }


    @Test
    void getCurrentRadioStationLessLowLimitTest() {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(-1);
        int expected = radioHome.getMaxRadioStationNumber();
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationLessLowLimitMaxArgConstTest () {
        RadioHome radio2 = new RadioHome(20);
        radio2.setCurrentRadioStation(-1);
        int expected = radio2.getMaxRadioStationNumber();
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationLowLimitTest () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void getCurrentRadioStationUpperLimitTest () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(9);
        int expected = radioHome.getMaxRadioStationNumber();
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationUpperLimitArgsConstTest () {
        RadioHome radio2 = new RadioHome(21);
        radio2.setCurrentRadioStation(20);
        radio2.setNextRadioStation();
        int expected = 0;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationMoreUpperLimitTest () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationMoreUpperLimitArgsConstTest () {
        RadioHome radio2 = new RadioHome(20);
        radio2.setCurrentRadioStation(20);
        radio2.setNextRadioStation();
        int expected = 1;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationLowLimitPlusOne () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStation () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(5);
        radioHome.setPreviousCurrentRadioStation();
        int expected = 4;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStationLowerLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(0);
        radioHome.setPreviousCurrentRadioStation();
        int expected = radioHome.getMaxRadioStationNumber();
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStationLowerThenLimitArgsConstTest () {
        RadioHome radio2 = new RadioHome(34);
        radio2.setCurrentRadioStation(0);
        radio2.setPreviousCurrentRadioStation();
        int expected = radio2.getMaxRadioStationNumber();
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStation () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(5);
        radioHome.setNextRadioStation();
        int expected = 6;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void setNextRadioStationUpperLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentRadioStation(9);
        radioHome.setNextRadioStation();
        int expected = 0;
        int actual = radioHome.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationUpperLimitArgsConstTest () {
        RadioHome radio2 = new RadioHome(64);
        radio2.setCurrentRadioStation(63);
        radio2.setNextRadioStation();
        int expected = 0;
        int actual = radio2.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(5);
        int expected = 5;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUpperLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(100);
        int expected = 100;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLowLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(0);
        int expected = 0;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLessLower () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(0);
        radioHome.setVolumeDown();
        int expected = 0;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLowLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(1);
        radioHome.setVolumeDown();
        int expected = 0;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(5);
        radioHome.setVolumeUp();
        int expected = 6;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpUpperLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(99);
        radioHome.setVolumeUp();
        int expected = 100;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpMoreLimit () {
        RadioHome radioHome = new RadioHome();
        radioHome.setCurrentVolume(101);
        radioHome.setVolumeUp();
        int expected = 1;
        int actual = radioHome.getCurrentVolume();
        assertEquals(expected, actual);
    }
}