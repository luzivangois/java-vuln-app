package br.com.advocacia.repository;

import br.com.advocacia.entities.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

    Processo save(Processo processo);
    List<Processo> findAll();
    Optional<Processo> findById(Long id);
    void deleteById(Long id);
}