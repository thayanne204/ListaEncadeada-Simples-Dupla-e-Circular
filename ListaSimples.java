public class ListaSimples {
    private NodeSimples inicio;
    private int tamanho;
    
    public ListaSimples() {
        this.inicio = null;
        this.tamanho = 0;
    }
    
    // Inserir no início
    public void inserirInicio(int data) {
        NodeSimples novoNode = new NodeSimples(data);
        if (inicio == null) {
            inicio = novoNode;
        } else {
            novoNode.next = inicio;
            inicio = novoNode;
        }
        tamanho++;
    }
    
    // Inserir no final
    public void inserirFinal(int data) {
        NodeSimples novoNode = new NodeSimples(data);
        if (inicio == null) {
            inicio = novoNode;
        } else {
            NodeSimples atual = inicio;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoNode;
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
        
        NodeSimples novoNode = new NodeSimples(data);
        NodeSimples atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.next;
        }
        novoNode.next = atual.next;
        atual.next = novoNode;
        tamanho++;
    }
    
    // Buscar elemento
    public boolean buscar(int data) {
        NodeSimples atual = inicio;
        while (atual != null) {
            if (atual.data == data) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }
    
    // Remover elemento
    public boolean remover(int data) {
        if (inicio == null) {
            return false;
        }
        
        if (inicio.data == data) {
            inicio = inicio.next;
            tamanho--;
            return true;
        }
        
        NodeSimples atual = inicio;
        while (atual.next != null && atual.next.data != data) {
            atual = atual.next;
        }
        
        if (atual.next != null) {
            atual.next = atual.next.next;
            tamanho--;
            return true;
        }
        
        return false;
    }
    
    // Listar todos os elementos
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeSimples atual = inicio;
        System.out.print("Lista Simples: ");
        while (atual != null) {
            System.out.print(atual.data + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
    
    // Getter para tamanho
    public int getTamanho() {
        return tamanho;
    }
    
    // Verificar se está vazia
    public boolean estaVazia() {
        return inicio == null;
    }
}
