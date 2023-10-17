package chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

    	long debut = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec StringBuilder : " + (fin - debut));

        
        debut = System.currentTimeMillis();
        String res = "";
        for (int i = 1; i <= 100000; i++) {
            res += i;
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec String et concaténation : " + (fin - debut));
    }
}

