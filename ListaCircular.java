public class ListaCircular {
    private NodeCircular ultimo;
    private int tamanho;
    
    public ListaCircular() {
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    // Inserir no início
    public void inserirInicio(int data) {
        NodeCircular novoNode = new NodeCircular(data);
        
        if (ultimo == null) {
            ultimo = novoNode;
            ultimo.next = ultimo; // Aponta para si mesmo
        } else {
            novoNode.next = ultimo.next;
            ultimo.next = novoNode;
        }
        tamanho++;
    }
    
    // Inserir no final
    public void inserirFinal(int data) {
        NodeCircular novoNode = new NodeCircular(data);
        
        if (ultimo == null) {
            ultimo = novoNode;
            ultimo.next = ultimo;
        } else {
            novoNode.next = ultimo.next;
            ultimo.next = novoNode;
            ultimo = novoNode;
        }
        tamanho++;
    }
    
    // Inserir no meio (por posição)
    public void inserirMeio(int data, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }
        
        if (posicao == 0) {
            inserirInicio(data);
            return;
        }
        
        if (posicao == tamanho) {
            inserirFinal(data);
            return;
        }
        
        NodeCircular novoNode = new NodeCircular(data);
        NodeCircular atual = ultimo.next; // Começa do primeiro
        
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.next;
        }
        
        novoNode.next = atual.next;
        atual.next = novoNode;
        tamanho++;
    }
    
    // Buscar elemento
    public boolean buscar(int data) {
        if (ultimo == null) {
            return false;
        }
        
        NodeCircular atual = ultimo.next; // Primeiro elemento
        NodeCircular primeiro = atual;
        
        do {
            if (atual.data == data) {
                return true;
            }
            atual = atual.next;
        } while (atual != primeiro);
        
        return false;
    }
    
    // Remover elemento
    public boolean remover(int data) {
        if (ultimo == null) {
            return false;
        }
        
        NodeCircular atual = ultimo.next; // Primeiro elemento
        NodeCircular anterior = ultimo;
        NodeCircular primeiro = atual;
        
        do {
            if (atual.data == data) {
                // Remover o nó
                if (atual == atual.next) { // Único elemento
                    ultimo = null;
                } else {
                    anterior.next = atual.next;
                    if (atual == ultimo) { // Se for o último
                        ultimo = anterior;
                    }
                }
                tamanho--;
                return true;
            }
            anterior = atual;
            atual = atual.next;
        } while (atual != primeiro);
        
        return false;
    }
    
    // Listar todos os elementos
    public void listar() {
        if (ultimo == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeCircular atual = ultimo.next; // Primeiro elemento
        NodeCircular primeiro = atual;
        
        System.out.print("Lista Circular: ");
        do {
            System.out.print(atual.data + " -> ");
            atual = atual.next;
        } while (atual != primeiro);
        System.out.println("(volta ao início)");
    }
    
    // Getter para tamanho
    public int getTamanho() {
        return tamanho;
    }
    
    // Verificar se está vazia
    public boolean estaVazia() {
        return ultimo == null;
    }
}
