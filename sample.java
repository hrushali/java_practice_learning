 class dogs {

    String name ="rocky";
    String color ="brown";
    String breed ="husky";
    String hungry ="so";

    void barking (){
System.out.println("rocky barking");
    }
    void fetching(){
        System.out.println("rocky fetching");

    }
    void wagging_tail(){
        System.out.println("rocky wagging tail");


    }
}
class sample{
    public static void main(String[] args)
    {
        dogs d = new dogs();
       
        d.barking();
        d.fetching();
        d.wagging_tail();

    }
}
    

