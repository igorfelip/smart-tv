public class Usuari {
    public static void main(String[] args) throws Exception {
      
SmartTv smartTv = new SmartTv();


smartTv.diminuirVolume();
smartTv.diminuirVolume();
smartTv.diminuirVolume();

System.out.println(smartTv.volume);


smartTv.aumentarCanal();
smartTv.aumentarVolume();
System.out.println(smartTv.volume);
System.out.println(smartTv.canal);

smartTv.mudarCanal(47);
System.out.println(smartTv.canal);
}
}
