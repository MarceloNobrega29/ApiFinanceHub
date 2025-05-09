package br.com.financehub.ApiFinanceHub.repository;

import br.com.financehub.ApiFinanceHub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmailUsuario(String emailUsuario);

    Optional<Usuario> findByEmailUsuarioAndCpfUsuario(String emailUsuario, String cpfUsuario);

    @Override
    void delete(Usuario usuario);
}
