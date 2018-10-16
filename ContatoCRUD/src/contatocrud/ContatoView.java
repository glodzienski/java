package contatocrud;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoView {

    Scanner teclado = new Scanner(System.in);

    int exibirMenu() {

        System.out.println("Escolha uma opção:");
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar");
        System.out.println("3- Atualizar");
        System.out.println("4- Deletar");
        System.out.println("5- Listar por Nome");
        System.out.println("6- Listar adultos");
        System.out.println("0- Sair");

        return teclado.nextInt();

    }

    void telaCadastro(Contato novo) {

        System.out.println("Entre com o nome do contato:");
        novo.setNome(teclado.next());
        System.out.println("Entre com o Email do contato:");
        novo.setEmail(teclado.next());
        System.out.println("Entre com o whats do contato:");
        novo.setWhats(teclado.next());
        System.out.println("Entre com a idade do contato:");
        novo.setIdade(teclado.nextInt());
    }

    void exibirContatos(ArrayList<Contato> contatos) {

        for (Contato contato : contatos) {
            System.out.println("------------------------");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Whats: " + contato.getWhats());
            System.out.println("Idade: " + contato.getIdade());
        }
        System.out.println("------------------------");

    }

    String buscarNome() {
        System.out.println("Digite o nome que deseja buscar:");
        return teclado.next();
    }

    void exibeContato(Contato contato) {

        if (contato == null) {
            System.out.println("Contato não existe");
            return;
        }

        System.out.println("------------------------");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Whats: " + contato.getWhats());
        System.out.println("Idade: " + contato.getIdade());
        System.out.println("------------------------");

    }

    void resposta(Contato con) {
        if (con == null) {
            System.out.println("Contato não encontrado");
        } else {
            System.out.println("Operação realizada com sucesso");
        }

    }

}
