package Model;

public class perhitungan {
    private int a;
    private int b;
    private int hasil;

    public perhitungan(int a, int b, int _hasil) {
        this.a =_a;
        this.b =_b;
        this.hasil =0;
        this.hasil =_hasil;
        printjudulclass("print judul dalam method perhitungan");
    }    
    
    private void printjudulclass(String jdl) {
        Sysytem.out.println(jdl);
    }    

    public void Hitungtambah() {
        this.hasil = this.a + this.b;
    }    

    public void Hitungkali() {
        this.hasil = this.a * this.b;
    }    

    public int hitungtmbah (int angka1, int angka2){
        this.a = angka1;
        this.b = angka2;
        Hitungtambah();
        return this.hasil;
    }  
    
    public int hitungkli (int angka3, int angka4){
        this.a = angka3;
        this.b = angka4;
        Hitungkali();
        return this.hasil;
    }

}
