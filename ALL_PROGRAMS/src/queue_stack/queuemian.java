package queue_stack;



public class queuemian  {
    public static void main (String[] args) throws Exception {
     custom_queue queue = new custom_queue();
        queue.add(20);
        queue.add(21);
        queue.add(23);
        queue.add(25);
        queue.add(29);
        queue.add(27);
        queue.display();
        System.out.println("   ");
        queue.pop();
        System.out.println(queue);

        queue.display();
        


    }
}
