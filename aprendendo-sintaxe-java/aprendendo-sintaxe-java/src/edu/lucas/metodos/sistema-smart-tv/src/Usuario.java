public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("==============================================");
        smartTv.ligar();
        System.out.println("");
        System.out.println("Novo Status:");
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("==============================================");
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("==============================================");
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("==============================================");
        smartTv.aumetarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumetarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumetarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumetarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.escolherCanal(56);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.escolherCanal(16);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.escolherCanal(48);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
