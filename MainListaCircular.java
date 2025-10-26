public class MainListaCircular {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA LISTA ENCADEADA CIRCULAR ===\n");
        
        ListaCircular lista = new ListaCircular();
        
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
        
        // Teste de comportamento circular
        System.out.println("\n2. COMPORTAMENTO CIRCULAR:");
        System.out.println("Lista completa (demonstrando ciclo):");
        lista.listar();
        
        // Teste de busca
        System.out.println("\n3. OPERAÇÕES DE BUSCA:");
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 50: " + lista.buscar(50));
        System.out.println("Buscar 5: " + lista.buscar(5));
        System.out.println("Buscar 40: " + lista.buscar(40));
        
        // Teste de remoção
        System.out.println("\n4. OPERAÇÕES DE REMOÇÃO:");
        System.out.println("Remover 20 (meio): " + lista.remover(20));
        lista.listar();
        
        System.out.println("Remover 5 (início): " + lista.remover(5));
        lista.listar();
        
        System.out.println("Remover 40 (final): " + lista.remover(40));
        lista.listar();
        
        System.out.println("Remover 100 (inexistente): " + lista.remover(100));
        lista.listar();
        
        // Teste com único elemento
        System.out.println("\n5. TESTE COM ÚNICO ELEMENTO:");
        System.out.println("Removendo último elemento 30: " + lista.remover(30));
        lista.listar();
        
        System.out.println("Inserindo elemento único: 100");
        lista.inserirInicio(100);
        lista.listar();
        
        // Informações da lista
        System.out.println("\n6. INFORMAÇÕES DA LISTA:");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Lista vazia? " + lista.estaVazia());
        
        // Teste com lista vazia
        System.out.println("\n7. TESTE COM LISTA VAZIA:");
        ListaCircular listaVazia = new ListaCircular();
        listaVazia.listar();
        System.out.println("Buscar em lista vazia: " + listaVazia.buscar(10));
        System.out.println("Remover em lista vazia: " + listaVazia.remover(10));
        
        System.out.println("\n=== FIM DO TESTE DA LISTA CIRCULAR ===");
    }
}
