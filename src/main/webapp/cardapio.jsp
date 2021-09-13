<!DOCTYPE html>
<html>
<head>
    <title>Cardapio</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <h1>Escolha seu cardapio</h1>
    <form name="cardapioForm" action="cardapio-servlet" method="post">
        <table>
            <tr>
                <td><input type="checkbox" name="opcaoCardapio" value="20">Pizza</td>
                <td>R$20,00</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="opcaoCardapio" value="5">Xis Salada</td>
                <td>R$5,00</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="opcaoCardapio" value="2">Refri 600ml</td>
                <td>R$2,00</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="opcaoCardapio" value="3">Cerveja Lata</td>
                <td>R$3,00</td>
            </tr>
            <tr>
                <td><input type="submit" value="Pedir"></td>
            </tr>
        </table>
    </form>
</body>
</html>
