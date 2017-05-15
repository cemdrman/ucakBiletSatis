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
public class Fatura {
    
    private int tutar;
    private int odemeTuru;
    private String paraBirimi;

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getOdemeTuru() {
        return odemeTuru;
    }

    public void setOdemeTuru(int odemeTuru) {
        this.odemeTuru = odemeTuru;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }
    
}
