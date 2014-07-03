package calculator;

/*
 * 
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
	UNIT, // Scalars
	OP,
	PAREN,
	EOF

}