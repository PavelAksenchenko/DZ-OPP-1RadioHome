package ru.netology.domain;

public class RadioHome {

    private int currentVolume;
    private int currentRadioStation;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setPreviousCurrentRadioStation() {
        setCurrentRadioStation(currentRadioStation - 1);
    }


    public void setNextRadioStation() {
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeDown() {
        setCurrentVolume(currentVolume - 1);

    }

    public void setVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }
}
