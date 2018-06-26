package br.qxd.ufc.musician_estore_center.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.qxd.ufc.musician_estore_center.model.Produto;

@Repository
@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findByClasseProduto(String classeProduto);
	
	Produto findByMarca(String marca);

	Produto findByModelo(String modelo);

	Produto findByAno(Integer ano);
}