package List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {

        itemList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i:itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }
    public Double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i:itemList) {
            valorTotal += (i.getPreço() * i.getQuantidade());
        }
        return valorTotal;
    }
    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("Vassoura", 10.00, 2);
        carrinho.adicionarItem("Penico", 15.00, 1);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("Penico");
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();

    }
}

