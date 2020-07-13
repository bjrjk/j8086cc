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

data ends

stack segment para stack
	DB 1000H Dup(0)
stack ends

code segment
	assume cs:code,ds:data,ss:stack
	
putchar PROC
	; void putchar(char ASCIICode)
	; Print an ASCII Character via DOS SysCall No.2
	PROTECT_SITE
	mov AX,4H[BP]
	mov DL,AL
	mov AH,02h
	int 21h
	RESTORE_SITE 2
putchar ENDP

getchar PROC
	; char getchar(void)
	; Get an ASCII Character via DOS SysCall No.1
	; Return Value: ASCII char code in AL
	mov AH,01h
	int 21h
	mov AH,0
	ret
getchar ENDP
	
getput PROC
PROTECT_SITE
add SP,-63
;movi$TMPVAR_i_2_@t0$,0
mov WORD PTR [BP]-24,0
;mov$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t0$
mov AX,[BP]-24
mov [BP]-22,AX
L0:
;movi$TMPVAR_i_2_@t1$,8
mov WORD PTR [BP]-26,8
;lt$TMPVAR_i_2_@t2$,$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t1$
mov AX,WORD PTR [BP]-22
cmp AX, WORD PTR [BP]-26
jl LI1
mov WORD PTR [BP]-28,0
jmp LI2
LI1:
mov WORD PTR [BP]-28,1
LI2:
;jz$TMPVAR_i_2_@t2$,L1
mov AX,WORD PTR [BP]-28
cmp AX,0
jz L1
;lea$TMPVAR_i_2_@t3$,$LOCALVAR_c_8_@str$
lea AX,[BP]-20
mov [BP]-30,AX
;movi$TMPVAR_i_2_@t4$,0
mov WORD PTR [BP]-32,0
;movi$TMPVAR_i_2_@t5$,1
mov WORD PTR [BP]-34,1
;mul$TMPVAR_i_2_@t5$,$TMPVAR_i_2_@t5$,$LOCALVAR_i_2_@i$
mov AX,WORD PTR [BP]-34
imul WORD PTR [BP]-22
mov [BP]-34,AX
;add$TMPVAR_i_2_@t4$,$TMPVAR_i_2_@t4$,$TMPVAR_i_2_@t5$
mov AX,WORD PTR [BP]-32
add AX,WORD PTR [BP]-34
mov [BP]-32,AX
;movi$TMPVAR_i_2_@t6$,1
mov WORD PTR [BP]-36,1
;mul$TMPVAR_i_2_@t4$,$TMPVAR_i_2_@t4$,$TMPVAR_i_2_@t6$
mov AX,WORD PTR [BP]-32
imul WORD PTR [BP]-36
mov [BP]-32,AX
;add$TMPVAR_i_2_@t3$,$TMPVAR_i_2_@t3$,$TMPVAR_i_2_@t4$
mov AX,WORD PTR [BP]-30
add AX,WORD PTR [BP]-32
mov [BP]-30,AX
;callgetchar,$TMPVAR_c_1_@t7$
call getchar
mov WORD PTR [BP]-37, AX
;movmr[$TMPVAR_i_2_@t3$],$TMPVAR_c_1_@t7$
mov BX,[BP]-30
mov AX,[BP]-37
mov [BX],AX
;movi$TMPVAR_i_2_@t8$,1
mov WORD PTR [BP]-39,1
;add$TMPVAR_i_2_@t9$,$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t8$
mov AX,WORD PTR [BP]-22
add AX,WORD PTR [BP]-39
mov [BP]-41,AX
;mov$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t9$
mov AX,[BP]-41
mov [BP]-22,AX
;jmpL0
jmp L0
L1:
;movi$TMPVAR_i_2_@t10$,0
mov WORD PTR [BP]-43,0
;mov$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t10$
mov AX,[BP]-43
mov [BP]-22,AX
L2:
;movi$TMPVAR_i_2_@t11$,8
mov WORD PTR [BP]-45,8
;lt$TMPVAR_i_2_@t12$,$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t11$
mov AX,WORD PTR [BP]-22
cmp AX, WORD PTR [BP]-45
jl LI3
mov WORD PTR [BP]-47,0
jmp LI4
LI3:
mov WORD PTR [BP]-47,1
LI4:
;jz$TMPVAR_i_2_@t12$,L3
mov AX,WORD PTR [BP]-47
cmp AX,0
jz L3
;lea$TMPVAR_i_2_@t14$,$LOCALVAR_c_8_@str$
lea AX,[BP]-20
mov [BP]-49,AX
;movi$TMPVAR_i_2_@t15$,0
mov WORD PTR [BP]-51,0
;movi$TMPVAR_i_2_@t16$,1
mov WORD PTR [BP]-53,1
;mul$TMPVAR_i_2_@t16$,$TMPVAR_i_2_@t16$,$LOCALVAR_i_2_@i$
mov AX,WORD PTR [BP]-53
imul WORD PTR [BP]-22
mov [BP]-53,AX
;add$TMPVAR_i_2_@t15$,$TMPVAR_i_2_@t15$,$TMPVAR_i_2_@t16$
mov AX,WORD PTR [BP]-51
add AX,WORD PTR [BP]-53
mov [BP]-51,AX
;movi$TMPVAR_i_2_@t17$,1
mov WORD PTR [BP]-55,1
;mul$TMPVAR_i_2_@t15$,$TMPVAR_i_2_@t15$,$TMPVAR_i_2_@t17$
mov AX,WORD PTR [BP]-51
imul WORD PTR [BP]-55
mov [BP]-51,AX
;add$TMPVAR_i_2_@t14$,$TMPVAR_i_2_@t14$,$TMPVAR_i_2_@t15$
mov AX,WORD PTR [BP]-49
add AX,WORD PTR [BP]-51
mov [BP]-49,AX
;movrm$TMPVAR_i_2_@t18$,[$TMPVAR_i_2_@t14$]
mov BX,[BP]-49
mov AX,[BX]
mov [BP]-57,AX
;callputchar,$TMPVAR_i_2_@t13$,$TMPVAR_i_2_@t18$
mov AX,WORD PTR [BP]-57
push AX
call putchar
mov WORD PTR [BP]-59, AX
;movi$TMPVAR_i_2_@t19$,1
mov WORD PTR [BP]-61,1
;add$TMPVAR_i_2_@t20$,$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t19$
mov AX,WORD PTR [BP]-22
add AX,WORD PTR [BP]-61
mov [BP]-63,AX
;mov$LOCALVAR_i_2_@i$,$TMPVAR_i_2_@t20$
mov AX,[BP]-63
mov [BP]-22,AX
;jmpL2
jmp L2
L3:
LI0:
sub SP,-63
RESTORE_SITE 0
getput ENDP
main PROC
mov AX,data
mov DS,AX
mov BP,SP
add SP,-14
;callgetput,$TMPVAR_i_2_@t21$
call getput
mov WORD PTR [BP]-14, AX
LI5:
sub SP,-14
mov AH,4Ch
mov AL,0
int 21h
main ENDP

code ends

end main