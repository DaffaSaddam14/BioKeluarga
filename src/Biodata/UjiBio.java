
package Biodata;

public class UjiBio {

    public static void main(String[] args) {
        BiodataKeluarga bio = new BiodataKeluarga();
        
        bio.setNamaA("Effendi");
        bio.setNamaI("Elvi Susiana");
        bio.setNamaS("Yaafi, Fara");
        bio.setNama("Daffa Saddam Almadani");
        bio.setAlmt("Griya Candi Asri blok Z-08 Sidoarjo");
        bio.setTmpt_lhr("Sidoarjo");
        bio.setTgl_lhr("19 Maret 2003");
        bio.setHobi("Olahraga");
        bio.setCita("Programmer");
        bio.setTlpn("0852-1576-6757");
        
        System.out.println("Nama Ayah         : " + bio.getNamaA());
        System.out.println("Nama Ibu          : " + bio.getNamaI());
        System.out.println("Nama Saudara      : " + bio.getNamaS());
        System.out.println("Nama              : " + bio.getNama());
        System.out.println("Alamat            : " + bio.getAlmt());
        System.out.println("Tempat Lahir      : " + bio.getTmpt_lhr());
        System.out.println("Tanggal Lahir     : " + bio.getTgl_lhr());
        System.out.println("Hobi              : " + bio.getHobi());
        System.out.println("Cita-Cita         : " + bio.getCita());
        System.out.println("No Telepon        : " + bio.getTlpn());
    }
    
}
