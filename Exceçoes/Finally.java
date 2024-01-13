
package exceçoes;

public class Finally {

    public static void main(String[] args) {
       int num [] = {2, 8, 16, 32, 64, 128};
        int div [] = {2, 0, 4, 8, 0};
        
        for (int i = 0; i <num.length; i++) {
            try{
                System.out.println(num[i]+" / " + div[i] +" = " +num[i]/div[i]);
            }catch(ArithmeticException error){
                System.out.println("Ocorreu uma exceçao"); 
                System.out.println(" ");
            }catch(ArrayIndexOutOfBoundsException error){
                 System.out.println("Ocorreu uma exceçao"); 
                 System.out.println(" ");
            }finally{
                System.out.println("Essa msg sempre sera exibida");
            }
            
        }
    }
    
}
