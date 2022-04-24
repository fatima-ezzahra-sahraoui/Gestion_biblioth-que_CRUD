package ma.emsi.BiblioSpring.controller;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.BiblioSpring.entities.Livre;
import ma.emsi.BiblioSpring.repos.LivreRepo;
import ma.emsi.BiblioSpring.service.LivreService;
@RestController
public class LivreController {
	@Autowired
	 private LivreService livreService;
	 @OrderBy("ISBN ASC")

	@GetMapping("emsi_api/livres")
	public List<Livre> livres(){
		return livreService.getLivres();
		
	}
	  @PostMapping("emsi_api/addLivre")
	    public Livre addProduct(@RequestBody Livre livre) {
	        return livreService.saveLivre(livre);
	    }
	@GetMapping("emsi_api/livres/{id}")
	public Livre livre(@PathVariable Integer id){
		return livreService.getLivrebyID(id);
	}
	@PutMapping("emsi_api/update")
	public Livre updateLivre(@RequestBody Livre livre){
		return livreService.updateLivre(livre);
	}
	 @DeleteMapping("emsi_api/delete/{id}")
	    public String deleteLivre(@PathVariable int id) {
	        return livreService.deleteLivre(id);
	    }
}
