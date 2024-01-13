
package Retangulo;

public class Retangulo {
    private int base = 1;
    private int altura = 1;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base >= 1 && base <=20)
            this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
         if(altura >= 1 && altura <=20)
        this.altura = altura;
    }
    
    public int calculaArea(){
    int area;
    area = altura * base;
    
    return area;
}
    public int calculaPerimetro(){
        int perimetro;
        perimetro = (altura * 2) + (base * 2);
        
        return perimetro;
    }
    
    
}
