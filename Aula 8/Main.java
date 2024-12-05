// Classe base
class Celular {
    private String modelo;

    public Celular(String modelo) {
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public String getModelo() {
        return modelo;
    }
}

// Classe que representa um celular básico
class CelularBasico extends Celular {
    public CelularBasico(String modelo) {
        super(modelo);
    }

    @Override
    public String toString() {
        return "Celular Básico: " + getModelo();
    }
}

// Classe que representa um celular com MP3
class CelularComMP3 extends Celular {
    public CelularComMP3(String modelo) {
        super(modelo);
    }

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public String toString() {
        return "Celular com MP3: " + getModelo();
    }
}

// Classe que representa um celular com MP4
class CelularComMP4 extends CelularComMP3 {
    public CelularComMP4(String modelo) {
        super(modelo);
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo...");
    }

    @Override
    public String toString() {
        return "Celular com MP4: " + getModelo();
    }
}

// Classe que representa um celular com acesso à web
class CelularComWeb extends CelularComMP4 {
    public CelularComWeb(String modelo) {
        super(modelo);
    }

    public void acessarWeb() {
        System.out.println("Acessando a web...");
    }

    @Override
    public String toString() {
        return "Celular com Acesso à Web: " + getModelo();
    }
}

// Classe que representa um celular com câmera digital
class CelularComCamera extends CelularComWeb {
    public CelularComCamera(String modelo) {
        super(modelo);
    }

    public void tirarFoto() {
        System.out.println("Tirando foto...");
    }

    @Override
    public String toString() {
        return "Celular com Câmera Digital: " + getModelo();
    }
}

// Classe principal para testar a hierarquia
public class Main {
    public static void main(String[] args) {
        Celular celularBasico = new CelularBasico("Modelo A");
        Celular celularComMP3 = new CelularComMP3("Modelo B");
        Celular celularComMP4 = new CelularComMP4("Modelo C");
        Celular celularComWeb = new CelularComWeb("Modelo D");
        Celular celularComCamera = new CelularComCamera("Modelo E");

        System.out.println(celularBasico);
        celularBasico.ligar();
        celularBasico.atender();

        System.out.println(celularComMP3);
        celularComMP3.tocarMusica();

        System.out.println(celularComMP4);
        celularComMP4.tocarMusica();
        celularComMP4.reproduzirVideo();

        System.out.println(celularComWeb);
        celularComWeb.tocarMusica();
        celularComWeb.reproduzirVideo();
        celularComWeb.acessarWeb();

        System.out.println(celularComCamera);
        celularComCamera.tocarMusica();
        celularComCamera.reproduzirVideo();
        celularComCamera.acessarWeb();
        celularComCamera.tirarFoto();
    }
}