package ru.netology.radio;

public class Radio {
    private int station;
    private int volume;

    private int maxStation = 9;
    private int minStation;
    private int maxVolume = 100;
    private int minVolume;

    public Radio () {
    }

    public Radio (int numberOfRadioStation) {
        maxStation = numberOfRadioStation -1;
    }


    public int getStation() {
        return this.station;
    }
    
    public void setStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }

        this.station = currentStation;
    }
    
    public void next() {
        if (station < maxStation) {
            station++;
        }else{
            station = minStation;
        }
    }
    
    public void prev() {
        int currentStation = this.getStation();
        
        if (currentStation == minStation) {
            this.setStation(maxStation);
            return;
        }
        
        this.setStation(currentStation - 1);
    }


    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }

        this.volume = currentVolume;
    }

    public void volumeUp() {
        int currentVolume = this.getVolume();

        if (currentVolume == maxVolume) {
            return;
        }

        this.setVolume(currentVolume + 1);
    }

    public void volumeDown() {
        int currentVolume = this.getVolume();

        if (currentVolume == minVolume) {
            return;
        }

        this.setVolume(currentVolume - 1);
    }
}
