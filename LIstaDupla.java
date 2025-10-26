public class ListaDupla {
    private NodeDuplo inicio;
    private NodeDuplo fim;
    private int tamanho;
    
    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    // Inserir no início
    public void inserirInicio(int data) {
        NodeDuplo novoNode = new NodeDuplo(data);
        if (inicio == null) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            novoNode.next = inicio;
            inicio.previous = novoNode;
            inicio = novoNode;
        }
        tamanho++;
    }
    
    // Inserir no final
    public void inserirFinal(int data) {
        NodeDuplo novoNode = new NodeDuplo(data);
        if (fim == null) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.next = novoNode;
            novoNode.previous = fim;
            fim = novoNode;
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
        
        NodeDuplo novoNode = new NodeDuplo(data);
        NodeDuplo atual;
        
        // Escolher de qual lado começar a busca (otimização)
        if (posicao < tamanho / 2) {
            atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.next;
            }
        } else {
            atual = fim;
            for (int i = tamanho - 1; i > posicao; i--) {
                atual = atual.previous;
            }
            atual = atual.previous;
        }
        
        novoNode.next = atual.next;
        novoNode.previous = atual;
        atual.next.previous = novoNode;
        atual.next = novoNode;
        tamanho++;
    }
    
    // Buscar elemento
    public boolean buscar(int data) {
        NodeDuplo atual = inicio;
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
        
        NodeDuplo atual = inicio;
        while (atual != null && atual.data != data) {
            atual = atual.next;
        }
        
        if (atual == null) {
            return false;
        }
        
        if (atual == inicio) {
            inicio = atual.next;
            if (inicio != null) {
                inicio.previous = null;
            }
        } else if (atual == fim) {
            fim = atual.previous;
            if (fim != null) {
                fim.next = null;
            }
        } else {
            atual.previous.next = atual.next;
            atual.next.previous = atual.previous;
        }
        
        tamanho--;
        return true;
    }
    
    // Listar do início ao fim
    public void listarInicioFim() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = inicio;
        System.out.print("Lista Dupla (Início->Fim): ");
        while (atual != null) {
            System.out.print(atual.data + " <-> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
    
    // Listar do fim ao início
    public void listarFimInicio() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = fim;
        System.out.print("Lista Dupla (Fim->Início): ");
        while (atual != null) {
            System.out.print(atual.data + " <-> ");
            atual = atual.previous;
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
