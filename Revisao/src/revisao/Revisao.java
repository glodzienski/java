package revisao;

public class Revisao {

    public static void main(String[] args) {
//        Curso curso01 = new Curso("Sistemas para Internet",1200);
//        Aluno aluno01 = new Aluno("Crystopher",120,1700028,curso01);
//        
//        curso01.descrever();
//        aluno01.descrever();
//        aluno01.pagamento();
        JogadorJokenpo Crys = new JogadorJokenpo("Crystopher");
        JogadorJokenpo Fer = new JogadorJokenpo("Fernanda");
        JogadorJokenpo Fuck = new JogadorJokenpo("FUCK YOU FDP");
        
        disputa(Crys,Fer);
        disputa(Fer,Fuck);
        disputa(Fuck,Crys);
        
        Crys.descrever();
        Fer.descrever(); 
        Fuck.descrever(); 
    }
    
    static void disputa(JogadorJokenpo a, JogadorJokenpo b){
        String jogadaCrys = a.jogar();
        String jogadaFer = b.jogar();
        
        if (jogadaCrys.equals(jogadaFer)) {
            a.empates++;
            b.empates++;
        } else if ((jogadaCrys.equals("papel") && jogadaFer.equals("pedra")) ||
                  (jogadaCrys.equals("tesoura") && jogadaFer.equals("papel")) ||
                  (jogadaCrys.equals("pedra") && jogadaFer.equals("tesoura"))){
            a.vitorias++;
            b.derrotas++;
        } else {
            a.derrotas++;
            b.vitorias++;
        }   
    }
        
}
