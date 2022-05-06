package ru.netology.radio;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return this.station;
    }
    
    public void setStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }

        this.station = currentStation;
    }
    
    public void next() {
        int currentStation = this.getStation();
        
        if (currentStation == 9) {
            this.setStation(0); 
            return;
        }
         
        this.setStation(currentStation + 1);
    }
    
    public void prev() {
        int currentStation = this.getStation();
        
        if (currentStation == 0) {
            this.setStation(9);
            return;
        }
        
        this.setStation(currentStation - 1);
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 10) {
            return;
        }

        this.volume = currentVolume;
    }

    public void volumeUp() {
        int currentVolume = this.getVolume();

        if (currentVolume == 10) {
            this.setVolume(0);
            return;
        }

        this.setVolume(currentVolume + 1);
    }

    public void volumeDown() {
        int currentVolume = this.getVolume();

        if (currentVolume == 0) {
            this.setVolume(10);
            return;
        }

        this.setVolume(currentVolume - 1);
    }
}
