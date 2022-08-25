public class Aula05 {
    public static void main(String[] args) throws Exception {
       ContaBanco p1 = new ContaBanco();
       p1.setConta(111111);
       p1.setDono("Jubileu");
       p1.abrirConta("CC");
       p1.depositar(100.00F);
       p1.sacar(150.00F);
       p1.fecharConta();
       p1.estadoAtual();


       ContaBanco p2 = new ContaBanco();
       p2.setConta(22222);
       p2.setDono("Cleusa");
       p2.abrirConta("CP");
       p2.depositar(500.00F);
       p2.sacar(1000.00f);
       p2.estadoAtual();

    }
}
