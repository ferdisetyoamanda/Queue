package Queue;
public class Antrianapp {
    public static void main(String[] args){
        Antrian antrian =new Antrian(10);
        antrian.masuk(40);
        antrian.display();
        antrian.masuk(33);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peekDepan());
        antrian.masuk(60);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.display();
        antrian.masuk(54);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peekDepan());
    }
    
}
