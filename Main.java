public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRABALHO DE ESTRUTURAS DE DADOS - LISTAS ENCADEADAS ===\n");
        
        // Teste da Lista Simples
        System.out.println("=== LISTA SIMPLES ===");
        ListaSimples listaSimples = new ListaSimples();
        
        System.out.println("Inserindo elementos...");
        listaSimples.inserirInicio(10);
        listaSimples.inserirFinal(30);
        listaSimples.inserirMeio(20, 1);
        listaSimples.inserirFinal(40);
        listaSimples.inserirInicio(5);
        listaSimples.listar();
        
        System.out.println("\nOperações de busca:");
        System.out.println("Buscar 20: " + listaSimples.buscar(20));
        System.out.println("Buscar 50: " + listaSimples.buscar(50));
        System.out.println("Buscar 5: " + listaSimples.buscar(5));
        
        System.out.println("\nOperações de remoção:");
        System.out.println("Remover 20: " + listaSimples.remover(20));
        listaSimples.listar();
        System.out.println("Remover 100 (inexistente): " + listaSimples.remover(100));
        
        System.out.println("Tamanho da lista: " + listaSimples.getTamanho());
        System.out.println("Lista vazia? " + listaSimples.estaVazia());
        
        // Teste da Lista Dupla
        System.out.println("\n\n=== LISTA DUPLA ===");
        ListaDupla listaDupla = new ListaDupla();
        
        System.out.println("Inserindo elementos...");
        listaDupla.inserirInicio(5);
        listaDupla.inserirFinal(15);
        listaDupla.inserirMeio(10, 1);
        listaDupla.inserirFinal(20);
        listaDupla.inserirInicio(2);
        listaDupla.listarInicioFim();
        listaDupla.listarFimInicio();
        
        System.out.println("\nOperações de busca:");
        System.out.println("Buscar 10: " + listaDupla.buscar(10));
        System.out.println("Buscar 25: " + listaDupla.buscar(25));
        System.out.println("Buscar 2: " + listaDupla.buscar(2));
        
        System.out.println("\nOperações de remoção:");
        System.out.println("Remover 10: " + listaDupla.remover(10));
        listaDupla.listarInicioFim();
        System.out.println("Remover 2 (início): " + listaDupla.remover(2));
        listaDupla.listarInicioFim();
        System.out.println("Remover 20 (fim): " + listaDupla.remover(20));
        listaDupla.listarInicioFim();
        
        System.out.println("Tamanho da lista: " + listaDupla.getTamanho());
        System.out.println("Lista vazia? " + listaDupla.estaVazia());
        
        // Teste da Lista Circular
        System.out.println("\n\n=== LISTA CIRCULAR ===");
        ListaCircular listaCircular = new ListaCircular();
        
        System.out.println("Inserindo elementos...");
        listaCircular.inserirInicio(100);
        listaCircular.inserirFinal(300);
        listaCircular.inserirMeio(200, 1);
        listaCircular.inserirFinal(400);
        listaCircular.inserirInicio(50);
        listaCircular.listar();
        
        System.out.println("\nOperações de busca:");
        System.out.println("Buscar 200: " + listaCircular.buscar(200));
        System.out.println("Buscar 500: " + listaCircular.buscar(500));
        System.out.println("Buscar 50: " + listaCircular.buscar(50));
        
        System.out.println("\nOperações de remoção:");
        System.out.println("Remover 200: " + listaCircular.remover(200));
        listaCircular.listar();
        System.out.println("Remover 50 (início): " + listaCircular.remover(50));
        listaCircular.listar();
        System.out.println("Remover 400 (fim): " + listaCircular.remover(400));
        listaCircular.listar();
        
        System.out.println("Tamanho da lista: " + listaCircular.getTamanho());
        System.out.println("Lista vazia? " + listaCircular.estaVazia());
        
        // Teste com lista vazia
        System.out.println("\n\n=== TESTE COM LISTA VAZIA ===");
        ListaSimples listaVazia = new ListaSimples();
        System.out.println("Lista vazia:");
        listaVazia.listar();
        System.out.println("Buscar em lista vazia: " + listaVazia.buscar(10));
        System.out.println("Remover em lista vazia: " + listaVazia.remover(10));
        System.out.println("Tamanho: " + listaVazia.getTamanho());
        
        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
