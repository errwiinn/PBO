package pewarisan;


class Dosen extends Lainnya {

    public void namaSaya() {
        System.out.println("nama saya " + nama);
    }
}

class Mahasiswa extends Lainnya{
public void namaSaya(){
    System.out.println("nama saya mahasiswa "+nama);}
}


public class Pewarisan {

    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.nama = "halo";
        d.namaSaya();
Mahasiswa m = new Mahasiswa();
m.nama
    }

}
