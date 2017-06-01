package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.senai.dao.FornecedorDAO;
import br.com.senai.model.Fornecedor;

public class FornecedorBean {
	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	public FornecedorBean() {
		fornecedores = new FornecedorDAO().listar();
	}
	
	public String salvar() throws InterruptedException {
		//fornecedores.add(fornecedor);
		new FornecedorDAO().salvar(fornecedor);
		fornecedores = new FornecedorDAO().listar();
		fornecedor = new Fornecedor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor salvo com sucesso!"));
		return "fornecedor_list?faces-redirect=true";
	}
	
	public String editar(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
		return "fornecedor_cad?faces-redirect=true";
	}

	public void preparaExclusao(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void excluir() {
		new FornecedorDAO().delete(fornecedor);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor deletado com sucesso!"));
		fornecedores = new FornecedorDAO().listar();
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	
}
