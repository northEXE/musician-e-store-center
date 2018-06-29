package br.qxd.ufc.musician_estore_center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.qxd.ufc.musician_estore_center.model.Produto;
import br.qxd.ufc.musician_estore_center.repositories.ProdutoRepository;
import br.qxd.ufc.musician_estore_center.utils.FileUtilsProjeto;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void adicionarProduto(Produto produto, MultipartFile imagem) {
		String caminho = "src/main/resources/static/imagens/" + produto.getAno() +  produto.getMarca() + produto.getModelo() + ".jpg";
		FileUtilsProjeto.salvarImagem(caminho, imagem);

		produtoRepository.save(produto);
	}

	public List<Produto> retornarTodosOsProdutos() {
		return produtoRepository.findAll();
	}
	
	public Produto procurarProdutoPorId(Long id) {
		return produtoRepository.getOne(id);
	}
	
	public Produto procurarProdutoPorClasse(String classeProduto) {
		return procurarProdutoPorClasse(classeProduto);
	}
	
	public void removerProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}