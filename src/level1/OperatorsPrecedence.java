package level1;

/*
* Precedence	Operator	Type	Associativity
1 (Highest)	() [] .	Parentheses, Array Access, Member Access	Left to Right
2	++ -- + - ~ !	Unary (postfix, prefix)	Right to Left
3	* / %	Multiplication, Division, Modulus	Left to Right
4	+ -	Addition, Subtraction	Left to Right
5	<< >> >>>	Bitwise Shift	Left to Right
6	< <= > >= instanceof	Comparison	Left to Right
7	== !=	Equality	Left to Right
8	&	Bitwise AND	Left to Right
9	^	Bitwise XOR	Left to Right
10	|	Bitwise OR	Left to Right
11	&&	Logical AND	Left to Right
12	||	Logical OR	Left to Right
13	? :	Ternary (Conditional)	Right to Left
14	= += -= *= /= %= &= `	= ^= <<= >>= >>>=`	Assignment Operators
*/
public class OperatorsPrecedence {
    public static void main(String[] args) {
        System.out.println(7+(3*5)*(4/2)+(5%3)-1);
    }
}
//7+15*2+2-1
//7+30+1
//38