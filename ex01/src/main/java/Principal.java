public class Principal {

    public static void main(String[] args){

        Complexo c1 = new Complexo();
        Complexo c2 = new Complexo(3,5);
        Complexo c3 = new Complexo(4,52);
        Complexo c4 = new Complexo(2,33);

        System.out.println("Complexo c1: " +c1);
        System.out.println("Complexo c2: " +c2);
        System.out.println("Complexo c3: " +c3);
        System.out.println("Complexo c4: " +c4);

        c1.somaComplex(c4,c3);
        System.out.println("Complexo c1: "+c1);

        c2.somaComplex(c1,c3);
        System.out.println("Complexo c2: "+c2);

        c3.somaComplex(c2,c4);
        System.out.println("Complexo c3: "+c3);

        c1.subtraiComplex(c2,c4);
        System.out.println("Complexo c1: "+c1);

        c3.subtraiComplex(c1,c3);
        System.out.println("Complexo c3: "+c3);

        c4.subtraiComplex(c4,c2);
        System.out.println("Complexo c4: "+c4);

    }
}
