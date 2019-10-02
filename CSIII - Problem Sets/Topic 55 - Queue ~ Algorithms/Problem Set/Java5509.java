///////////////////////////////////////////////////////////////////////////
//
// Java5509	Multi-word search. Program MultiwordSearch.java reads a 
//			sequence of query words q[1], ..., q[k] from the command 
//			line and a sequence of documents words d[1], ..., d[N] from 
//			standard input and finds the shortest interval in which 
//			the k words appear in the same order.
//
//			(Here shortest means the number of words in the interval.) 
//
//			That is find indices i and j such that 
//			d[i1] = q[1], d[i2] = q[2], ..., d[ik] = q[k] and 
//			i1 < i2 < ... < ik.
//
//		HINT:
//			For each query word, create a sorted list of the indices where 
//			it appears in the document.  Scan through lists 2 to k in 
//			that order, deleting indices at the front of each list
//			until the the first elements of the resulting k lists 
//			are in ascending order.
//
//		q[1]: 50 123 555 1002 1066
//		q[2]: 33 44 93 333 606 613
//		q[3]: 60 200
//		q[4]: 12 18 44 55 203 495
//		
//		q[1]: 50 123 555 1002 1066
//		q[2]: 93 333 606 613
//		q[3]: 200
//		q[4]: 203 495
//		
//			The sequence of first elements on the lists forms the 
//			shortest interval containing the first element on list 1.
//
//			Now delete the first element on list 1. Repeatedly delete 
//			elements from list 2 until it agrees with list 1. Repeat 
//			for list 3, and so on until the whole array is in ascending 
//			order.
//
//			Check this sequence of first elements, etc.
//
///////////////////////////////////////////////////////////////////////////




