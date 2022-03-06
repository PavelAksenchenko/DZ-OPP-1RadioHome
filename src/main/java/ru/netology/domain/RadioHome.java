package ru.netology.domain;

public class RadioHome {


    private int maxRadioStationsQuantity = 10;
    private int currentVolume;
    private int currentRadioStation;

    public RadioHome(int maxRadioStationsQuantity) {
        this.maxRadioStationsQuantity = maxRadioStationsQuantity;
    }

    public RadioHome() {
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int setMaxRadioStation(int maxRadioStationsQuantity) {
        this.maxRadioStationsQuantity = maxRadioStationsQuantity;
        return this.maxRadioStationsQuantity;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationsQuantity - 1;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            this.currentRadioStation = getMaxRadioStationNumber();
            return;
        }

        if (currentRadioStation > maxRadioStationsQuantity - 1) {
            this.currentRadioStation = 0;
            return;
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
        if (currentVolume > 100) {
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