/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.ItemQuadroHorario;

/**
 *
 * @author Otavio
 */
public class QuadroHorario {
    
    private static List<ItemQuadroHorario> quadro;
    
    public void novoQuadroHorario() {
        quadro = new ArrayList<>();
    }
    
    public boolean inserirItem(String nome, String descricao, int hora, int minuto, int duracao, int idGrupo) {
        ItemQuadroHorario item = new ItemQuadroHorario(this.getMaiorID()+1, nome, descricao, hora, minuto, duracao, idGrupo);
        if(this.checarConflito(item)) return false;
        quadro.add(item);
        Collections.sort(quadro);
        return true;
    }
    
    public boolean inserirItem(String nome, String descricao, int hora, int minuto, int duracao) {
        ItemQuadroHorario item = new ItemQuadroHorario(this.getMaiorID()+1, nome, descricao, hora, minuto, duracao);
        if(this.checarConflito(item)) return false;
        quadro.add(item);
        return true;
    }
    
    private boolean checarConflito(ItemQuadroHorario item) {
        for(ItemQuadroHorario i : quadro) {
            if(ItemQuadroHorario.hasConflict(i, item)) {
                return true;
            }
        }
        return false;
    }
    
    private int getMaiorID() {
        int id=0;
        for(ItemQuadroHorario i : quadro) {
            if(i.getId()>id) {
                id = i.getId();
            }
        }
        return id;
    }
    
    public boolean removerItem(int id) {
        for(ItemQuadroHorario i : quadro) {
            if(i.getId() == id) {
                quadro.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public static List<ItemQuadroHorario> visualizarQuadroHorario() {
        return quadro;
    }
    
}
