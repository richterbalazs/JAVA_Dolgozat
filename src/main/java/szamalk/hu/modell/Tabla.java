package szamalk.hu.modell;

import java.util.Arrays;

public class Tabla {
    private String[][] T;
    private String UresCella;

    public Tabla(String T, String UresCella) {
        this.T = new String[8][8];
        this.UresCella = UresCella;

    }

    public void Tabla(){
        T = new String[][]{
                {UresCella, UresCella, UresCella, UresCella, UresCella, UresCella, UresCella, UresCella}
        };

        for (int i = 0; i < T.length; i++){
            for(int j = 0; j < T[i].length; j++){
                System.out.println(T[i][j]);
            }
            System.out.println();
        }

        elhelyez(5);
    }

    public void megjelenit(){
        Tabla();
    }

    public void elhelyez(int N){
        String K = "K";
        for (int i = 0; i < T.length; i++){
            if(T[i] == null){
                T += K;
            }
        }

    }

    public boolean UresOszlop(int oszlop){
        boolean telivan = true;

        for(int i = 0; i < T.length; i++) {
            if(T[i][oszlop] != UresCella){
                telivan = false;
            }
        }
        return telivan;
    }

    public void UresSor(int sor){
        boolean telivan = true;

        for(int i = 0; i < T.length; i++) {
            if(T[i][sor] != UresCella){
                telivan = false;
            }
        }
        return telivan;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "T=" + Arrays.toString(T) +
                ", UresCella='" + UresCella + '\'' +
                '}';
    }
}
