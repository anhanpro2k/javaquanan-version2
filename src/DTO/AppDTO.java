/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author anhanpro2k
 */
public class AppDTO {
    private int maApp;
    private String tenApp;
    private int phiHoaHong;

    public AppDTO() {
    }

    public AppDTO(int maApp, String tenApp, int phiHoaHong) {
        this.maApp = maApp;
        this.tenApp = tenApp;
        this.phiHoaHong = phiHoaHong;
    }

    public AppDTO(String tenApp, int phiHoaHong) {
        this.tenApp = tenApp;
        this.phiHoaHong = phiHoaHong;
    }

    public int getMaApp() {
        return maApp;
    }

    public void setMaApp(int maApp) {
        this.maApp = maApp;
    }

    public String getTenApp() {
        return tenApp;
    }

    public void setTenApp(String tenApp) {
        this.tenApp = tenApp;
    }

    public int getPhiHoaHong() {
        return phiHoaHong;
    }

    public void setPhiHoaHong(int phiHoaHong) {
        this.phiHoaHong = phiHoaHong;
    }

    @Override
    public String toString() {
        return "AppDTO{" + "maApp=" + maApp + ", tenApp=" + tenApp + ", phiHoaHong=" + phiHoaHong + '}';
    }
    
    
    
}
