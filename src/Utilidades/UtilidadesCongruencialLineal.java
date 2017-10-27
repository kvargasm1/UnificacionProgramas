/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author RetailAdmin
 */public class UtilidadesCongruencialLineal {
    
    public int generaSemilla(int semilla){
        
        int numeroRetorno = ((5*semilla)+1)%9; 
        return numeroRetorno;        
    }
    
    public double generalAleatorio(double semilla){
        double divisor = 9;        
        return semilla/divisor;
        
    }
            
    
    
}
