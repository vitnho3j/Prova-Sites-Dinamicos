package Prova.model.entity;

public class Administrador {
    private int id;
    private Categoria categoria;

    public Administrador(Categoria categoria) {
        this.categoria = categoria;
    }
}
