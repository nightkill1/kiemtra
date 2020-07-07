/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt592_nguyenminhhoang_59130802;

import java.util.GregorianCalendar;

/**
 *
 * @author hoang
 */
public class KT592_NguyenMinhHoang_59130802 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DiemDL ds1 = new DiemDL("Tháp Bà");
        DiemDL ds2 = new DiemDL("Hòn Chồng");
        DiemDL ds3 = new DiemDL("Nhà Thờ đá");
        Tour tour = new Tour("Nha Trang travel", 40000, new GregorianCalendar(2020, 8, 6));
        Builder Tour1 = new Builder.builder().setTour(tour).addDiemDL(ds1).addDiemDL(ds2).addDiemDL(ds3).build();
        System.out.println(Tour1.toString() + Tour1.hienthiDiemDL());
        
        System.out.println("\n");
        
        
        DiemDL ds4 = new DiemDL("Tháp Trầm");
        DiemDL ds5 = new DiemDL("Lương Sơn");
        DiemDL ds6 = new DiemDL("Núi Cô Tiên");
        Tour tour1 = new Tour("Khánh Hòa travel", 140000, new GregorianCalendar(2020, 8, 10));
        
        Singleton Tour2 = new Singleton.buildersingleton()
                .setheader(tour)
                .addchitiet(ds4)
                .addchitiet(ds5)
                .addchitiet(ds6)
                .build();
        
        System.out.println("builder singleton: \n"+Tour2.toString() + Tour2.hienthiCTHD());
        System.out.println("\n");
         Singleton Tour3 = Singleton.Createinstance();
         
         System.out.println(Tour3.toString() + Tour3.hienthiCTHD());
        
        
        
        
    }
    
}
