public class Main {
    public static void main(String[] args) {
        // For
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i = 1;
        //While
        while (i < 10) {
            System.out.println(i);
            i += 3;

        }

        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=1;
        do {
            System.out.println("Loglandı");
            System.out.println(j);
            j += 3;
        } while (j < 10) ;

        System.out.println("While-Do Döngüsü Bitti");



    }
}