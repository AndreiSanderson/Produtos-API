package git.spring.produtosapi.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import git.spring.produtosapi.Repository.ProdutoRepository;
import git.spring.produtosapi.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoControler {

    private ProdutoRepository produtoRepository;

    public ProdutoControler(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido! " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        
        produtoRepository.save(produto);
        return produto;
    }
}
