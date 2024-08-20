public class Carro{
    String modelo;
    String montadora;
    int ano;
    double potencia;

    Carro (String m1, 
           String m2, 
           int a, 
           double p){
                    modelo = m1;
                    montadora = m2;
                    ano = a;
                    potencia = p;
           }
    Carro(){}

    Carro (String m01, String m02, double p01){
                    modelo = m01;
                    montadora = m02;
                    ano = 2024;
                    potencia = p01;
          }   
          
    Carro (String modelo){
                    this.modelo = modelo;
    }      
}