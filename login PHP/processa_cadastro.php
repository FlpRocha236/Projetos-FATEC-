<?php
session_start();

// Verifica se o formulário foi submetido
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nome = $_POST["nome"];
    $cpf = $_POST["cpf"];

    // Sanitiza os dados de entrada
    $nome = htmlspecialchars($nome);
    $cpf = htmlspecialchars($cpf);

    // Caminho para o arquivo de texto
    $arquivo = "cadastros.txt";

    // Formata os dados para salvar no arquivo
    $dados = "Nome: $nome | CPF: $cpf\n";

    // Grava os dados no arquivo
    if (file_put_contents($arquivo, $dados, FILE_APPEND)) {
        echo "Cadastro realizado com sucesso!";
    } else {
        echo "Ocorreu um erro ao salvar o cadastro.";
    }
}
?>

<!DOCTYPE html>
<html lang="pt_BR">
<head>
    <meta charset="UTF-8">
    <title>Resultado do Cadastro</title>
</head>
<body>
    <br>
    <form action="cadastro.php" method="get">
        <!-- Botão para retornar à página de cadastro -->
        <button type="submit">Voltar para Cadastro</button>
    </form>
</body>
</html>