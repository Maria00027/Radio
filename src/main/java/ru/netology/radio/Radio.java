package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int volume;

    private int numberOfRadioStation;
    private int maxStation = 9;
    private int minStation;
    private int maxVolume = 100;
    private int minVolume;


    public Radio(int numberOfRadioStation){
        this.numberOfRadioStation = numberOfRadioStation;
    }

    public Radio() {
    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void setNumberOfRadioStation(int numberOfRadioStation) {
        if (numberOfRadioStation < minStation || numberOfRadioStation > maxStation) {
            return;
        }
            this.numberOfRadioStation = numberOfRadioStation;
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



    public int getCurrentStation() {
        return this.currentStation;
    }
    
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }

        this.currentStation = currentStation;
    }


    public void next() {
        int currentStation = this.getCurrentStation();
        
        if (currentStation == maxStation) {
            this.setCurrentStation(minStation);
            return;
        }
         
        this.setCurrentStation(currentStation + 1);
    }


    public void prev() {
        int currentStation = this.getCurrentStation();
        
        if (currentStation == minStation) {
            this.setCurrentStation(maxStation);
            return;
        }
        
        this.setCurrentStation(currentStation - 1);
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
            this.setVolume(maxVolume);
            return;
        }

        this.setVolume(currentVolume + 1);
    }

    public void volumeDown() {
        int currentVolume = this.getVolume();

        if (currentVolume == minVolume) {
            this.setVolume(minVolume);
            return;
        }

        this.setVolume(currentVolume - 1);
    }
}
