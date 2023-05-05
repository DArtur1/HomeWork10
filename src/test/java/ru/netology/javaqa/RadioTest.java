package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void howMuchStation() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(29, radio.getMaxRadioStation());
    }

    // включить любую волну
    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(54);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // отрицательная волна
    @Test
    public void shouldSetRadioQ() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-54);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    // включить волну больше 9
    @Test
    public void shouldSetRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(19);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // включить 0 волну или меньше
    @Test
    public void shouldSetRadioAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.previosRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //переключить последную волну
    @Test
    public void shouldPlayFinalStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPreviosStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.previosRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Volume
    // любая громкость
    @Test
    public void shouldVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(57);

        int expected = 57;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    // превышает макс громкость
    @Test
    public void shouldVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // меньше минимума
    @Test
    public void shouldVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        radio.previusVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // прибавляем громкость +1
    @Test
    public void shouldPlayNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(89);

        radio.nextVolume();

        int expected = 90;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMoreMAxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(189);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //убавляем громкость -1
    @Test
    public void shouldPlayPreviosVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);

        radio.previusVolume();

        int expected = 89;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}