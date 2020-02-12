package fxPelirekisteri;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
/**
 * @author teemu
 * @version 12.2.2020
 *
 */
public class taulukonSisalto {
    private SimpleStringProperty pelinNimi;
    private SimpleStringProperty pelinAlusta;
    private SimpleStringProperty pelinKategoria;
    private SimpleIntegerProperty pelinVuosi;
    private SimpleStringProperty pelinArvio;
    

    /**
     * Alustaa taulukon sisällön
     * @param pelinNimi = pelin nimi
     * @param pelinAlusta = Alusta esim(Steam yms,)
     * @param pelinKategoria = Kategoria
     * @param pelinVuosi = julkaisuvuosi
     * @param pelinArvio = Arvio pelistä
     */
    public taulukonSisalto(String pelinNimi,String pelinAlusta,String pelinKategoria,int pelinVuosi,String pelinArvio) {
        this.pelinNimi = new SimpleStringProperty(pelinNimi);
        this.pelinAlusta = new SimpleStringProperty(pelinAlusta);
        this.pelinKategoria = new SimpleStringProperty(pelinKategoria);
        this.pelinVuosi = new SimpleIntegerProperty(pelinVuosi);
        this.pelinArvio = new SimpleStringProperty(pelinArvio);
    }

    /**
     * @return nimi
     */
    public String getPelinNimi() {
        return pelinNimi.get();
    }

    /**
     * @param pelinNimi nimi
     */
    public void setPelinNimi(String pelinNimi) {
        this.pelinNimi = new SimpleStringProperty(pelinNimi);
    }

    /**
     * @return alusta
     */
    public String getPelinAlusta() {
        return pelinAlusta.get();
    }

    /**
     * @param pelinAlusta alusta
     */
    public void setPelinAlusta(String pelinAlusta) {
        this.pelinAlusta = new SimpleStringProperty(pelinAlusta);
    }

    /**
     * @return kategoria
     */
    public String getPelinKategoria() {
        return pelinKategoria.get();
    }

    /**
     * @param pelinKategoria kategoria
     */
    public void setPelinKategoria(String pelinKategoria) {
        this.pelinKategoria = new SimpleStringProperty(pelinKategoria);
    }

    /**
     * @return pelin julkaisuvuosi
     */
    public int getPelinVuosi() {
        return pelinVuosi.get();
    }

    /**
     * @param pelinVuosi haettu
     */
    public void setPelinVuosi(int pelinVuosi) {
        this.pelinVuosi = new SimpleIntegerProperty(pelinVuosi);
    }

    /**
     * @return pelin arvio
     */
    public String getPelinArvio() {
        return pelinArvio.get();
    }

    /**
     * @param pelinArvio haettu
     */
    public void setPelinArvio(String pelinArvio) {
        this.pelinArvio = new SimpleStringProperty(pelinArvio);
    }
    
}

