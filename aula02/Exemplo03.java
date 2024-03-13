public class Exemplo03 {
    public static void main(String[] args) {
        int opcao = 5;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
        
            default:
                System.out.println("Outra opção");
                break;
        }

        /* 
        if(5 < 2){
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        System.out.println( (5 > 2) ? "sim" : "não");
        */
    }
}
