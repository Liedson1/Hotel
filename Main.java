public class Main {
    public static void main(String[] args) {
        Quarto quarto204 = new Quarto(204, false, "");
        Quarto quarto205 = new Quarto(205, false, "");
        Cliente cliente1 = new Cliente("José", "senha123");
        Cliente cliente2 = new Cliente("Pedro", "batata");
        cliente1.reservarQuarto(quarto204, cliente1.getNome(), "senha123");
        cliente2.reservarQuarto(quarto205, cliente2.getNome(), "batata");


        System.out.println("Status of Quarto 204: " + quarto204.getStatus());
        System.out.println("Status of Quarto 205: " + quarto205.getStatus());
    }
}
