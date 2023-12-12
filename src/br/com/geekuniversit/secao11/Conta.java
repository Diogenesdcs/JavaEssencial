package br.com.geekuniversit.secao11;

    //classe
    public class Conta {
        int numero;
        private float saldo; //variavel privada
        private float limite;
        Cliente cliente; //como é uma classe criada então podemos  utilizar como parametro de outra classe.

        //construtor
        public Conta(int numero, float saldo, float limite, Cliente cliente) {
            this.numero = numero;
            this.saldo = saldo;
            this.limite = limite;
            this.cliente = cliente;
        }

        //métodos da classe
        //void nome_da_função (declaração_de_parâmetros);
        public void sacar(float valor) {
            if (valor <= this.saldo) {
                this.saldo = this.saldo - valor;
                //saldo é igual  a saldo mas o limite.
            } else if (valor <= (this.saldo + this.limite)) {

                float val_ret = this.saldo - valor; //calculo do valor excedente do saque
                if (val_ret < 0){
                    this.saldo = 0;
            }
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar( float valor){
        this.saldo = this.saldo + valor;
        }

        //Método getter do atributo Saldo
    public float getsaldo() {
        return this.saldo + this.limite;
        }
    }
