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
public class Packing {
    private NOurut nomor;
    private String ukuranplastik;
        
    Packing(NOurut nomor){
        this.nomor = nomor;
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

    /**
     * @return the plastik
     */
    public String getUkuranPlastik() {
        return ukuranplastik;
    }

    /**
     * @param ukuranplastik the plastik to set
     */
    public void setUkuranPlastik(String ukuranplastik) {
        switch(ukuranplastik) {
            case "besar" : ukuranplastik="plastik besar";break;
            case "kecil" : ukuranplastik="plastik kecil";break;
            default : ukuranplastik="plastik tidak tersedia";
        }
        this.ukuranplastik = ukuranplastik;
    }
    
}