# Queue
Implement a LinkedList to simulate a queue at a store

Instructions

Write a program that simulates customers waiting in line at a grocery store. 
Your program must use a Queue to represent the customer objects waiting in line. 
A Customer class is provided for you. You must use that class, without alternations, for the creation of your Customer objects.  
You must analyze the class and use the provided methods to achieve the desired functionality of the program. 
You will also need to create two additional classes.  The first will be a Linked List Queue that will represent the data structure for holding your Customer objects. 
The second is a driver where your store simulation will take place.
The program (driver) should simulate 60 minutes of activity at the store. Each iteration of your program should represent one minute. 
At each iteration (minute), your program should do the following:
•	Check to see if new customers are added to the queue.  There is a 25% chance that new customers show up (need to be added to the queue) every minute. 
  This does not mean you should add a customer every four iterations, but rather each iteration should have its own 25% chance.
•	Update the customer object currently being serviced (if one exists).  This will be the customer object at the front of the queue. 
  If the customer has been completely serviced, remove them from the queue.

During execution, your program should output the following information:
•	When a new customer is added to the queue, output, “New customer added!  Queue length is now X” where X is the size of the queue after the new customer has been added.
•	When a customer has been completely serviced, output, “Customer serviced and removed from the queue. 
  Queue length is now X” where X is the size of the queue after the customer has been removed.
•	At the end of each iteration (minute), output, “---------------------------------------------------“  to visually identify the passing of time.

When your simulation ends, your program should also output the following information:
•	Total number of customers serviced
•	Maximum line length during the simulation 
