public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int canalDesejado) {
        canal = canalDesejado;
        System.out.println("Canal atual: " + canal);
    }

    public void avançarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void retrocederCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
