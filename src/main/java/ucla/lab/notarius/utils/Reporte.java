/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucla.lab.notarius.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author hanumonke
 */
public class Reporte {
    
    private String jasperFileUrl;
    private JasperReport jr;
    private JasperPrint jp;
    
    
    
    public Reporte (String jasperFileUrl) {
        this.jasperFileUrl = jasperFileUrl;
        
        try {
            NotariusConfig nc = new NotariusConfig();
            Class.forName(nc.getPostgresDriver());
            try(Connection conn = DriverManager.getConnection(nc.getPostgresUrl(), nc.getPostgresUsername(), nc.getPostgresPassword())) {
                
                InputStream reportStream = getClass().getClassLoader().getResourceAsStream(jasperFileUrl);
                jr = JasperCompileManager.compileReport(reportStream);
                jp = JasperFillManager.fillReport(jr, null, conn);
            
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showReport ()  {
        try {
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
