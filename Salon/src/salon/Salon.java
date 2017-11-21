package salon;


public class Salon {

    public static void main(String[] args) {

        
        Samochod sam1 = new Samochod("BMW",3800,1900,130); 
        
        sam1.getNazwa();
        sam1.getDlugosc();
        sam1.getSzerokosc();
        sam1.getPredkoscJazdy();
 
        Samochod sam2 = new Samochod("AUDI",3600,1800,180); 
        
        sam2.getNazwa();
        sam2.getDlugosc();
        sam2.getSzerokosc();
        sam2.getPredkoscJazdy();
        
        Samochod sam3 = new Samochod("FORD",2700,1650,120); 
        
        sam3.getNazwa();
        sam3.getDlugosc();
        sam3.getSzerokosc();
        sam3.getPredkoscJazdy();
        
        Samochod sam4 = new Samochod("Mazda",3650,1760,155); 
        
        sam4.getNazwa();
        sam4.getDlugosc();
        sam4.getSzerokosc();
        sam4.getPredkoscJazdy();
        
        System.out.println("Samochod : "+ sam1); 
        System.out.println("Samochod : "+ sam2); 
        System.out.println("Samochod : "+ sam3); 
        System.out.println("Samochod : "+ sam4); 

        
        System.out.println();
            
        
    }
    
}
