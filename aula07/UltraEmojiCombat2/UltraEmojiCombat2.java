import java.util.Random;

public class UltraEmojiCombat2 {
    public static void main (String[] args){
        Lutador l[] =  new Lutador[6];

        l[0] =   new Lutador("PrettyBoy", "França", 31, 1.75F,68.9F,
                11, 2, 1);
        l[1] =   new Lutador("Putscript", "Brasil", 29, 1.68F,57.8F,
                14, 2, 3);
        l[2] =   new Lutador("Snapshadow", "EUA", 35, 1.65F,80.9F,
                12, 2, 1);
        l[3] =   new Lutador("UFOCobol", "Austrália", 28, 1.93F,81.6F,
                13, 0, 2);
        l[4] =   new Lutador("Nerdaart", "EUA", 30, 1.81F,105.7F,
                12, 2, 4);

        /*for ( int i = 0; i <= 4; i++ ) {
            System.out.println("##################");
            l[i].status();
            System.out.println("##################");
            System.out.println("");
        }*/

        Random r1 = new Random();
        int i = r1.nextInt(4); // de 0 a 5
        Random r2 = new Random();
        int x = r2.nextInt(4); // de 0 a 5

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[i],l[x]);
        UEC01.Lutar();
        l[i].status();
        l[x].status();
    }
}
