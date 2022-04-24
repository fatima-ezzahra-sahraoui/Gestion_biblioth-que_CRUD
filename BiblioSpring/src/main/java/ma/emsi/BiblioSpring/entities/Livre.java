package ma.emsi.BiblioSpring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
@Entity
@Table(name="Livres")
@Data @NoArgsConstructor @AllArgsConstructor @ToString 
public class Livre {
	@NonNull
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	@NonNull 
	@Column(length=50)
	private String Titree;
	@NonNull
    @Column(updatable = false)
	private String Maison_Edition;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date Date_Sortie;
	@NonNull
	private String Auteur;
	@NonNull
	private Integer Nbr_Pages;
	@NonNull
    @Column(updatable = false ,unique=true)
	private Integer ISBN;
	@NonNull
	private Date Date_Der_Consult;
	@NonNull
	private Boolean Dispo;





}
