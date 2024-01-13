
package estudo2;

public class Principal {

    public static void main(String[] args) {
     
        Caneta c1 = new Caneta("Azul", 0.5f, true, 80);
        
         Caneta c2 = new Caneta("Veremelho", 0.7f, false, 35);
        
        c1.status();
        c2.status();
        
    }
    
}
