/** Custom LinkListQueue
 *  This program represents the data structure for holding the Customer objects.
 *  It will create a Queue, add Customer objects and/ or remove them from the queue.
 * @author: Ivy Pham
 * @version: July 10, 2020
 */


public class LinkedListQueue {
    private Customer first, last;
    private static int size;

    /** Constructor: This will create a Queue object  */
    public LinkedListQueue() {
        first = last = null;
        size = 0;        // set default size of the queue
    }
    /** isEmpty(): This method checks if the queue is empty
     * @return boolean This return True if the queue is empty and False if there is Customer object(s) in the queue
     * */
    public boolean isEmpty() { // check if the queue is empty
        return first == null;
    }

    /** getSize(): This method is used to get the queue size
     * @return size This return size of the queue
     * */
    public int getSize(){
        return size;
    }

    /**
     * enqueue(): This method will add a customer object to the back of the queue.
     *            Increase the queue size by 1
     *            Set reference for the first, last and next customer
     * Move the pointer to point to the newly added Customer.
     * @param c object to add to the queue
     * @return Nothing
     */
    public void enqueue(Customer c) {
        //Adds Customer c to the back of the queue. If the queue is empty, first should reference the new object
        if ( isEmpty() ) {
            first = c;
        } else {//before we change last to reference the new object, set the current last object's next reference to point to the new object
            last.setNext (c);
        }
        last = c;  //last should always reference the new object
        size++;
    }

    /** dequeue(): This method will remove the first object in the queue.
     *             Move the next object to the first position.
     *             Decrease the size of the queue by 1.
     * @return temp The first object before we remove it from the queue.
     */
    public Customer dequeue() { //Removes and return the first Customer in the queue
        if ( isEmpty() ) {
            System.out.println ("No one is waiting in line");
            return null;
        }
        //Store a temp reference to the object we want to remove
        Customer temp = first;

        //Set first to reference the current first object's next reference, which is the current second object in the list
        first = first.getNext();

        if ( isEmpty() ) {//if the queue is now empty, set last to null
            last = null;
        }
        size--;
        return temp;
    }

    /** getFirst() This method will get the object reference of the first object in the queue.
     * @param None
     * @return first The object reference of the first one in the queue.
     */
    public Customer getFirst() {
        return first;
    }

}//end of class
