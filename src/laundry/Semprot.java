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
public class Semprot {
    private NOurut nomor;
    private int jmlSemprot;
    private String status;
    
    Semprot(NOurut nomor){
        this.nomor = nomor;
        this.jmlSemprot=1;
        this.status="OK";
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
     * @return the jmlSemprot
     */
    public int getJmlSemprot() {
        return jmlSemprot;
    }

    /**
     * @param jmlSemprot the jmlSemprot to set
     */
    public void setJmlSemprot(int jmlSemprot) {
        this.jmlSemprot = jmlSemprot;
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
    
   
}
