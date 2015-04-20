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
public class Transaksi {
    private int hargaKering;
    private int hargaCuciSet;
    private int hargaSetrika;
    private int pembayaran;
    private int berat;
        
    Transaksi(){
        this.hargaKering=5000;
        this.hargaCuciSet=8000;
        this.hargaSetrika=5000;
    }

    
    /**
     * @return the hargaKering
     */
    public int getHargaKering() {
        return hargaKering;
    }

    /**
     * @param hargaKering the hargaKering to set
     */
    public void setHargaKering(int hargaKering) {
        this.hargaKering = hargaKering;
    }

    /**
     * @return the hargaCuciSet
     */
    public int getHargaCuciSet() {
        return hargaCuciSet;
    }

    /**
     * @param hargaCuciSet the hargaCuciSet to set
     */
    public void setHargaCuciSet(int hargaCuciSet) {
        this.hargaCuciSet = hargaCuciSet;
    }

    /**
     * @return the hargaSetrika
     */
    public int getHargaSetrika() {
        return hargaSetrika;
    }

    /**
     * @param hargaSetrika the hargaSetrika to set
     */
    public void setHargaSetrika(int hargaSetrika) {
        this.hargaSetrika = hargaSetrika;
    }

    /**
     * @return the pembayaran
     */
    public int getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the jenis
     */
       
}
