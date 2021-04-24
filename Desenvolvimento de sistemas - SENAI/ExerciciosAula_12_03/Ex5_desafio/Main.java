package sample;

import sample.model.ItensDoPedido;
import sample.model.Pedido;

public class Main {

    public static void main(String[] args) {

        /*ItensDoPedido itensDoPedido = new ItensDoPedido();

        itensDoPedido.setProduto("Uva", 4.70);

        System.out.println(itensDoPedido);*/

        Pedido pedido = new Pedido();
        pedido.setDescricao("Pedido do iFood");
        pedido.setData("03/05/2021");
        pedido.addProduto("Uva", 5.4);
        pedido.addProduto("Laranja", 2.6);
        pedido.addProduto("Banana", 1.6);

        System.out.println(pedido);

    }

}
