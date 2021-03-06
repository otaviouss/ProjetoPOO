/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Otavio
 */
public class Colaborador extends Funcionario {
    
    private String local;
    private String tipo;
    
    public Colaborador(String idFuncionario, String nome, 
            String CPF, float salario, int cargaHoraria, 
            Data dataNascimento, String local, String senha, String tipo) {
        super("C"+idFuncionario, nome, CPF, salario, cargaHoraria, dataNascimento, senha);
        this.local = local;
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public String getTipo() {
        return tipo;
    }
        
    @Override
    public String toString() {
        return super.toString() + "Colaborador{" + "local=" + local + ", tipo=" + tipo + '}';
    }
    
}
