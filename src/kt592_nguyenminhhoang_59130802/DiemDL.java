/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt592_nguyenminhhoang_59130802;

/**
 *
 * @author hoang
 */
public class DiemDL {
    String diemDuLich;

    public DiemDL() {
    }

    public DiemDL(String diemDuLich) {
        this.diemDuLich = diemDuLich;
    }

    public String getDiemDuLich() {
        return diemDuLich;
    }

    public void setDiemDuLich(String diemDuLich) {
        this.diemDuLich = diemDuLich;
    }

    @Override
    public String toString() {
        return "Địa điểm du lịch: " + "diemDuLich=" + diemDuLich + "\n";
    }
    
}
