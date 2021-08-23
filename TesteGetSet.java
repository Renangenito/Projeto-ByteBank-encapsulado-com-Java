package bytebanck.encapsulado;
public class TesteGetSet {
    public static void main(String[] args) {
        
        Conta contaDoPaulo = new Conta(246810, 2244);
        
      
       
        contaDoPaulo.deposita(300);
       
            
         System.out.println("Saldo em conta " + contaDoPaulo.getSaldo());
         System.out.println("Número da Agência " + contaDoPaulo.getAgencia());
         System.out.println("Número da conta " + contaDoPaulo.getNumero());
         
          Cliente clientePaulo = new Cliente();
          contaDoPaulo.setTitular(clientePaulo);
          clientePaulo.setNome("Paulo Silveira");
        
          
          System.out.println(contaDoPaulo.getTitular().getNome());
          System.out.println(Conta.getTotal());
          
          
    }
}
