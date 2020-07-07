/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt592_nguyenminhhoang_59130802;

import java.util.Calendar;

/**
 *
 * @author hoang
 */
public class Tour {
    String tenTour;
    
    int giaTour;
    Calendar thoiGian;

    public Tour(String tenTour, int giaTour, Calendar thoiGian) {
        this.tenTour = tenTour;
        this.giaTour = giaTour;
        this.thoiGian = thoiGian;
    }

    public String getTenTour() {
        return tenTour;
    }

    public int getGiaTour() {
        return giaTour;
    }

    public Calendar getThoiGian() {
        return thoiGian;
    }

    public Tour() {
    }

    @Override
    public String toString() {
        return "Tour: " + "tên tour=" + tenTour + ", Giá tour= " + giaTour + ", Thời gian=" + thoiGian.get(Calendar.DAY_OF_MONTH) + " " +thoiGian.get(Calendar.MONTH) +" "+thoiGian.get(Calendar.YEAR) ;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public void setGiaTour(int giaTour) {
        this.giaTour = giaTour;
    }

    public void setThoiGian(Calendar thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}
