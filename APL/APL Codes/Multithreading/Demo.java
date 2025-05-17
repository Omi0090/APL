// class TicketCounter {
//     private int availableTickets;

//     public TicketCounter(int totalTickets) {
//         this.availableTickets = totalTickets;
//     }

//     public synchronized void bookTickets(String customerName, int requestedTickets) {
//         System.out.println(customerName + " is trying to book " + requestedTickets + " tickets...");

//         // Simulate delay
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             System.out.println("Thread interrupted.");
//         }

//         if (requestedTickets <= availableTickets) {
//             availableTickets -= requestedTickets;
//             System.out.println(customerName + " successfully booked " + requestedTickets + " tickets.");
//             System.out.println("Tickets remaining: " + availableTickets);
//         } else {
//             System.out.println(customerName + " failed to book tickets. Not enough available.");
//             System.out.println("Tickets remaining: " + availableTickets);
//         }
//     }
// }

// class TicketBookingThread extends Thread {
//     private TicketCounter counter;
//     private String customerName;
//     private int ticketsToBook;

//     public TicketBookingThread(TicketCounter counter, String customerName, int ticketsToBook) {
//         this.counter = counter;
//         this.customerName = customerName;
//         this.ticketsToBook = ticketsToBook;
//     }

//     @Override
//     public void run() {
//         counter.bookTickets(customerName, ticketsToBook);
//     }
// }

// public class TicketBookingSystem {
//     public static void main(String[] args) {
//         TicketCounter counter = new TicketCounter(10);

//         Thread t1 = new TicketBookingThread(counter, "Alice", 4);
//         Thread t2 = new TicketBookingThread(counter, "Bob", 5);
//         Thread t3 = new TicketBookingThread(counter, "Charlie", 3);

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// class TicketCounter {
//     private static int availableTickets = 10;

//     public static int getAvailableTickets() {
//         return availableTickets;
//     }

//     public static void reduceTickets(int count) {
//         availableTickets -= count;
//     }
// }

// class TicketBookingThread extends Thread {
//     private String customerName;
//     private int ticketsToBook;

//     public TicketBookingThread(String customerName, int ticketsToBook) {
//         this.customerName = customerName;
//         this.ticketsToBook = ticketsToBook;
//     }

//     @Override
//     public void run() {
//         System.out.println(customerName + " is trying to book " + ticketsToBook + " tickets...");

//         synchronized (TicketCounter.class) { // synchronized on the shared class
//             if (ticketsToBook <= TicketCounter.getAvailableTickets()) {
//                 for (int i = 1; i <= ticketsToBook; i++) {
//                     System.out.println(customerName + " booked ticket " + i + " of " + ticketsToBook);
//                     try {
//                         Thread.sleep(1000);
//                     } catch (InterruptedException e) {
//                         System.out.println("Interrupted during booking.");
//                     }
//                 }

//                 TicketCounter.reduceTickets(ticketsToBook);
//                 System.out.println(customerName + " successfully booked " + ticketsToBook + " tickets.");
//                 System.out.println("Tickets remaining: " + TicketCounter.getAvailableTickets());
//             } else {
//                 System.out.println(customerName + " failed to book. Not enough tickets.");
//                 System.out.println("Tickets remaining: " + TicketCounter.getAvailableTickets());
//             }
//         }
//     }

// }

// public class TicketBookingAsync {
//     public static void main(String[] args) {
//         Thread t1 = new TicketBookingThread("Alice", 4);
//         Thread t2 = new TicketBookingThread("Bob", 5);
//         Thread t3 = new TicketBookingThread("Charlie", 3);

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

class PVR{
    static int tickets = 10;

    synchronized void bookTicket(int numT , String user ){
        if(tickets>=numT){
            for(int i=0;i<numT;i++){
            System.out.println(i+1 + " Ticket booked for user: "+user);
            tickets--;
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        }else{
            System.out.println("No tickets available for user: "+user);
        }
       
    }
}

class BookThread extends Thread{
    PVR p;
    int numT;
    String user;

    BookThread(PVR p,int numT , String user){
        this.p = p;
        this.numT = numT;
        this.user = user;
        
    }

    public void run(){
        p.bookTicket(numT, user);
    }
}

public class Demo{
    public static void main(String args[]){      
        PVR p = new PVR();

        BookThread userA = new BookThread(p,3,"A");
        BookThread userB = new BookThread(p,5,"B");
        BookThread userC = new BookThread(p,3,"C");

        userA.start();
        userB.start();
        userC.start();


    }
}