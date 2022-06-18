public class Feladat01 {
    public int feladat01(String[] szinek) {
        int counter = 0;
        //A feladat értelmében az adott színek tömbjéből 2, 3, ... n elemű részhalmazokat kell alkotni.
        //Ehhez a binomiális együtthatók összegének képletét használtam, ami értelmében egy n elemű halmaz részhalmazainak száma 2^n.
        //Ebből az összegből le kell vonni az 1 elemű részhalmazok számát (n), illetve a 0 elemű részhalmazok számát (1).
        int n = 1;
        for(int i = 0; i < szinek.length; i++) {
            n *= 2;
        }
        counter = n - szinek.length - 1;
        return counter;
    }
}
