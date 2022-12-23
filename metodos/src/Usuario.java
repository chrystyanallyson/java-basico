public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA: " + smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV LIGADA: " + smartTv.ligada);

        smartTv.aumentarVolume();
        
        System.out.println("VOLUME: " + smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("CANAL: " + smartTv.canal);
        smartTv.mudarCanal(2);
        System.out.println("CANAL: " + smartTv.canal);
        smartTv.canalAnterior();
        System.out.println("CANAL ANTERIOR: " + smartTv.canal);
    }
}
