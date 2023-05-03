package ru.netology.javaqa;

public class Radio {

    // Radio

    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation || newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void previosRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    // Громкость

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        } else if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void previusVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}
