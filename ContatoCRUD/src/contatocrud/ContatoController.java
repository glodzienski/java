package contatocrud;

import java.util.ArrayList;

public class ContatoController {

    void loopPrincipal() {

        ContatoView v = new ContatoView();
        ContatoModelo m = new ContatoModelo();
        int op;
        do {
            op = v.exibirMenu();

            if (op == 1) { //Cadastrar
                Contato novo = new Contato();
                v.telaCadastro(novo);
                m.salvar(novo);
            } else if (op == 2) {
                ArrayList<Contato> contatos = m.listarContatos();
                v.exibirContatos(contatos);
            } else if (op == 3) { //Atualizar
                String nomeBuscado = v.buscarNome();
                Contato novo = new Contato();
                v.telaCadastro(novo);

                Contato atualizado = m.atualizarContato(nomeBuscado,novo);
                v.resposta(atualizado);
                
            }else if(op == 4){//Remover
                String nomeBuscado = v.buscarNome();
                Contato removido = m.removerContato(nomeBuscado);
                v.resposta(removido);

            } else if (op == 5) {//Buscar por nome
                String nomeBuscado = v.buscarNome();
                Contato buscado = m.buscarContato(nomeBuscado);
                v.exibeContato(buscado);

            } else if (op == 6){//Listar Adultos
                ArrayList<Contato> contatosAdultos = m.listarContatosAdultos();
                v.exibirContatos(contatosAdultos);
            }

        } while (op != 0);

    }

}
