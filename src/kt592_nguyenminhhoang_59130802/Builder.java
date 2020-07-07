/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt592_nguyenminhhoang_59130802;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class Builder {

    public Builder() {
    }
    Tour tour;
    List<DiemDL> dsdl = new ArrayList<>();

    protected Builder(builder builder) {
        this.tour = builder.tour;
        this.dsdl = builder.dsdl;
    }
    public static class builder{
        Tour tour;
        List<DiemDL> dsdl = new ArrayList<>();
        
        public builder setTour(Tour tour){
            this.tour = tour;
            return this;
        }
        
        public builder addDiemDL(DiemDL dsdl){
            this.dsdl.add(dsdl);
            return this;
        }
                
        public Builder build(){
            return new Builder(this);
        }
    }
    public String hienthiDiemDL(){
        String ht = "";
        for(int i = 0; i < dsdl.size(); i++){
            ht+= "\nDanh Sách điểm du lịch: " + dsdl.get(i).getDiemDuLich();
            }
        return ht;
    }

    @Override
    public String toString() {
        return tour.toString();
    }
}
