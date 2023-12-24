package collections;

public class enums {
    enum Week{
        //   , tueday ,  wednesday ,  thursday ,  friday , saturday;
        sunday(1) , monday(7);
        private int value;
        // these are enum constants 
        // they are public static and final by default
        //since its final you cannot create child enums
        //type is Week 
        Week(){
            System.out.println(this);
            // "this" is overridden with tostring and prints the name of the constants
        }
        //this not public or protected it is either protected or default
        // thats why once the contructor is called all the parameters is prinetd
        //why? 
        //we do not want to create new objects
        // why?
        // thats not the concept of enums
        // internally : public static final Week monday = new monday()
        Week(int value){
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
     
       Week week = Week.sunday;
       System.out.println(week.value);
     
        //System.out.println("monday is at the index  " + week.ordinal());// gives the index
        //System.out.println(week.valueOf("monday"));
    }

}
// ENUM EXAMPLE TWO
enum color{
    RED ,  BLUE , BLACK , WHITE;
}
class enumss{
    public static void main(String[] args) {
        color arr[] = color.values();
        for(color c : arr){
            System.out.println(c);
        }
    }
}