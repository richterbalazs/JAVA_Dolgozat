package szamalk.hu.JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
    }

    public Babu(int ero, String szin) {
        this.ero = ero;
        this.szin = szin;
        if(ero == 0) {
            ero = 1;
        }

    }
}
