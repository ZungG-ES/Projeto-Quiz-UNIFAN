public class Quiz {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int totalQuestoes = 15;

        // Cabeçalho
        System.out.println("Faculdade: Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: Adrian Rezende");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("\nBem-vindo ao quiz sobre o Mundo Mágico de Hogwarts!");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.\n");

        // Criando as questões
        Questao[] questoes = new Questao[totalQuestoes];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual é o nome completo de Alvo Dumbledore?";
        questoes[0].opcaoA = "A) Alvo Percival Wulfrico Brian Dumbledore";
        questoes[0].opcaoB = "B) Alvo Brian Dumbledore";
        questoes[0].opcaoC = "C) Alvo Percival Dumbledore";
        questoes[0].opcaoD = "D) Alvo Wulfrico Dumbledore";
        questoes[0].opcaoE = "E) Alvo Percival Wulfrico Dumbledore";
        questoes[0].correta = "A";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "Qual é a casa de Hogwarts de Harry Potter?";
        questoes[1].opcaoA = "A) Sonserina";
        questoes[1].opcaoB = "B) Lufa-Lufa";
        questoes[1].opcaoC = "C) Corvinal";
        questoes[1].opcaoD = "D) Grifinória";
        questoes[1].opcaoE = "E) Beauxbatons";
        questoes[1].correta = "D";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual é o nome do elfo doméstico de Harry Potter?";
        questoes[2].opcaoA = "A) Dobby";
        questoes[2].opcaoB = "B) Kreacher";
        questoes[2].opcaoC = "C) Winky";
        questoes[2].opcaoD = "D) Hokey";
        questoes[2].opcaoE = "E) None of the above";
        questoes[2].correta = "A";

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "Qual é o patrono de Hermione Granger?";
        questoes[3].opcaoA = "A) Lontra";
        questoes[3].opcaoB = "B) Cervo";
        questoes[3].opcaoC = "C) Lebre";
        questoes[3].opcaoD = "D) Gato";
        questoes[3].opcaoE = "E) Fênix";
        questoes[3].correta = "A";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual é a posição de Harry Potter no time de Quadribol?";
        questoes[4].opcaoA = "A) Batedor";
        questoes[4].opcaoB = "B) Apanhador";
        questoes[4].opcaoC = "C) Artilheiro";
        questoes[4].opcaoD = "D) Goleiro";
        questoes[4].opcaoE = "E) Nenhuma das opções";
        questoes[4].correta = "B";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "Qual é o nome do pai de Draco Malfoy?";
        questoes[5].opcaoA = "A) Lucius Malfoy";
        questoes[5].opcaoB = "B) Severus Snape";
        questoes[5].opcaoC = "C) Sirius Black";
        questoes[5].opcaoD = "D) Remus Lupin";
        questoes[5].opcaoE = "E) Arthur Weasley";
        questoes[5].correta = "A";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual é o nome do professor de Poções no primeiro ano de Harry?";
        questoes[6].opcaoA = "A) Minerva McGonagall";
        questoes[6].opcaoB = "B) Filius Flitwick";
        questoes[6].opcaoC = "C) Severus Snape";
        questoes[6].opcaoD = "D) Pomona Sprout";
        questoes[6].opcaoE = "E) Gilderoy Lockhart";
        questoes[6].correta = "C";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "Qual é o nome do mapa que mostra todos os segredos de Hogwarts?";
        questoes[7].opcaoA = "A) Mapa do Maroto";
        questoes[7].opcaoB = "B) Mapa do Peregrino";
        questoes[7].opcaoC = "C) Mapa do Explorador";
        questoes[7].opcaoD = "D) Mapa do Viajante";
        questoes[7].opcaoE = "E) Mapa do Aventureiro";
        questoes[7].correta = "A";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual é o nome do banco dos bruxos?";
        questoes[8].opcaoA = "A) Gringotes";
        questoes[8].opcaoB = "B) Banco de Hogwarts";
        questoes[8].opcaoC = "C) Banco de Hogsmeade";
        questoes[8].opcaoD = "D) Banco de Diagon Alley";
        questoes[8].opcaoE = "E) Banco de Beauxbatons";
        questoes[8].correta = "A";


        // Lógica para responder às questões
        for (int i = 0; i < totalQuestoes; i++) {
            questoes[i].escrevaQuestao();
            String respostaUsuario = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Calculando a porcentagem de acertos
        double porcentagemAcertos = ((double) acertos / totalQuestoes) * 100;

        // Exibindo o resultado final
        System.out.println("Resultado Final:");
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}