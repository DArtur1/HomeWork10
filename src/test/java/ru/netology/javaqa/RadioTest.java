package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetRadioAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAboveMin(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-5);

        radio.previosRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldPlayPreviosStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.previosRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(57);

        int expected = 57;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldVolumeMax(){
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.previusVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(90);

        radio.nextVolume();

        int expected = 91;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldPlayPreviosVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(90);

        radio.previusVolume();

        int expected = 89;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}