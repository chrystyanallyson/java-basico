public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    int canalAnterior;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    public void duminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canalAnterior = canal;
        canal++;
    }
    public void duminuirCanal(){
        canalAnterior = canal;
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canalAnterior = canal;
        canal = novoCanal;
    }

    public void canalAnterior(){
        canal = canalAnterior;
    }

}
