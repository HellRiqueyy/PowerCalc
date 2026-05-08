# ⚡ PowerCalc - Calculadora de Consumo Elétrico
## 📝 Descrição do Projeto
O **PowerCalc** é um aplicativo Android desenvolvido para auxiliar no controle de gastos energéticos domésticos. Ele permite que o usuário calcule de forma rápida e intuitiva quanto cada aparelho eletrônico consome em sua residência e qual o impacto financeiro na conta de luz mensal.
Este projeto faz parte do portfólio de estudos em **Desenvolvimento Mobile**, utilizando componentes nativos do Android Studio.
---
##  Interface do Aplicativo
*Aqui você deve inserir os prints do seu app funcionando*
<div align="center">
  <img src="https://via.placeholder.com/200x400.png?text=Tela+Principal" width="200" alt="Tela Principal">
  <img src="https://via.placeholder.com/200x400.png?text=Resultado+Calculado" width="200" alt="Resultado">
</div>
---
##  Regras de Negócio e Fórmulas
O aplicativo realiza o processamento dos dados seguindo as fórmulas matemáticas abaixo:
1. **Consumo de Energia (CE):**
   - Fórmula: `CE = (Potência × Tempo) / 1000`
   - Unidade: Quilowatts-hora (kWh)
2. **Custo da Energia (C):**
   - Fórmula: `C = CE × Preço do kWh`
   - Unidade: Moeda local (R$)
---

## Tecnologias e Ferramentas
Para o desenvolvimento deste projeto, foram utilizadas:
- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Layout:** XML (ConstraintLayout e Material Design)
- **IDE:** [Android Studio](https://developer.android.com/studio)
- **Gerenciador de Dependências:** Gradle
---
##  Funcionalidades Principais
- [x] Cadastro do nome do aparelho eletrônico.
- [x] Cálculo automático de consumo em kWh.
- [x] Cálculo de custo financeiro baseado na tarifa local.
- [x] Validação de campos (impede campos vazios ou valores zerados).
- [x] Formatação de moeda e casas decimais.
---
## Como testar o projeto
Para clonar e executar este aplicativo, você precisará do [Git](https://git-scm.com) e do [Android Studio](https://developer.android.com/studio) instalados.
1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/PowerCalc.git](https://github.com/HellRiqueyy/PowerCalc.git)
