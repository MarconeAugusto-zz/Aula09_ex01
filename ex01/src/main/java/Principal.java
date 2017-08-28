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

        c1.soma(c4);
        System.out.println("Complexo c1: "+c1);

        c2.soma(c1);
        System.out.println("Complexo c2: "+c2);

        c3.soma(c2);
        System.out.println("Complexo c3: "+c3);

        c1.subtrai(c2);
        System.out.println("Complexo c1: "+c1);

        c3.subtrai(c1);
        System.out.println("Complexo c3: "+c3);

        c4.subtrai(c3);
        System.out.println("Complexo c4: "+c4);

    }
}
