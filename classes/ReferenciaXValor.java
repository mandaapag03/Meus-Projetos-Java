package collections;

public class haibdisa {
    public static void main(String[] args) {
        
        int a = 3;
        int b = a;
        b = 9;
        System.out.println(a);
        System.out.println(b);

        Batata batataDoce = new Batata();
        Batata batataDoceBrasileira = batataDoce;
        
        batataDoce.casca = true;
        batataDoce.poupa = true;
        batataDoce.cor = "roxa";
        
        batataDoceBrasileira.casca = false;
        batataDoceBrasileira.poupa = true;
        batataDoceBrasileira.cor = "rosa";

        System.out.println(batataDoce.cor);
    }
}