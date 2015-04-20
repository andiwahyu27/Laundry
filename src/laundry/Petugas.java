package laundry;

public class Petugas {
    private String nik;
    private String nama;

    public Petugas(String nik, String nama){
        this.nik=nik;
        this.nama=nama;
    }

    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        for (int i = 0; i < 4; i++) {
            if(Character.isDigit(nik.charAt(i))){
                    return;
            }
        }
        this.nik = nik;
    }
}
