import java.util.Scanner;
class bank
{
	protected double saldo=1000000;
}
class atm extends bank
{
	Scanner  input = new Scanner(System.in);
        void cekSaldo ()
   	{
        	System.out.println(" Saldo Anda : Rp. " +saldo +"-.");
    	}
    	void ambilUang(double au) 
    	{
        	System.out.println("Anda ambil : Rp. " +au + "-.");
        	transaksi(au);
    	}
    	void tambahUang(double tu) 
    	{
        	System.out.println("Tambah Uang : Rp. " + tu +"-.");
        	this.saldo += tu;
    	}
    	void transfer()
    	{
        	System.out.println("REKENING TUJUAN : ");
        	String nomor= input.next();
        	System.out.println("Jumlah kiriman  :");
        	int nominal= input.nextInt();
        	System.out.println("Transfer sejumlah " +nominal + "ke rekening" + nomor);
        	System.out.println("Benar data tersebut(1) ");
		System.out.println("1. Benar ");
        	int i=input.nextInt(); 
		switch (i)
        	{
                	case 1: 
                       		System.out.println("Transaksi sedang berjalan ");
            			transaksi(nominal);
				break;
                  
                	default:
                    		System.out.println("Transaksi dibatalkan");
                    		break;
	
   		 }
	}
   	void info()
    	{
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------ATM SATRIO--------------");
		System.out.println("-----Cabang Universitas Tanjungpura------");
 		System.out.println("        Saldo Anda  = " +saldo);
		System.out.println("-----------------------------------------");
		System.out.println("Terimakasi Telah Berkunjung Ke ATM SATRIO");
	}
            

    	public double transaksi(double tr) 
	{
        	if ( tr>this.saldo)
        	{
        		System.out.println("Transaksi gagal . saldo tidak cukup. Sisa saldo anda Rp. " + this.saldo);
        	}
       		else 
       		{
            		System.out.println("Transaksi berhasil");
         		return this.saldo -= tr;
        	}
        	return this.saldo;
   	} 
}


public class menu 
{
	public static void main (String [] args) 
    	{
        	Scanner input = new  Scanner(System.in);
       		atm menu = new atm();
        	System.out.println("Selamat datang Di atm Satrio");
        	int a; 
        	System.out.println("Masukan Pin Anda : ");
        	int pin = input.nextInt();
        	do 
        	{ 
            
            		System.out.println("___________________");
            		System.out.println("Layanan atm Satrio");
            		System.out.println("1.Cek saldo");
            		System.out.println("2.Ambil uang");
            		System.out.println("3.Transfer saldo");
            		System.out.println("4.Tambah saldo");
            		System.out.println("5.Exit");
            		System.out.println("Masukan Pilihan : ");
            		a = input.nextInt();
            		System.out.println("-------------------");
            		switch (a)
            		{
                		case 1: 
                    			menu.cekSaldo();
                    			break;
                		case 2:
                    			System.out.println("Masukan uang yang anda ambil Rp. ");
                    			double au= input.nextDouble();
                    			menu.ambilUang(au);
                    			break;
                		case 3:
                    			menu.transfer();
                    			break;
               			case 4:
                    			System.out.println("Masukan uang yang anda tambah Rp. ");
                    			double tu= input.nextDouble();
                    			menu.tambahUang(tu);
                    			break;
                		case 5:
                    			System.out.println("Terima Kasih Telah Datang");
                    			break;
                		default : 
                    		System.out.println("Tidak tersedia");
            		}        
		}
 	       	while (a != 5);
		menu.info();

	}
	
}
