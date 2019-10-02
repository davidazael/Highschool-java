///////////////////////////////////////////////////////////////////////////
//
// Java5507	Load balancing. N users must choose among N identical 
//			servers in a network.  The goal of a network adminstrator 
//			is to balance users across their system resources. 	Write
//			a program to simulate the data patterns of load balancing.
//
//			Program an arraylist of 10 queues. Maintain a separate
//			boolean arraylist to store the state of the 10 servers(queues)
//			as being up (true) or down(false).
//
//			Random data (number from 0 to 99 for this simulation) will
//			enter the server stack.  Because checking each resource to
//			find an empty one (or least busy one) is too expensive, 
//			randomly choose a server.  At each step, graphically
//			display the jobs on each server.
//			
//			When a server is shut down. All data items from that server 
//			will be added to the server with the smallest queue.
//
//			Nothing special is done when a server is turned on.
//
//			Test the load balance strategy: every 10th data item
//			will choose the smallest queue.
//
///////////////////////////////////////////////////////////////////////////



