package osoba;


public class Test {

    public static void main(String[] args) {

        Osoba o1= new Osoba();
        //System.out.println(o1.getImie());
        o1.setImie("Paulina");
        o1.setWiek(25);
        System.out.println(o1.getImie() + " " + o1.getWiek() + " lat.");

        
    }
    
}
