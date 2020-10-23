import java.util.ArrayList;
import java.util.Scanner;

 class program{
    public static void main (String[] args) {

        System.out.println("Quantas evidências tens? (1, 2 ou 3)");
        Scanner ans = new Scanner(System.in);
        int answ = Integer.parseInt(ans.next());

        if (answ == 1) {
            boolean m = true;

            System.out.println("INSERE O CÓDIGO DA EVIDÊNCIA: ");
            System.out.println("=======================================================");
            System.out.println("EMF Level 5: 2 | Ghost Writing: 3 | Fingerprints: 5");
            System.out.println("Spirit Box: 7 | Freezing Temperatures: 11 | Ghost Orb:13");
            System.out.println("=======================================================");

            Scanner evid = new Scanner(System.in);
            int x = Integer.parseInt(evid.next());

            System.out.println (tester(x));

        } else if (answ == 2) {
            System.out.println("INSERE O CÓDIGO DAS EVIDÊNCIAS: ");
            System.out.println(" ");
            System.out.println("=======================================================");
            System.out.println("EMF Level 5: 2 | Ghost Writing: 3 | Fingerprints: 5");
            System.out.println("Spirit Box: 7 | Freezing Temperatures: 11 | Ghost Orb:13");
            System.out.println("=======================================================");

            Scanner evid = new Scanner(System.in);
            int x = Integer.parseInt(evid.next());
            int y = Integer.parseInt(evid.next());
            int f = x * y;

            System.out.println(tester(f));
            System.out.println(" ");

        } else if (answ == 3) {
            System.out.println("INSERE O CÓDIGO DAS EVIDÊNCIAS:");
            System.out.println(" ");
            System.out.println("=======================================================");
            System.out.println("EMF Level 5: 2 | Ghost Writing: 3 | Fingerprints: 5");
            System.out.println("Spirit Box: 7 | Freezing Temperatures: 11 | Ghost Orb:13");
            System.out.println("=======================================================");

            Scanner evid = new Scanner(System.in);
            int x = Integer.parseInt(evid.next());
            int y = Integer.parseInt(evid.next());
            int z = Integer.parseInt(evid.next());

            System.out.println("O fantasma é: " + ghost(x, y, z));
        } else {
            System.out.println("Número não suportado.");
        }

    }
    public static String tester (int x){

        int[] ghostcodes = {110, 231, 182, 1001, 42, 286, 455, 30, 78, 105, 385, 429};
        String[] ghosts = {"Banshee", "Demon", "Jinn", "Mare", "Oni", "Phantom", "Poltergeist", "Revenant", "Shade", "Spirit", "Wraith", "Yurei"};
        ArrayList<String> pghost1 = new ArrayList<String>();
        ArrayList<Integer> cghost1 = new ArrayList<Integer>();

          if (110 % x == 0) {
              pghost1.add("Banshee");
              cghost1.add(110);
          }
          if (231 % x == 0) {
              pghost1.add("Demon");
              cghost1.add(231);
          }
          if (182 % x == 0) {
              pghost1.add("Jinn");
              cghost1.add(182);
          }
          if (1001 % x == 0) {
              pghost1.add("Mare");
              cghost1.add(1001);
          }
          if (42 % x == 0) {
              pghost1.add("Oni");
              cghost1.add(42);
          }
          if (286 % x == 0) {
              pghost1.add("Phantom");
              cghost1.add(286);
          }
          if (455 % x == 0) {
              pghost1.add("Poltergeist");
              cghost1.add(455);
          }
          if (30 % x == 0) {
              pghost1.add("Revenant");
              cghost1.add(30);
          }
          if (78 % x == 0) {
              pghost1.add("Shade");
              cghost1.add(78);
          }
          if (105 % x == 0) {
              pghost1.add("Spirit");
              cghost1.add(105);
          }
          if (385 % x == 0) {
              pghost1.add("Wraith");
              cghost1.add(385);
          }
          if (429 % x == 0) {
              pghost1.add("Yurei");
              cghost1.add(429);
          }

         System.out.println(" ");
         System.out.println("INSERE UMA EVIDÊNCIA QUE TENS A CERTEZA QUE NÃO TENS: ");
         System.out.println("---------------------------------------------------");
         System.out.println("Caso não haja evidências que não possuis, insere: 17");
         System.out.println("---------------------------------------------------");
         System.out.println("---------------------------------------------------");
         Scanner answw = new Scanner(System.in);
         int nev = Integer.parseInt(answw.next());
         if (nev == 17){
             return ("Podes estar a lidar com um dos seguintes fantasmas: " + pghost1);
         } else {
             int y = 0;
             for (int elem : cghost1) {
                 if ((cghost1.get(y)) % nev == 0) {
                     pghost1.remove(y);
                 }
                 y++;
             }
         }
        return ("Podes estar a lidar com um dos seguintes fantasmas: " + pghost1);
     }
    public static String text () {
        System.out.println("=======================================================");
        System.out.println("EMF Level 5: 2 | Ghost Writing: 3 | Fingerprints: 5");
        System.out.println("Spirit Box: 7 | Freezing Temperatures: 11 | Ghost Orb:13");
        System.out.println("=======================================================");
        return (" ");
     }
    public static String ghost(int x, int y, int z){
         int cgtype = x * y * z;
         String gtype = "Não encontrado.";
         switch (cgtype){
             case 110:
                 gtype = "Banshee.";
                 break;
             case 231:
                 gtype = "Demon.";
                 break;
             case 182:
                 gtype = "Jinn.";
                 break;
             case 1001:
                 gtype = "Mare.";
                 break;
             case 42:
                 gtype = "Oni.";
                 break;
             case 286:
                 gtype = "Phantom.";
                 break;
             case 455:
                 gtype = "Poltergeist.";
                 break;
             case 30:
                 gtype = "Revenant.";
                 break;
             case 78:
                 gtype = "Shade.";
                 break;
             case 105:
                 gtype = "Spirit.";
                 break;
             case 385:
                 gtype = "Wraith.";
                 break;
             case 429:
                 gtype = "Yurei.";
                 break;
         }
         return gtype;
     }
}
