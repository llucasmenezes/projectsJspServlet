<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário de Carro</title>
    <link rel="stylesheet" type="text/css" href="css/form-style.css"> <!-- Incluindo o CSS -->
</head>
<body>

    <form action="form" method="post">
        <label for="name">Nome:</label>
        <input type="text" id="name" name="name"><br>

        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf"><br>

        <label for="nameCar">Modelo do Carro:</label>
        <input type="text" id="nameCar" name="nameCar"><br>

        <label for="marca">Marca:</label>
        <input type="text" id="marca" name="marca"><br>

        <label for="cor">Cor:</label>
        <input type="text" id="cor" name="cor"><br>

        <label for="placa">Placa:</label>
        <input type="text" id="placa" name="placa"><br>

        <label for="chassi">Chassi:</label>
        <input type="text" id="chassi" name="chassi"><br>

        <input type="submit" value="Enviar">
    </form>

</body>
</html>