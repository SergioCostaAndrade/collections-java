package Map.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome,  double preco, int quantidade){
        estoqueProdutosMap.put(cod,new Produto(nome,preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "produto1", 10d, 10);
        estoqueProdutos.adicionarProduto(2L, "produto2", 13d, 10);
        estoqueProdutos.adicionarProduto(3L, "produto3", 9d, 10);
        estoqueProdutos.adicionarProduto(4L, "produto4", 15, 10);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

    }

}
