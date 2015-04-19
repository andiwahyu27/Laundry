package laundry;

import java.util.Scanner;
public class Laundry {
    
    int pembayaran;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        NOurut noCustomer1 = new NOurut();
        noCustomer1.setNomor("0001");
        
        Customer customer1 = new Customer();
        customer1.setNama("Budi");
        customer1.setNoHP("085729752700");
        customer1.setJenis("1");
        customer1.setNomor(noCustomer1);
                
        Transaksi cusTransaksi = new Transaksi();
        cusTransaksi.setBerat(2);
        cusTransaksi.setPembayaran(27000);
        
        Petugas petugas1=new Petugas("12345", "Bakri");
        
        MesinCuci mesin1 = new MesinCuci(noCustomer1);
                        
        Pengeringan pengCustomer1 = new Pengeringan(noCustomer1);
                
        Setrika setCustomer1= new Setrika(noCustomer1);
        setCustomer1.setJenis("biasa");
        
        
        Semprot semCustomer1 = new Semprot(noCustomer1);
        
        
        Packing packCustomer1 = new Packing(noCustomer1);
        packCustomer1.setUkuranPlastik("besar");
        
        System.out.println("==========================================");
        System.out.println("Struk harga customer :");
        cetakNO(noCustomer1);
        cetakCustomer(customer1);
        System.out.println("==========================================");
        System.out.println("Harga per kg utk jenis tsb adalah "+cusTransaksi.getHargaKering());
        cetakTransaksi(cusTransaksi);
        System.out.println("==========================================");
    }
    
    static void cetakNO(NOurut noCustomer1){
        System.out.println("NO ID Customer  : " + noCustomer1.getNomor());
    }
    
    static void cetakTransaksi(Transaksi cusTransaksi){
        System.out.println("Berat baju Anda adalah : "+cusTransaksi.getBerat());
        System.out.println("Uang Anda adalah : " + cusTransaksi.getPembayaran());
        System.out.println("Total yang harus dibayar : " + (cusTransaksi.getBerat()*cusTransaksi.getHargaKering()));
        System.out.println("Kembalian : " + (cusTransaksi.getPembayaran()-cusTransaksi.getBerat()*cusTransaksi.getHargaKering()));
    }
    
    static void cetakCustomer(Customer customer1){
        System.out.println("Nama Customer   : " + customer1.getNama());
        System.out.println("NO HP Customer  : "+customer1.getNoHP());
        System.out.println("Jenis pelayanan : "+customer1.getJenis());
        
    }
    
    static void cetakPacking(Packing packCustomer){
        System.out.println(packCustomer.getUkuranPlastik());
    }
    
    
}       
        
        
        
        
        

