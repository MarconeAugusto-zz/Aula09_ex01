public class Complexo {

    private int real;
    private int imaginario;

    public Complexo(){
        real = 0;       //não precisaria ser declarado pois é executado implicitamente
        imaginario = 0;     //variáveis inteiras são iniciadas em 0
    }
    public Complexo(int r , int i){
        real = r;
        imaginario = i;
    }

    public String toString(){
        return  "(" +real+ "," +imaginario+ ")";
    }

    public void soma(Complexo x) {
        real = x.real + real;
        imaginario = x.imaginario + imaginario;
    }

    public void subtrai(Complexo x){
        real = x.real - real;
        imaginario = x.imaginario - imaginario;

    }
}

