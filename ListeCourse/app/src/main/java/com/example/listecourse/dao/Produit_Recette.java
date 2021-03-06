package com.example.listecourse.dao;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Produit_Recette")
public class Produit_Recette {

    @DatabaseField (
            columnName = "idProduit",
            foreign = true,
            foreignAutoRefresh = true,
            canBeNull = false,
            index = true,
            columnDefinition = "INTEGER CONSTRAINT FK_Produit_Recette_Produit REFERENCES Produit(idProduit) ON DELETE CASCADE"
    )
    private Produit produit;

    @DatabaseField (
            columnName = "idRecette",
            foreign = true,
            foreignAutoRefresh = true,
            canBeNull = false,
            index = true,
            columnDefinition = "INTEGER CONSTRAINT FK_Produit_Recette_Recette REFERENCES Recette(idRecette) ON DELETE CASCADE"
    )
    private Recette recette;

    @DatabaseField (
            columnName = "idTaille",
            foreign = true,
            foreignAutoRefresh = true,
            canBeNull = true,
            index = true,
            columnDefinition = "INTEGER CONSTRAINT FK_Produit_Recette_Taille REFERENCES Taille(idTaille) ON DELETE CASCADE"
    )
    private Taille taille;

    @DatabaseField( columnName = "quantite")
    private int quantite;


    public Produit_Recette(Recette recette, Produit produit, Taille taille, int quantite) {
        this.recette = recette;
        this.produit = produit;
        this.taille = taille;
        this.quantite = quantite;
    }

    public Produit_Recette() {
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
