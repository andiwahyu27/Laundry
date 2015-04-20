package laundry;

public class Customer {
    private String nama;
    private NOurut nomor;
    private String noHP;
    private String jenis;
    
        
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
       
    public String getNoHP() {
        return noHP;
    }

    
    public void setNoHP(String noHP) throws Exception {
        
        this.noHP = noHP;
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
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    
    public void setJenis(String jenis) {
        switch(jenis){
            //cuci kering
            case "1": jenis="Cuci kering";break;
            //cuci setrika
            case "2": jenis="Cuci setrika";break;
            //setrika aja
            case "3": jenis="setrika";break;
            default : jenis="Pilihan salah!";
        }
        this.jenis=jenis;
    }

    /**
     * @return the transaksi
     */
    

}
