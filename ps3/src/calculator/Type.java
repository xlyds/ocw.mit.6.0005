package calculator;

/*
 * TODO define your symbols and groups from problem 1 here
 * Numbers:
 *  digits
 * Operators:
 * 	+,-,*,/
 * Units:
 * 	Pt,In, (null)
 * Delimiters:
 *  left paren, right paren
 *
 */

/**
 * Token type.
 */
enum Type {
	
	NUM, //digits 0-9
		
	ADD, // +
	SUB, // -
	MUL, // *
	DIV, // /
		
	SCAL, // Scalars
		
	SIN, // (
	DEX, // )
}