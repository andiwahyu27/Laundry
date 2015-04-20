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
public class Pengeringan {
    private NOurut nomor;
    private int waktukering; //dalam menit
    private String status;
    
    Pengeringan (NOurut nomor){
        this.nomor = nomor;
        this.status="OK";
    }
    /*
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
     * @return the waktukering
     */
    public int getWaktukering() {
        return waktukering;
    }

    /**
     * @param waktukering the waktukering to set
     */
    public void setWaktukering(int waktukering) {
        this.waktukering = 10;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the waktukering
     */
    
}
