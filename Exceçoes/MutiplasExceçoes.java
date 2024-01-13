
package exceçoes;

public class MutiplasExceçoes {

    public static void main(String[] args) {
        int num [] = {2, 8, 16, 32, 64, 128};
        int div [] = {2, 0, 4, 8, 0};
        
        for (int i = 0; i <num.length; i++) {
            try{
                System.out.println(num[i]+" / " + div[i] +" = " +num[i]/div[i]);
            }catch(ArithmeticException | ArrayIndexOutOfBoundsException error){
                System.out.println("Ocorreu uma exceçao"); 
            }catch(Throwable error){
                 System.out.println("Ocorreu uma exceçao"); 
            }
            
        }
    }
    
}
