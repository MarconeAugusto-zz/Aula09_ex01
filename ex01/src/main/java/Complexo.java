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

    public void somaComplex(Complexo x,Complexo y) {
        real = x.real + y.real;
        imaginario = x.imaginario + y.imaginario;
    }

    public void subtraiComplex(Complexo x,Complexo y){
        real = x.real - y.real;
        imaginario = x.imaginario - y.imaginario;

    }
}

