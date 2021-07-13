package Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Categoria;
import Model.Produto;
import Repository.CategoriaRepository;
import Repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repositoryProduto;
	
	@Autowired
	private CategoriaRepository repositoryCategoria;
	
	public Produto novoProduto(Produto novoProduto) {
		return repositoryProduto.save(novoProduto);
	}
	
		public Optional<Produto> novoItemCategorisado(Long idProduto, Long idCategoria) {
			Optional<Categoria> categoria = repositoryCategoria.findById(idCategoria);
			Optional<Produto> produto = repositoryProduto.findById(idProduto);
			
			if(categoria.isPresent() && produto.isPresent()) {
				produto.get().getListaDeCategoria().add(categoria.get());
				return Optional.ofNullable(repositoryProduto.save(produto.get()));
			}
			return Optional.empty();
		}

}
