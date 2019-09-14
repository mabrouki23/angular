package org.hocine.catal.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit implements Serializable {
@Id@GeneratedValue(strategy = GenerationType.AUTO)
 private  Long id ;
 private String designation;
 private double prix;
 private double quantite;

}
