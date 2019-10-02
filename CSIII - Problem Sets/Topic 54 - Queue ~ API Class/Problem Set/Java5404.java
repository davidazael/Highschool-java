///////////////////////////////////////////////////////////////////////////
//
// Java5404	Write a program that implements a Queue data structure.
//			Implement a k sized word buffer.  As words are offered, 
//			added them to the buffer following the rules of a standard 
//			queue.  When words are polled, remove the words following
//			the rules of a standard queue.  Design the structure such
//			that the queue will only store k items at a time.  If an
//			offer is made when the buffer is full, poll an item before
//			the offer.
//
//
//	e.g.
//
//		k = 5
//
//		offer cat		buffer --> [cat]
//		offer big		buffer --> [cat,big]
//		offer man		buffer --> [cat,big,man]
//		poll			buffer --> [big,man]
//		offer dog		buffer --> [big,man,dog]
//		offer rat		buffer --> [big,man,dog,rat]
//		poll			buffer --> [man,dog,rat]
//		offer lab		buffer --> [man,dog,rat,lab]
//		offer bob		buffer --> [man,dog,rat,lab,bob]
//		offer got		buffer --> [dog,rat,lab,bob,got]
//		offer pat		buffer --> [rat,lab,bob,got,pat]
//		poll			buffer --> [lab,bob,got,pat]
//
///////////////////////////////////////////////////////////////////////////



