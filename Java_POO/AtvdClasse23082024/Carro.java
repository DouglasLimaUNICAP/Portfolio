public class Carro{
    String montadora;
    String modelo;
    int ano;
    boolean estaligado;
    double velocidade;
       
    Carro(String montadora, String modelo, int ano){
        this.montadora = montadora;
        this.modelo = modelo;
        this.ano = ano;
        this.estaligado = false;
    }
    Carro(){
        this.estaligado = false;
    }
    void ligar (){
        this.estaligado = true;
        System.out.println("O carro está ligado!");
    }
    void desligar (){
        this.estaligado = false;
        System.out.println("O carro desligou!");
    }
    void buzina(){
        System.out.println("Beep beep");
    }
    void acelerar(){
        this.velocidade +=20;
        System.out.println("Acelerando o carro, a velocidade atual é: " + this.velocidade);
    }
    void freio(){
        this.velocidade -=30;
        if(velocidade < 30){
            velocidade = 0;
        } else {
            this.velocidade -= 30;
        }
        System.out.println("Freando o carro, a velocidade atual é: " + this.velocidade);
    }
}
    