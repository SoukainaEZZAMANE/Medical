/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Soukaina
 */
@MappedSuperclass
public class Personne extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	// attributs d'une persinne
	@Column(length = 5)
	private String titre;
	@Column(length = 20)
	private String nom;
	@Column(length = 20)
	private String prenom;

	// constructeur par défaut
	public Personne() {
	}

	// constructeur avec paramètres
	public Personne(String titre, String nom, String prenom) {
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
	}

	// toString
	public String toString() {
		return String.format("Personne[%s, %s, %s, %s, %s]", id, version, titre, nom, prenom);
	}

	// getters et setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
