package ru.netology.domain;

public class RadioHome {

    private int maxRadioStations = 10;
    private int currentVolume;
    private int currentRadioStation;

    public RadioHome() {
    }

    public RadioHome(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public RadioHome(int maxRadioStations, int currentRadioStation, int currentVolume) {
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int setMaxRadioStation(int maxRadioStations) {this.maxRadioStations = maxRadioStations;
        return maxRadioStations;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStations - 1;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = maxRadioStations - 1;
        }
        if (currentRadioStation > maxRadioStations - 1) {
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