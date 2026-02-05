# Simulador Acadêmico Unisinos 

Ferramenta desenvolvida em Java para automatizar o cálculo de médias acadêmicas, seguindo rigorosamente as diretrizes da Unisinos.

## Funcionalidades
- **Cálculo de Média Final:** Baseado nos pesos de 33% (Grau A) e 67% (Grau B).
- **Projeção de Meta:** Calcula automaticamente a nota mínima necessária no Grau B para aprovação direta.
- **Try-Catch:** Tratamento de erros de entrada (InputMismatchException) para garantir uma execução sem interrupções.
- **Interface Interativa:** Menu em loop para múltiplos cálculos em uma única sessão.

## Regra de Negócio
Conforme o regulamento da instituição:
- $GA \times 0.33 + GB \times 0.67 = Grau Final$
- Aprovação direta com média $\ge 6.0$.

## Tecnologias
- Java 22
