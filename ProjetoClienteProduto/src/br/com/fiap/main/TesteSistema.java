package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteSistema {

	public static void main(String[] args) {
		
		//instanciar 
		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();
		
		//entrada 
		objCliente.setNome("Gabriel Teodoro");
		objCliente.setIdade(18);
		objCliente.setAltura(1.87);
		
		objProduto.setCodigo(55321321);
		objProduto.setTipo("Celular");
		objProduto.setMarca("Apple");
		objProduto.setValor(7299.99);
		
		//saida 
		System.out.println("Nome do cliente: " + objCliente.getNome() + 
							"\nIdade: " + objCliente.getIdade() + 
							"\nAltura: " + objCliente.getAltura());
		
		System.out.println ("\n\nCódigo: " + objProduto.getCodigo() + 
							"\nTipo: " + objProduto.getTipo() + 
							"\nMarca: "+ objProduto.getMarca() + 
							"\nValor: " + objProduto.getValor());
	}

}
