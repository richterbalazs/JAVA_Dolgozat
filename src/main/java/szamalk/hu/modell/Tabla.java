package szamalk.hu.modell;

public class Tabla {
    private String[][] T;
    private String UresCella;

    public Tabla(String T, String UresCella) {
        this.T = new String[8][1];
        this.UresCella = UresCella;

    }

    public void megjelenit(){
        T = new String[][]{
                {UresCella, UresCella, UresCella, UresCella, UresCella, UresCella, UresCella, UresCella},

        };

        for (int i = 0; i < T.length; i++){
            for(int j = 0; j < T[i].length; j++){
                System.out.println(T[i][j]);
            }
            System.out.println();
        }
    }

    public void elhelyez(){

    }

}
