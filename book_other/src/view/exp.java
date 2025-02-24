package view;

import java.util.ArrayList;
import java.util.List;

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
   FreshJuiceSize size;
}

class Ixir {
   // list = new ArrayList<String>();
}
 
public class exp {
   public static void main(String[] args){
       FreshJuice juice;
       juice = new FreshJuice();
       juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
   }
}