package ma.emsi.BiblioSpring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.BiblioSpring.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre,Integer>{

}
