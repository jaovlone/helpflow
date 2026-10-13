package main.java.br.com.helpflow.repository;
import br.com.helpflow.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByNome(String nome);

    Optional<Usuario> findById(UUID id);

    boolean existsByEmail(String email);
    boolean existsByNome(String nome);
    boolean existsById(UUID id);

    List<Usuario> findAllByAtivoTrue();
    List<Usuario> findAllByEmailExists(String email);

}
