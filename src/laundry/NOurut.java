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
public class NOurut {
    private String nomor;

    /**
     * @return the id
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the id to set
     * @throws java.lang.Exception
     */
    public void setNomor(String nomor) throws Exception {
        try {
            Integer.parseInt(nomor);
        } catch (NumberFormatException e) {
            throw new Exception("nomor harus berupa angka");
        }
        this.nomor= nomor;
     }
    
    
}