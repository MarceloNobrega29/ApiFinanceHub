package br.com.financehub.ApiFinanceHub.repository;

import br.com.financehub.ApiFinanceHub.enums.CategoriaTransacaoEnum;
import br.com.financehub.ApiFinanceHub.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    Optional<Transacao> findByTipoCategoria(CategoriaTransacaoEnum tipoCategoria);
}
