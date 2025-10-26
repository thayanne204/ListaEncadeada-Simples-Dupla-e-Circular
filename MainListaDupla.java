public class MainListaDupla {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA LISTA DUPLAMENTE ENCADEADA ===\n");
        
        ListaDupla lista = new ListaDupla();
        
        // Teste de inserção
        System.out.println("1. INSERÇÃO DE ELEMENTOS:");
        System.out.println("Inserindo no início: 10");
        lista.inserirInicio(10);
        lista.listarInicioFim();
        
        System.out.println("Inserindo no final: 30");
        lista.inserirFinal(30);
        lista.listarInicioFim();
        
        System.out.println("Inserindo no meio (posição 1): 20");
        lista.inserirMeio(20, 1);
        lista.listarInicioFim();
        
        System.out.println("Inserindo no início: 5");
        lista.inserirInicio(5);
        lista.listarInicioFim();
        
        System.out.println("Inserindo no final: 40");
        lista.inserirFinal(40);
        lista.listarInicioFim();
        
        // Navegação bidirecional
        System.out.println("\n2. NAVEGAÇÃO BIDIRECIONAL:");
        System.out.println("Lista do início ao fim:");
        lista.listarInicioFim();
        
        System.out.println("Lista do fim ao início:");
        lista.listarFimInicio();
        
        // Teste de busca
        System.out.println("\n3. OPERAÇÕES DE BUSCA:");
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 50: " + lista.buscar(50));
        System.out.println("Buscar 5: " + lista.buscar(5));
        System.out.println("Buscar 40: " + lista.buscar(40));
        
        // Teste de remoção
        System.out.println("\n4. OPERAÇÕES DE REMOÇÃO:");
        System.out.println("Remover 20 (meio): " + lista.remover(20));
        lista.listarInicioFim();
        
        System.out.println("Remover 5 (início): " + lista.remover(5));
        lista.listarInicioFim();
        
        System.out.println("Remover 40 (final): " + lista.remover(40));
        lista.listarInicioFim();
        
        System.out.println("Remover 100 (inexistente): " + lista.remover(100));
        lista.listarInicioFim();
        
        // Informações da lista
        System.out.println("\n5. INFORMAÇÕES DA LISTA:");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Lista vazia? " + lista.estaVazia());
        
        // Teste com lista vazia
        System.out.println("\n6. TESTE COM LISTA VAZIA:");
        ListaDupla listaVazia = new ListaDupla();
        listaVazia.listarInicioFim();
        System.out.println("Buscar em lista vazia: " + listaVazia.buscar(10));
        System.out.println("Remover em lista vazia: " + listaVazia.remover(10));
        
        System.out.println("\n=== FIM DO TESTE DA LISTA DUPLA ===");
    }
}
