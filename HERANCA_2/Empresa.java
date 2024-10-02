class Empresa {


    public static void main(String[] args) {

        // Criando instância de Gerente
        Gerente gerente = new Gerente(
                "Emanuel",
                "555.555.555-55",
                "19/02/2005",
                "11/11/2009",
                500,
                "Vendas"
        );

        // Criando instância de Vendedor
        Vendedor vendedor = new Vendedor(
                "José",
                "777.777.777-77",
                "28/07/2005",
                "jose@email.com",
                "111111111",
                "15 991103359",
                "05/02/2015",
                500,
                1.0
        );

        //instância de Cliente
        Cliente cliente = new Cliente(
                "Marcelo",
                "777.777.777-77",
                "22/02/2002",
                "marcelo@email.com",
                "1111111111",
                "15 99999910"
        );


        
        // Exibindo status dos objetos criados
        System.out.println("Gerente:");
        System.out.println(gerente.status());

        System.out.println("\nVendedor:");
        System.out.println(vendedor.status());

        System.out.println("\nCliente:");
        System.out.println(cliente.status());
    }
}
