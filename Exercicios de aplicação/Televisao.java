
package Televisão;

class Televisao {
    
    // atributos
    int canal = 1;
    int volume = 0;        
    boolean ligado = false;
    String status;
    // metodos
    
    void tv(){
        if (this.ligado == false) {
       System.out.println("O Televisor está desligado! É necessário liga-lo para utiliza-lo, deseja liga-lo?");
        }
        else{
            System.out.println("O Televisor está ligado! Informe um comando : ");
        }
    }
    
    void aumentarvolume(){
         if(this.volume < 10){
             volume++;
             System.out.println("Volume aumentado: "+this.volume);
         }
         else{
             System.out.println("Volume esta no maximo:"+this.volume);
         }
    }
    void diminuirvolume(){
        if(this.volume > 0){
            volume -= 1;
            System.out.println("Volume diminuido: "+this.volume);
       }
        else{
            System.out.println("Volume esta no minimo: "+this.volume);
        }
    }
     void aumentarcanal(){
         if(this.canal < 16){
             canal++;
             System.out.println("Canal aumentado: "+this.canal);
         }
         else{
             System.out.println("Este e o ultimo canal:"+this.canal);
         }
    }
    void diminuircanal(){
        if(this.canal > 0){
            canal -= 1;
            System.out.println("Canal diminuido: "+this.canal);
       }
        else{
            System.out.println("Este e o ultimo canal: "+this.canal);
        }
    }
     void ligarTelevisao(){
        if (this.ligado == false) {
            this.ligado = true;               
            status= "ligado";
            System.out.println("Televisao Ligada");
        }
        
    }
    
    void desligarTelevisao(){
        if (this.ligado == true) {
            this.ligado = false;               
            status = "desligado";            
            this.canal = 1;
            this.volume = 0; 
            System.out.println("Televisao Desligado");
        }
    }    
    
    void mostraStatus(){
        System.out.println("Está no canal : " + this.canal + " o volume está em : " + this.volume + " e o televisor está " + status);
    }
    
    

}
