package git.spring.produtosapi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import git.spring.produtosapi.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
