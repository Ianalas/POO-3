package models;

import classAbstract.ItemBiblioteca;
import interfaces.IRegistravel;

public class Livro extends ItemBiblioteca implements IRegistravel {
    boolean flag = true;

    public Livro( String titulo, String autor, short ano, boolean flag) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        this.flag = flag;
    }

    @Override
    public void registrarEntrada() {
        flag = true;
        System.out.println("Este livro chamado "+ getTitulo() + " está disponível!" );
    }

    @Override
    public void registrarSaida() {
        flag = false;
        System.out.println("Este livro chamado "+ getTitulo() + " NÃO está disponível!" );
    }

    @Override
    public String toString() {
        return "Livro{ " +
                super.toString() +
                " flag= " + flag +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + flag;
    }
}