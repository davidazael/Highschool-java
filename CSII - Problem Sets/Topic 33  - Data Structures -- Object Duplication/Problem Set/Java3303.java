///////////////////////////////////////////////////////////////////////////
//
// Java3303	Create a data structure for the game "Battle Ship."
//			This design must facilatate the design requirement that
//			provides for a deep copy.
//
//			In the game "Battle Ship" there are game pieces that
//			represent different military ships.  Design a data class
//			that represents these ship game pieces.  You will need
//			the following fields.
//
//				String name;
//				int row;
//				int col;
//				boolean isHorizontal;
//				int size;
//
//
//			Create an arraylist to hold all the pieces for player one.
//			Use a deep copy to create all the pieces for player two.
//
//			After the game piece data structures are created, create
//			an algorithm that asks the user to place their piece on the
//			game board.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:   3 5, 7 2, 0 1, 4 7, 2 5
// 					8 2, 4 4, 2 3, 5 1, 1 7
//
//	SAMPLE OUTPUT:
//
//		BEFORE PLACEMENT
//		================
//		Red Player
//		pieces@273fa31
//		[[Patrol Boat,0,0,true,2],[Destroyer,0,0,true,3],[Submarine,0,0,
//		true,3],[Battleship,0,0,true,4],[Aircraft Carrier,0,0,true,5]]
//
//		Blue Player
//		pieces@273fa31
//		[[Patrol Boat,0,0,true,2],[Destroyer,0,0,true,3],[Submarine,0,0,
//		true,3],[Battleship,0,0,true,4],[Aircraft Carrier,0,0,true,5]]
//
//		AFTER PLACEMENT
//		================
//		Red Player
//		pieces@273fa31
//		[[Patrol Boat,3,5,true,2],[Destroyer,7,2,true,3],[Submarine,0,1,
//		true,3],[Battleship,4,7,true,4],[Aircraft Carrier,2,5,true,5]]
//
//		Blue Player
//		pieces@273fa31
//		[[Patrol Boat,8,2,true,2],[Destroyer,4,4,true,3],[Submarine,2,3,
//		true,3],[Battleship,5,1,true,4],[Aircraft Carrier,1,7,true,5]]
//
///////////////////////////////////////////////////////////////////////////






