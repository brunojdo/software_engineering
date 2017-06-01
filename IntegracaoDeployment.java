import dao.PessoaDAO;
import pojo.Pessoa;

public abstract class IntegracaoDeployment { 

	@Inject
	protected PessoaDAO pessoaDAO;
  
	@PersistenceContext
	private EntityManager entityManager;
  
	protected Pessoa inserirPessoa(Pessoa pessoa) {
		pessoaDAO.persistirPessoa(pessoa);
		entityManager.detach(pessoa);
		return pessoa;
	}
}
