package br.edu.ifpb.pweb2.bizurada.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.bizurada.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByName(String nome);
}