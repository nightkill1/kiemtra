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
public class Singleton {
    Builder build = new Builder();
    
     protected Singleton(buildersingleton builder) {
        this.build.tour = builder.build.tour;
        this.build.dsdl = builder.build.dsdl;
    }

    public String hienthiCTHD(){
        String ht = "";
        ht = build.hienthiDiemDL();
        return ht;
    }

    @Override
    public String toString() {
        return build.tour.toString();
    }
    
    
    public static class buildersingleton{
//        Tour tour = new Tour();
//        ArrayList<DiemDL> dsdl = new ArrayList<>();
        Builder build = new Builder();
        
        public buildersingleton setheader(Tour tour){
            this.build.tour = tour;
            return this;
        }
        
        public buildersingleton addchitiet(DiemDL dsdl){
            this.build.dsdl.add(dsdl);
            return this;
        }
        
        public Singleton build(){
            if(instance == null)
                instance = new Singleton();
            instance.build.tour = this.build.tour;
            instance.build.dsdl = this.build.dsdl;
            return instance;
        }
    }
    
    

    public Singleton() {
    }
    
    
    public static Singleton instance;
    
    
    public static Singleton Createinstance(){
        return instance;
    }
    
}
