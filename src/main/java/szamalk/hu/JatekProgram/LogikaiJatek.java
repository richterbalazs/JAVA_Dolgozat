package szamalk.hu.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Program{
    private String[][] tabla = new String[4][5], Babu;
    private int[] sorrend = new int[10];
    private static int babuDb;

    public LogikaiJatek() {

    }

    public LogikaiJatek(int babuDb) {
        this.babuDb = babuDb;
        while((babuDb > 2 || babuDb < 15)){
            System.out.println("Hiba, az érték kisebb mint kettő, illetve nagyobb mint 15!");
        }
    }

    public boolean van8FelettEro(){
        return true;
    }

    public static void kezd(){
        babuDb = 3;
        System.out.println("Kezdés");
        System.out.println(babuDb);
    }

    public void ment(){
        System.out.println("Mentés");
        System.out.println(babuDb);
    }

    public void vege(){
        babuDb = 10;
        System.out.println("Vége");
        System.out.println(babuDb);
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
