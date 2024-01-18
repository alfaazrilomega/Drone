package dasar;

public class dronegame {
    public static void main(String[] args) {
        Drone malas = new Drone();

        malas.energi = 100;
        malas.kecepatan = 50;
        malas.ketinggian = 20;
        malas.merek = "Azril eek";

        malas.terbang();
        malas.mundur();
    }
}
