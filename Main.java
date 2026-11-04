public class Main {
    public static void main(String[] args) {
        
        System.out.println("====== INICIANDO TESTE AUTOMATIZADO ======");
        
        double precoCamiseta = 79.50;
        int quantidade = 3;
        double valorFrete = 17.00;
        double cupomDesconto = 15.00;
        
        double totalCalculadoPeloTeste = (precoCamiseta * quantidade) + valorFrete - cupomDesconto;
        double totalQueApareceuNoSite = 240.50; 
        
        System.out.println("Valor que o site calculou: R$ " + totalQueApareceuNoSite);
        System.out.println("Valor correto esperado:   R$ " + totalCalculadoPeloTeste);
        
        if (totalQueApareceuNoSite == totalCalculadoPeloTeste) {
            System.out.println("\n✅ TESTE PASSOU! O sistema fez a conta certinha.");
        } else {
            System.out.println("\n❌ TESTE FALHOU! Alerta de BUG!");
        }
    }
}
