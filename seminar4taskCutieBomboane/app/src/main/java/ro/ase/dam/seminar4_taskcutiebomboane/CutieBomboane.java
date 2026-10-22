package ro.ase.dam.seminar4_taskcutiebomboane;

import java.io.Serializable;

enum tip {
    CIOCOLATA, VANILIE, FRUCTE_DE_PADURE, CIOCOLATA_SI_ALUNE
}

public class CutieBomboane implements Serializable {
    String name;
    String marca;
    float gramaj;
    int numar_bomboane;
    String data_expirare;
    boolean discount;

    tip diversitateBomboane;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getGramaj() {
        return gramaj;
    }

    public void setGramaj(float gramaj) {
        this.gramaj = gramaj;
    }

    public int getNumar_bomboane() {
        return numar_bomboane;
    }

    public void setNumar_bomboane(int numar_bomboane) {
        this.numar_bomboane = numar_bomboane;
    }

    public String getData_expirare() {
        return data_expirare;
    }

    public void setData_expirare(String data_expirare) {
        this.data_expirare = data_expirare;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public tip getDiversitateBomboane() {
        return diversitateBomboane;
    }

    public void setDiversitateBomboane(tip diversitateBomboane) {
        this.diversitateBomboane = diversitateBomboane;
    }

    @Override
    public String toString() {
        return "CutieBomboane{" +
                "nume='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", gramaj=" + gramaj +
                ", numar_bomboane=" + numar_bomboane +
                ", data_expirare='" + data_expirare + '\'' +
                ", discount=" + discount +
                ", diversitateBomboane=" + diversitateBomboane +
                '}';
    }
}
