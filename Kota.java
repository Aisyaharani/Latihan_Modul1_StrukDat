/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struckdat1;

/**
 *
 * @author AISYAH
 */
public class Kota<E>{
    
    private E element;
    
    public Kota(E kota){
        element = kota;
    }
    
    public E getElement(){
        return element;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur: " + jumlahkota.getElement() + "kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota " + namakota.getElement());
    }
    
}
