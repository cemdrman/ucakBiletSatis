/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cem
 */
public class Bilet {
    
    private String biletTur;
    private String tarih;
    private String saat;
    private Ucak ucak;
    private Fatura fatura;

    public String getBiletTur() {
        return biletTur;
    }

    public void setBiletTur(String biletTur) {
        this.biletTur = biletTur;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public Ucak getUcak() {
        return ucak;
    }

    public void setUcak(Ucak ucak) {
        this.ucak = ucak;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    
}
