package services;

import interfaces.IGerenciavel;
import models.Livro;
import utils.FileUtils;

import java.util.List;
import java.util.Scanner;


public class CadastroLivroService implements IGerenciavel {
    Scanner scanner = new Scanner(System.in);

    public static void alugarLivro(String titulo, short ano) /*throws Excpetion Se tiver true*/ {

        FileUtils.setStatusBook(titulo,ano);
    }

    public static void devolverLivro(String titulo, short ano){

        FileUtils.setStatusBook(titulo,ano, false);
    }


    @Override
    public void adicionar() {
        System.out.println("===Cadastro de Livros===\n");
        System.out.println("Nome do Livro");
        String titulo = scanner.nextLine();

        System.out.println("Nome do Autor");
        String autor = scanner.nextLine();

        System.out.println("Ano de Edição do Livro");
        short ano = scanner.nextShort();
        scanner.nextLine();
        Livro book = new Livro(titulo,autor,ano, false);

        FileUtils.salvarNoArquivo(book);
        System.out.println("Livro adicionado com sucesso.");
    }

    @Override
    public void remover() {
        System.out.println("===Remoção de Livros===\n");
        System.out.println("Nome do Livro\n");
        String titulo = scanner.nextLine();
        System.out.println("Ano de Edição do Livro");
        short ano = scanner.nextShort();
        scanner.nextLine();



        System.out.println("Livro adicionado com sucesso.");
    }

    @Override
    public void listar() {
        List<Livro> livros = FileUtils.lerArquivos();
        System.out.println("CadLivroServ"+livros);

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano da edição: " + livro.getAno());
            System.out.println("Disponível: " + (!livro.isFlag() ? "Sim" : "Não"));
            System.out.println("-----------------------------");
        }
    }
}