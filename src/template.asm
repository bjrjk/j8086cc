; Call Convention:
; AX Caller Save
; Others Callee Save
; Parameter Passing Convention: _stdcall
; [BP] -> previous BP
; 2[BP] -> return address
; 4[BP] -> first parameter
; 6[BP] -> second parameter
; ...

PUSH_REGS MACRO
	pushf
	push BX
	push CX
	push DX
	push SI
	push DI
ENDM

POP_REGS MACRO
	pop DI
	pop SI
	pop DX
	pop CX
	pop BX
	popf
ENDM

PROTECT_SITE MACRO
	push BP
	mov BP,SP
	PUSH_REGS
ENDM

RESTORE_SITE MACRO POP_BYTES
	POP_REGS
	mov SP,BP
	pop BP
	ret POP_BYTES
ENDM

data segment
%%DATA_TEXT%%
data ends

stack segment para stack
	DB 1000H Dup(0)
stack ends

code segment
	assume cs:code,ds:data,ss:stack
	
__Builtin__putchar PROC
	; void putchar(char ASCIICode)
	; Print an ASCII Character via DOS SysCall No.2
	PROTECT_SITE
	mov AX,4H[BP]
	mov DL,AL
	mov AH,02h
	int 21h
	RESTORE_SITE 2
__Builtin__putchar ENDP

__Builtin__getchar PROC
	; char getchar(void)
	; Get an ASCII Character via DOS SysCall No.1
	; Return Value: ASCII char code in AL
	mov AH,01h
	int 21h
	mov AH,0
	ret
__Builtin__getchar ENDP
	
%%CODE_TEXT%%
code ends

end main