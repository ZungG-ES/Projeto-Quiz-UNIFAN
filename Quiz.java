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