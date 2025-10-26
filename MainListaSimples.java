public class MainListaSimples {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA LISTA ENCADEADA SIMPLES ===\n");
        
        ListaSimples lista = new ListaSimples();
        
        // Teste de inserção
        System.out.println("1. INSERÇÃO DE ELEMENTOS:");
        System.out.println("Inserindo no início: 10");
        lista.inserirInicio(10);
        lista.listar();
        
        System.out.println("Inserindo no final: 30");
        lista.inserirFinal(30);
        lista.listar();
        
        System.out.println("Inserindo no meio (posição 1): 20");
        lista.inserirMeio(20, 1);
        lista.listar();
        
        System.out.println("Inserindo no início: 5");
        lista.inserirInicio(5);
        lista.listar();
        
        System.out.println("Inserindo no final: 40");
        lista.inserirFinal(40);
        lista.listar();
        
        // Teste de busca
        System.out.println("\n2. OPERAÇÕES DE BUSCA:");
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 50: " + lista.buscar(50));
        System.out.println("Buscar 5: " + lista.buscar(5));
        System.out.println("Buscar 40: " + lista.buscar(40));
        
        // Teste de remoção
        System.out.println("\n3. OPERAÇÕES DE REMOÇÃO:");
        System.out.println("Remover 20: " + lista.remover(20));
        lista.listar();
        
        System.out.println("Remover 5 (início): " + lista.remover(5));
        lista.listar();
        
        System.out.println("Remover 40 (final): " + lista.remover(40));
        lista.listar();
        
        System.out.println("Remover 100 (inexistente): " + lista.remover(100));
        lista.listar();
        
        // Informações da lista
        System.out.println("\n4. INFORMAÇÕES DA LISTA:");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Lista vazia? " + lista.estaVazia());
        
        // Teste com lista vazia
        System.out.println("\n5. TESTE COM LISTA VAZIA:");
        ListaSimples listaVazia = new ListaSimples();
        listaVazia.listar();
        System.out.println("Buscar em lista vazia: " + listaVazia.buscar(10));
        System.out.println("Remover em lista vazia: " + listaVazia.remover(10));
        
        System.out.println("\n=== FIM DO TESTE DA LISTA SIMPLES ===");
    }
}
