package ma.emsi.BiblioSpring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.emsi.BiblioSpring.entities.Livre;
import ma.emsi.BiblioSpring.repos.LivreRepo;

@SpringBootApplication
public class BiblioSpringApplication implements CommandLineRunner {
	@Autowired
 private LivreRepo livreRepo;
	public static void main(String[] args) {
		SpringApplication.run(BiblioSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		livreRepo.save(new Livre(1,"the winner","MaisonF",new Date(),"fati_sahraoui",5,50,new Date(),true));
		livreRepo.save(new Livre(2,"the survivor","Mais",new Date(),"med_sahraoui",6,60,new Date(),true));
livreRepo.findAll().forEach(a->{
	System.out.println(a.toString());
});
	}

}
