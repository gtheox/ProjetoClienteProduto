package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

	public static void main(String[] args) {
		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();
		Endereco objEndereco = new Endereco();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente:")));
		objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cliente")));
		
		objProduto.setCodigo(3123213);
		objProduto.setTipo("celular");
		objProduto.setMarca("apple");
		objProduto.setValor(7999.99);
		
		objEndereco.setLougradouro("Rua Apito do Vapor");
		objEndereco.setNumero(350);
		objEndereco.setCep("90826-162");
		objEndereco.setBairro("Cidade Tiradentes");
		
		objCliente.setEndereco(objEndereco);
		
		System.out.println("Nome do cliente: " + objCliente.getNome() +
							"\nIdade do cliente: " + objCliente.getIdade() +
							"\nAltura do cliente: " + objCliente.getAltura());
		
		System.out.println("\n\nCódigo do produto: " + objProduto.getCodigo() +
							"\nTipo do produto: " + objProduto.getTipo() + 
							"\nMarca: " + objProduto.getMarca() + 
							"\nValor: " + objProduto.getValor());
		
		System.out.println("\n\nLogradouro: " + objCliente.getEndereco().getLougradouro() +
							"\nNumero: " + objCliente.getEndereco().getNumero() +
							"\nCep: " + objCliente.getEndereco().getCep() + 
							"\nBairro: " + objCliente.getEndereco().getBairro());
		
							

	}

}
