public class Main {
    public static void main(String[] args){

        Servico[] servicos = new Servico[3];

            servicos[0] = new Servico("motor", 10, 12000, "grave");
            servicos[1] = new Servico("martelinho", 3, 1000, "moderado");
            servicos[2] = new Servico("oleo", 1, 500, "leve");

            Mecanico joao = new Mecanico("João", "01223665447", "Motor", "31985412356");

            Box box7 = new Box(7, "leve", "1", "Rua da Bahia", joao);

                Pedido[] pedidos = new Pedido[2];

                    pedidos[0] = new Pedido(servicos[0], "Troca de motor", "001", "Roberto", "Sedan", "OWY5001", "01102026", "Aberto", servicos[0].getValor(), box7);     
                    pedidos[0] = new Pedido(servicos[1], "Troca de oleo", "002", "Daniela", "SUV", "OKL8974", "29092026", "Finalizado", servicos[2].getValor(), box7);



                    

            



































    }
}