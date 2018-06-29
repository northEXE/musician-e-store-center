package br.qxd.ufc.musician_estore_center.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.qxd.ufc.musician_estore_center.model.Produto;
import br.qxd.ufc.musician_estore_center.services.ProdutoService;

@Controller
@RequestMapping(path="/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(path="/")
	public ModelAndView listarProdutos() {
		List<Produto> produtos = produtoService.retornarTodosOsProdutos();
		ModelAndView model = new ModelAndView("produtos");
		model.addObject("todosOsProdutos", produtos);
		return model;
	}
	
	@RequestMapping(path="/cadastro-produto")
	public ModelAndView cadastroProduto() {
		ModelAndView model = new ModelAndView("cadastro-produto");
		model.addObject("produto", new Produto());
		return model;
	}
	
	@PostMapping(path="/salvar-produto")
	public ModelAndView salvarProduto(Produto produto,@RequestParam(value="imagem") MultipartFile imagem) {
		produtoService.adicionarProduto(produto, imagem);
		ModelAndView model = new ModelAndView("produtos");
		model.addObject("mensagem", "Produto cadastrado com sucesso!");
		
		return model;
	}
	
}
