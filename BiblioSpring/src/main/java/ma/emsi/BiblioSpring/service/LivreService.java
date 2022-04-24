package ma.emsi.BiblioSpring.service;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.BiblioSpring.entities.Livre;
import ma.emsi.BiblioSpring.repos.LivreRepo;
@Service
public class LivreService {
	@Autowired
	

	 private LivreRepo livreRepo;
	 @OrderBy("ISBN ASC")
	 public List<Livre> getLivres() {
	        return livreRepo.findAll();
	    }

	    public Livre getLivrebyID(int id) {
	        return livreRepo.findById(id).orElse(null);
	    }
	public Livre updateLivre(Livre livre) {
		Livre existingLivre= livreRepo.findById(livre.getID()).orElse(null);
		existingLivre.setAuteur(livre.getAuteur());
		existingLivre.setDispo(livre.getDispo());
		return livreRepo.save(existingLivre);
	}
	public String deleteLivre(int id) {
        livreRepo.deleteById(id);
        return "livre supprime !! " + id;
    }

	

	public Livre saveLivre(Livre product) {
        return livreRepo.save(product);
    }

}
