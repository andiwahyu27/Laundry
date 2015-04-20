/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laundry;

/**
 *
 * @author LENOVO
 */
public class Setrika {
    private NOurut nomor;
    private String jenis;

    /**
     * @return the jenis
     */
    Setrika (NOurut nomor){
        this.nomor=nomor;
    }
    
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        switch(jenis){
            case "biasa":jenis="Setrika biasa";break;
            case "uap"  :jenis="uap";break;
            default : jenis="Pilihan tidak tersedia";
        }
        this.jenis = jenis;
    }

    /**
     * @return the nomor
     */
    public NOurut getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(NOurut nomor) {
        this.nomor = nomor;
    }
    
    
}
