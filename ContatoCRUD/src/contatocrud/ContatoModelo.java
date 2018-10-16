package contatocrud;

import java.util.ArrayList;

public class ContatoModelo {

    ArrayList<Contato> contatos = new ArrayList();

    void salvar(Contato novo) {
        contatos.add(novo);
    }

    ArrayList<Contato> listarContatos() {
        return contatos;
    }
    
    ArrayList<Contato> listarContatosAdultos(){
        ArrayList<Contato> contatosAdultos = new ArrayList();
        for(Contato contato: contatos){
            if(contato.getIdade() > 17){
                contatosAdultos.add(contato);
            }
        }
        return contatosAdultos;
    }

    Contato atualizarContato(String nomeBuscado, Contato novo) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeBuscado)) {
                contatos.remove(contato);
                contatos.add(novo);
                return novo;
            }
        }
        return null;
    }
    Contato buscarContato(String nomeBuscado) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeBuscado)) {
                return contato;
            }
        }
        return null;

    }
    Contato removerContato(String nomeBuscado) {
        for (Contato contato : contatos) {
            if(contato.getNome().equals(nomeBuscado)){
                contatos.remove(contato);
                return contato;
            }
        }
        return null;
    }
}
