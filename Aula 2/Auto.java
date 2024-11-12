public class Auto {
    String marca;
    String modelo;
    String cor;
    int numportas;

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return this.modelo;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    String getMarca(){
        return this.marca;
    }

    void setNumportas(int numportas){
        this.numportas = numportas;
    }

    int getNumportas(){
        return this.numportas;
    }

}