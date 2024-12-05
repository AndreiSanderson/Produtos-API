package git.spring.produtosapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import git.spring.produtosapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
