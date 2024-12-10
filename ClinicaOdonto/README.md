# Sistema de Gestão para Clínica Odontológica

## Descrição
Este sistema foi desenvolvido em Java para gerenciar pacientes, dentistas e consultas em uma clínica odontológica. Ele permite o cadastro, edição e visualização de informações de maneira simples e intuitiva.

---

## Funcionalidades

1. **Gerenciamento de Pacientes**:
   - Cadastro de novos pacientes.
   - Visualização de todos os pacientes registrados.

2. **Gerenciamento de Dentistas**:
   - Cadastro de novos dentistas.
   - Visualização de todos os dentistas registrados.

3. **Gerenciamento de Consultas**:
   - Cadastro de consultas entre pacientes e dentistas.
   - Visualização de todas as consultas registradas.
   - Listagem de consultas específicas por paciente.

4. **Validação de Dados**:
   - Verificação de CPF e CRM para evitar registros inválidos.

5. **Interface de Menu**:
   - Navegação por um menu interativo no terminal.

---

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **Eclipse IDE**: Ambiente de desenvolvimento integrado.

---

## Instruções de Uso

### Pré-requisitos
1. Ter o **Java** instalado no computador.
2. Instalar o **Eclipse IDE** (ou outra IDE de sua preferência).

### Configuração
1. Clone o repositório:
   ```bash
   git clone (https://github.com/victoriafe-sa/ClinicaOdonto.git)
   ```
2. Importe o projeto no Eclipse IDE:
   - Abra o Eclipse.
   - Vá para `File > Import > Existing Projects into Workspace`.
   - Selecione o diretório do projeto clonado.

3. Execute o arquivo `Main.java` para iniciar o sistema.

### Utilizando o Sistema
1. Ao executar o sistema, você verá um menu principal com as seguintes opções:

```
Sistema de Gestão da Clínica Odontológica
1. Gerenciar Pacientes
2. Gerenciar Dentistas
3. Gerenciar Consultas
4. Visualizar Pacientes
5. Visualizar Dentistas
6. Visualizar Consultas
7. Sair
Escolha uma opção: 
```

2. Escolha a opção desejada digitando o número correspondente e siga as instruções exibidas na tela.
   - Para cadastrar ou listar, siga os passos informados no terminal.

3. Para encerrar o sistema, selecione a opção `7. Sair` no menu principal.

---

## Estrutura do Código
- **Paciente.java**: Classe que representa os pacientes da clínica.
- **Dentista.java**: Classe que representa os dentistas da clínica.
- **Consulta.java**: Classe que representa as consultas agendadas.
- **Main.java**: Classe principal que gerencia o fluxo do sistema.

---

## Contribuições
Sinta-se à vontade para contribuir com melhorias para o sistema. Para isso:
1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade:
   ```bash
   git checkout -b minha-nova-funcionalidade
   ```
3. Envie um Pull Request com a descrição detalhada das alterações realizadas.

---

## Licença
Este projeto é open-source e está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.
