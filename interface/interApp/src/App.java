package interface1.interApp.src;
import java.util.*;

import controlflow.mind_reader;
class App {
    public static void main(String[] args) throws Exception {
      ExpressTrain x = new ExpressTrain();
      x.railway_details();
      IndianTrain i =new IndianTrain();
      i.railway_detail();
      maxLim l = new maxLim();
      l.railway_detail();
    }
}
