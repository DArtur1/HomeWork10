package ru.netology.javaqa;
public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9 || newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        currentRadioStation += 1;
//        if (currentRadioStation < 9) {
//            currentRadioStation += 1;
//        }
    }

    public void previosRadioStation() {
        if (currentRadioStation > 0)
            currentRadioStation -= 1;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
           newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextVolume(){
        currentVolume += 1;
//        if(currentVolume < 100){
//            currentVolume += 1;
//        }
    }

    public void previusVolume(){
        if(currentVolume > 0){
            currentVolume -= 1;
        }
    }
}
