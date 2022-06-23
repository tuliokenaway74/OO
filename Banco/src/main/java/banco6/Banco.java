package banco6;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
//      this.clientes = new banco3.Cliente[5];
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
//      clientes[numeroDeClientes] = cliente;
//      numeroDeClientes++;
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome) {
        ArrayList<Cliente> result = new ArrayList<>();
        for (Cliente cliente: clientes) {
            if(cliente.getNome().equals(nome) && cliente.getSobrenome().equals(sobrenome)) {
                result.add(cliente);
            }
        }
        return result;
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }
}