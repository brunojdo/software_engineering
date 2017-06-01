@Test
public void testPersistePessoa() {
    Pessoa pessoa = inserirPessoa(criarPessoa(TipoPessoa.FISICA));

    Assert.assertNotNull(pessoa.getId());
}
 
/**
* Testa o lançamento de exceção ao se persistir uma pessoa com tipo null
*/
@Test(expectedExceptions = { javax.transaction.RollbackException.class })
public void testPersistePessoaTipoNull() {
    Pessoa pessoa = criarPessoa(TipoPessoa.FISICA);
    pessoa.setTipo(null);

    inserirPessoa(pessoa);
}

@Test(expectedExceptions = { javax.transaction.RollbackException.class })
public void testPersistePessoaDataUltimaEdicaoNull() {
    Pessoa pessoa = criarPessoa(TipoPessoa.FISICA);
    pessoa.setUltimaEdicaoNome(null);

    inserirPessoa(pessoa);
}


