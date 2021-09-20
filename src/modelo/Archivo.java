/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Obando
 */
public class Archivo {
    
    public void guardarArchivoCorportativo(Coorporativos u) {
        try {
            FileWriter fw = new FileWriter("Coorporativo.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(u.nombre);
            pw.println(u.apellido);
            pw.println(u.cI);
            pw.println(u.telefono);
            pw.println(u.getiD());            
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void leerArchivoCoorporativo() {
        File archivo = new File("Coorporativo.txt");
        try {
            FileReader fr = new FileReader(archivo);
            Scanner ingreso = new Scanner(fr);
            ingreso.useLocale(Locale.ENGLISH);
            while (ingreso.hasNext()) {
                Coorporativos corp = new Coorporativos(ingreso.next(),ingreso.next(),ingreso.next(),ingreso.nextLong(),ingreso.nextLong());
                corp.registrarCliente(corp);
            }
        } catch (IOException o) {
        }
    }
     
    public void guardarArchivoGenerales(Generales u) {
        try {
            FileWriter fw = new FileWriter("Generales.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(u.nombre);
            pw.println(u.apellido);
            pw.println(u.cI);
            pw.println(u.telefono);                        
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void leerArchivoGenerales() {
        File archivo = new File("Generales.txt");
        try {
            FileReader fr = new FileReader(archivo);
            Scanner ingreso = new Scanner(fr);
            ingreso.useLocale(Locale.ENGLISH);
            while (ingreso.hasNext()) {
                Generales gen = new Generales(ingreso.next(),ingreso.next(),ingreso.nextLong(),ingreso.nextLong());
                gen.registrarCliente(gen);
            }
        } catch (IOException o) {
        }
    }
    
    public void guardarArchivoMilitar(Militares u) {
        try {
            FileWriter fw = new FileWriter("Militar.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(u.nombre);
            pw.println(u.apellido);
            pw.println(u.cI);
            pw.println(u.telefono);        
            pw.println(u.codMilitar);
            pw.println(u.estadoMilitar);
            pw.println(u.gradoMilitar);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
