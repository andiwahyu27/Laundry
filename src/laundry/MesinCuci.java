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
public class MesinCuci {
   private int banyakair; //dalam liter
   private int sabun;     //dalam sendok takaran mesin cuci
   private int waktuputaran1; //dalam menit
   private int waktuputaran2; //dalam menit
   private int waktuputaran3; //dalam menit
   private NOurut nomor;
   private String status;
   
   MesinCuci(NOurut nomor){
       this.nomor=nomor;
       this.status="OK";
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
     * @return the banyakair
     */
    public int getBanyakair() {
        return banyakair;
    }

    /**
     * @param banyakair the banyakair to set
     */
    public void setBanyakair(int banyakair) {
       this.banyakair=100;       
    }

    /**
     * @return the sabun
     */
    public int getSabun() {
        return sabun;
    }

    /**
     * @param sabun the sabun to set
     */
    public void setSabun(int sabun) {
       this.sabun=3;       
    }

    /**
     * @return the waktuputaran1
     */
    public int getWaktuputaran1() {
        return waktuputaran1;
    }

    /**
     * @param waktuputaran1 the waktuputaran1 to set
     */
    public void setWaktuputaran1(int waktuputaran1) {
        this.waktuputaran1 = 15;
    }

    /**
     * @return the waktuputaran2
     */
    public int getWaktuputaran2() {
        return waktuputaran2;
    }

    /**
     * @param waktuputaran2 the waktuputaran2 to set
     */
    public void setWaktuputaran2(int waktuputaran2) {
        this.waktuputaran2 = 10;
    }

    /**
     * @return the waktuputaran3
     */
    public int getWaktuputaran3() {
        return waktuputaran3;
    }

    /**
     * @param waktuputaran3 the waktuputaran3 to set
     */
    public void setWaktuputaran3(int waktuputaran3) {
        this.waktuputaran3 = 10;
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
