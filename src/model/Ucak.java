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
public class Ucak {
    
    private int ucakId;
    private String ucakTuru;
    private int yolcuSayisi;

    public int getUcakId() {
        return ucakId;
    }

    public void setUcakId(int ucakId) {
        this.ucakId = ucakId;
    }

    public String getUcakTuru() {
        return ucakTuru;
    }

    public void setUcakTuru(String ucakTuru) {
        this.ucakTuru = ucakTuru;
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }
    
}
