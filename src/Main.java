public class Main {

    public static void main(String[] args){
        Cliente Luiz = new Cliente();
        Luiz.setNome("Luiz Guilherme");

        Conta cc= new ContaCorrente(Luiz);
        Conta poupanca= new ContaPoupança(Luiz);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirInfComuns();
        poupanca.imprimirInfComuns();
    }
}
