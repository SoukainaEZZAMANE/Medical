/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Soukaina
 */
@Entity
@Table(name = "medecins")
public class Medecin extends Personne {

	private static final long serialVersionUID = 1L;

	// constructeur par défaut
	public Medecin() {
	}

	// constructeur avec paramètres
	public Medecin(String titre, String nom, String prenom) {
		super(titre, nom, prenom);
	}

	public String toString() {
		return String.format("Medecin[%s]", super.toString());
	}

}

