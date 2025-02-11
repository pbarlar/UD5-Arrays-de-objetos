

public class Autobus {
    String matricula;
    String modelo;
    float potenciaCV;
    int numeroPlazas;

    public Autobus (String matricula,String modelo,float potenciaCV,int numeroPlazas){
        this.matricula=matricula;
        this.modelo=modelo;
        this.potenciaCV=potenciaCV;
        this.numeroPlazas=numeroPlazas;
    }

    void setNumeroPlazas (int vnumplazas){
        numeroPlazas=vnumplazas;
    }

    String getMatricula(){
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    float getPotenciaCV(){
        return potenciaCV;
    }

    int getNumeroPlazas(){
        return numeroPlazas;
    }

    public void display(){
        System.out.println("la matricula es "+matricula+" , el modelo es "+modelo+", la potencia en cv es "+potenciaCV+" y el numero de plazas es "+numeroPlazas);
    }

}
