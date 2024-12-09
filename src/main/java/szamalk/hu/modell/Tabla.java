package szamalk.hu.modell;

public class Tabla {
    private String[][] T;
    private String UresCella;

    public Tabla(String karakter) {
        this.T = new String[8][8];
        UresCella = karakter;
        for(int i = 0; i < 0; i++){
            for (int j = 0; j < 0; j++){
                T[i][j] = karakter;
            }
        }
    }


}
