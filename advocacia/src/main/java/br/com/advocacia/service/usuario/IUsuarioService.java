package br.com.advocacia.service.usuario;

import br.com.advocacia.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    Optional<Usuario> findByLogin(String login);
    boolean existsByLogin(String login);

    Usuario save(Usuario usuario);

    void deleteById(Long id);

    Optional<Usuario> findById(Long id);
    List<Usuario> findAll();

    boolean verifyPassword(String password, Usuario usuario);

}
