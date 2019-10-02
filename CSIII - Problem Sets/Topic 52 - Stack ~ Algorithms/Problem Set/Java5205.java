///////////////////////////////////////////////////////////////////////////
//
// Java5205	Suppose that an intermixed sequence of (stack) push and pop
//			operations are randomly performed. The pushes push the
//			integers 0 through 9 in order; the pops print out the
//			return value.
//
//			Devise an algorithm that determines whether a given permutation
//			can be generated as output or an error.
//
//			The stack creates an underflow error if there exists an
//			integer k such that the first k pop operations occur before
//			the first k push operations.
//
//			If a given permutation can be generated, it is uniquely
//			generated as follows:
//				if the next integer in the permutation is in the top of	the stack,
//					pop it;
//				otherwise,
//					push the next integer in the input sequence onto the stack
//					(or stop if N-1 has already been pushed).
//
//			The permutation can be generated if and only if the stack
//			is empty upon termination.
//
///////////////////////////////////////////////////////////////////////////
//
//   TEST DATA
/*

Which of the following sequence(s) are valid and which are invalid?

(a)  4 3 2 1 0 9 8 7 6 5

(b)  4 6 8 7 5 3 2 9 0 1

(c)  2 5 6 7 4 8 9 3 1 0

(d)  4 3 2 1 0 5 6 7 8 9

(e)  1 2 3 4 5 6 9 8 7 0

(f)  0 4 6 5 3 8 1 7 2 9

(g)  1 4 7 9 8 6 5 3 0 2

(h)  2 1 4 3 6 5 8 7 9 0

*/
//
///////////////////////////////////////////////////////////////////////////


