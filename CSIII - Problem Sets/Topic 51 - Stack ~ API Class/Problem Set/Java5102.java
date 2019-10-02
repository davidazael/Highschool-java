///////////////////////////////////////////////////////////////////////////
//
// Java5102	Write a balance-symbol checker stack program which checks
//			for pairs of symbols.
//
//			Read in a text stream from the keyboard.
//
//			For example, your program should print
//				true for [()]{}{[()()]()} and
//				false for [(]).
//
///////////////////////////////////////////////////////////////////////////
//
//			This checker must implement the following algorithm:
//
//			1. Make an empty stack.
//
//			2. Read symbols until the end of the source code file.
//				•	a. 	If the symbol is an opening symbol,
//						push it onto the stack.
//				•	b. 	If it is a closing symbol, do the following:
//				•		i.  If the stack is empty, report an error.
//				•		ii. Otherwise, pop the stack.
//		 					If the symbol popped is not the
//							corresponding opening symbol,
//							report an error.
//
//			3. At the end of the file, if the stack is not empty,
//			   report an error.
//
///////////////////////////////////////////////////////////////////////////
//
//	CHALLENGE
//	-> 	Modify your program so that it reads in a text file.
//	->	Modify your program to check a java source file,
//		such as "Java5102.java".
//
///////////////////////////////////////////////////////////////////////////



