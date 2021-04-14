# j8086cc

`j8086cc` is a compiler of Jack's C-like High-Level Programming Language `j8086c` which generates assembly of Intel 8086.

### Version Log
v0.2.1: `j8086cc` Added Global Char Array Initialization Support.

v0.2: I'm excited to announce that now `j8086cc` starts to support header files!

v0.1: Basic Implementation

# j8086c Language Grammar

ANTLR Grammar file is located in `src/com/renjikai/j8086cc/antlr/j8086cc.g4`.

There is an example j8086c code located in `test/main.j8086c`.

## j8086c's DataType
`uint`(2 Bytes),`int`(2 Bytes) and `char`(1 Byte).

j8086c allows both uni-dimentional and multi-dimentional array, such as `int[20] arr` or `int[20][20] marr`. 

j8086c doesn't support pointer type. However, you may pass an array pointer to a function by meeting the following prerequisites.

1. You must have the datatype of formal parameter exactly the same with your array's.
2. Pass the array address by using **only** your array's identifier.

The following is an example:

```j8086c
#include stdio.j8086h
#include string.j8086h

char[50] str;
int[20] arr;
str = "Hello, World!";
int func(int[20] array){
	//Body of you function
}
int main(){
	putstr(str);
	func(arr);
}
```

Type Casts aren't done well in the `j8086cc` compiler. If you have identified any unreasonable logic in the compiler 
or have any question about typecast, please open an issue.

## j8086c's Variable Declare, Parameter Passing and Calling Convention
j8086c allow you to declare variables(or arrays) both globally(outside of a function) or locally(inside a function).
You may define two same-name variable in global scope and local scope.

Global Variable will be transformed into declaration in **Data Segment**.
Local Variable will be stored in **the function's stack frame**.

Because of 8086's complicated segment mechanism, passing an array argument defined locally to another function will lead to 
unexcepted result. So please **DEFINE YOUR ARRAY IN GLOBAL SCOPE IF YOU WANT TO USE IT IN MULTIPLE FUNCTIONS**.

After the prologue of a function, the parameters could be easily located by BP plus a shift immediate number.

The first, second, third ... parameters can be visited by [BP+4], [BP+6], [BP+8] ... , respectively.

The shift of local Variables and temporary variables relative to **frame pointer BP** is starting at -14.

AX is caller saved and used to pass return value. Other registers are callee saved.

The calling convention is same with `__stdcall`.

The caller function is responsible to push the actual parameters in an order from right to left.

The callee function is responsible to clear the parameters in the stack.

## j8086c's Built-In Function:

`void putchar(char ASCIICode)`

Print an ASCII char to STDOUT. You may pass a variable of any type. 15~7 Bits of the argument will be ignored. 

`char getchar(void)`

Get an ASCII char from STDIN. You may use any type of variable to receive the char. 
15~7 Bits of the argument will always be 0. 

## j8086c's header support

Header files are located in `src/stl/`.

## j8086c's Support Statement & Operators

Statement: If-Else, While, Do-While, Break, Continue, Return

Operator: 

Unary: +. -, !

Binary: +, -, *, /, %, <, <=, >, >=, ==, !=, &&, ||

Literal: Only Support Integer Literal

# Use j8086cc's binary JAR Package

Execute `java -jar j8086cc-{version}.jar {filename}.j8086c` to compile.

# Use j8086cc's Online Compiler

Click [Here](https://j8086cc.renjikai.com/).