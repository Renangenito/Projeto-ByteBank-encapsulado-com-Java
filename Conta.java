package bytebanck.encapsulado;


public class Conta {

   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total;
   
   public Conta(int numero, int agencia){
       Conta.total++;
       this.numero = numero;
       this.agencia = agencia;
       System.out.println("O total de contas é: " +  Conta.total);
   }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
             destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
    
    
   
    

}
