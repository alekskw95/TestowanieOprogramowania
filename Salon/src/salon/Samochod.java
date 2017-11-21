package salon;

public class Samochod {
    
    int dlugosc;
    int szerokosc;
    int predkoscJazdy;
    String nazwa;
    
    public Samochod(String nazwa, int dlugosc, int szerokosc, int predkoscJazdy) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.predkoscJazdy = predkoscJazdy;
        this.nazwa = nazwa;
    }

    public Samochod() {
    }
    
    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    
    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getPredkoscJazdy() {
        return predkoscJazdy;
    }

    
    public void setPredkoscJazdy(int predkoscJazdy) {
        this.predkoscJazdy = predkoscJazdy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Override
    public String toString() {
        return getNazwa()+" "+getDlugosc()+" "+getSzerokosc()+" "+getPredkoscJazdy();
    }
    
    
}
