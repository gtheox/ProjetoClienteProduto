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
		
		objCliente.setEndereco(objEndereco);
		
		objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:")));
		objProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo do produto:"));
		objProduto.setMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:")));
		
		objEndereco.setLougradouro(JOptionPane.showInputDialog("Digite o endereço:"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número:")));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP:"));
		objEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digiite o bairro:"));1
 
		System.out.println("INFORMAÇÕES DO CLIENTE" +
							"\nNome do cliente: " + objCliente.getNome() + 
							"\nIdade do cliente: " + objCliente.getIdade() + 
							"\nAltura do cliente: " + objCliente.getAltura() + 
							"\n\nENDEREÇO DO CLIENTE " + 
							"\nLogradouro: " + objCliente.getEndereco().getLougradouro()+ 
							"\nNumero: " + objCliente.getEndereco().getNumero() + 
							"\nCep: " + objCliente.getEndereco().getCep() + 
							"\nComplemento: " + objCliente.getEndereco().getComplemento() + 
							"\nBairro: " + objCliente.getEndereco().getBairro() + 
							"\n\nINFORMAÇÕES DO PRODUTO" + 
							"\nCódigo do produto: " + objProduto.getCodigo() + 
							"\nTipo do produto: " + objProduto.getTipo() + 
							"\nMarca: " + objProduto.getMarca() + 
							"\nValor: " + objProduto.getValor());
		

	}

}
