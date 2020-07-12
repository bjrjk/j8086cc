c DB 1 Dup(0)
n DB 2 Dup(0)


assign PROC
PROTECT_SITE
sub SP,-40
mov WORD PTR -16[BP],0
mov AX,-16[BP]
mov -14[BP],AX
L0:
mov WORD PTR -18[BP],20
mov AX,WORD PTR -14[BP]
cmp AX, WORD PTR -18[BP]
jl LI1
mov WORD PTR -20[BP],0
jmp LI2
LI1:
mov WORD PTR -20[BP],1
LI2:
mov AX,WORD PTR -20[BP]
cmp AX,0
jz L1
lea AX,4[BP]
mov -22[BP],AX
mov WORD PTR -24[BP],0
mov WORD PTR -26[BP],1
mov AX,WORD PTR -26[BP]
imul WORD PTR -14[BP]
mov -26[BP],AX
mov AX,WORD PTR -24[BP]
add AX,BYTE PTR -26[BP]
mov -24[BP],AX
mov WORD PTR -28[BP],2
mov AX,WORD PTR -24[BP]
imul WORD PTR -28[BP]
mov -24[BP],AX
mov AX,WORD PTR -22[BP]
add AX,BYTE PTR -24[BP]
mov -22[BP],AX
mov BX,-22[BP]
mov AX,-14[BP]
mov [BX],AX
mov WORD PTR -30[BP],1
mov AX,WORD PTR -14[BP]
add AX,BYTE PTR -30[BP]
mov -32[BP],AX
mov AX,-32[BP]
mov -14[BP],AX
mov WORD PTR -34[BP],8
mov AX,WORD PTR -14[BP]
cmp AX, WORD PTR -34[BP]
je LI3
mov WORD PTR -36[BP],0
jmp LI4
LI3:
mov WORD PTR -36[BP],1
LI4:
mov AX,WORD PTR -36[BP]
cmp AX,0
jz L2
jmp L0
L2:
mov WORD PTR -38[BP],10
mov AX,WORD PTR -14[BP]
cmp AX, WORD PTR -38[BP]
je LI5
mov WORD PTR -40[BP],0
jmp LI6
LI5:
mov WORD PTR -40[BP],1
LI6:
mov AX,WORD PTR -40[BP]
cmp AX,0
jz L3
jmp L1
L3:
jmp L0
L1:
mov AX,-14[BP]
jmp LI0
LI0:
add SP,-40
RESTORE_SITE 2
assign ENDP
abs PROC
PROTECT_SITE
sub SP,-18
mov WORD PTR -14[BP],0
mov AX,WORD PTR 4[BP]
cmp AX, WORD PTR -14[BP]
jl LI8
mov WORD PTR -16[BP],0
jmp LI9
LI8:
mov WORD PTR -16[BP],1
LI9:
mov AX,WORD PTR -16[BP]
cmp AX,0
jz L4
mov WORD PTR -18[BP],0
mov AX,WORD PTR -18[BP]
sub AX,BYTE PTR 4[BP]
mov -18[BP],AX
mov AX,-18[BP]
jmp LI7
L4:
mov AX,4[BP]
jmp LI7
LI7:
add SP,-18
RESTORE_SITE 2
abs ENDP
judge PROC
PROTECT_SITE
sub SP,-34
mov AL,BYTE PTR 4[BP]
cmp AL, BYTE PTR 6[BP]
jl LI11
mov BYTE PTR -14[BP],0
jmp LI12
LI11:
mov BYTE PTR -14[BP],1
LI12:
mov AX,WORD PTR 6[BP]
cmp AX, WORD PTR 8[BP]
jl LI13
mov WORD PTR -16[BP],0
jmp LI14
LI13:
mov WORD PTR -16[BP],1
LI14:
mov AX, WORD PTR -14[BP]
and AX, WORD PTR -16[BP]
mov WORD PTR -18[BP], AX
mov WORD PTR -20[BP],1
mov WORD PTR -22[BP],2
mov AX,WORD PTR -20[BP]
cmp AX, WORD PTR -22[BP]
jl LI15
mov WORD PTR -24[BP],0
jmp LI16
LI15:
mov WORD PTR -24[BP],1
LI16:
mov WORD PTR -26[BP],2
mov WORD PTR -28[BP],1
mov DX,0mov AX,WORD PTR -26[BP]
idiv WORD PTR -28[BP]
mov -30[BP],DX
mov AX,WORD PTR -24[BP]
cmp AX, WORD PTR -30[BP]
je LI17
mov WORD PTR -32[BP],0
jmp LI18
LI17:
mov WORD PTR -32[BP],1
LI18:
mov AX, WORD PTR -18[BP]
or AX, WORD PTR -32[BP]
mov WORD PTR -34[BP], AX
LI10:
add SP,-34
RESTORE_SITE 6
judge ENDP
main PROC
PROTECT_SITE
sub SP,-79
lea AX,-52[BP]
mov -56[BP],AX
mov WORD PTR -58[BP],0
mov WORD PTR -60[BP],2
mov AX,WORD PTR -58[BP]
imul WORD PTR -60[BP]
mov -58[BP],AX
mov AX,WORD PTR -56[BP]
add AX,BYTE PTR -58[BP]
mov -56[BP],AX
t28 DB 2 Dup(0)
mov WORD PTR -62[BP],5
mov WORD PTR -64[BP],0
mov AX,WORD PTR -64[BP]
sub AX,BYTE PTR -62[BP]
mov -64[BP],AX
t33 DB 2 Dup(0)
lea AX,-52[BP]
mov -66[BP],AX
mov WORD PTR -68[BP],0
mov WORD PTR -70[BP],8
mov WORD PTR -72[BP],1
mov AX,WORD PTR -72[BP]
imul WORD PTR -70[BP]
mov -72[BP],AX
mov AX,WORD PTR -68[BP]
add AX,BYTE PTR -72[BP]
mov -68[BP],AX
mov WORD PTR -74[BP],2
mov AX,WORD PTR -68[BP]
imul WORD PTR -74[BP]
mov -68[BP],AX
mov AX,WORD PTR -66[BP]
add AX,BYTE PTR -68[BP]
mov -66[BP],AX
mov BX,-66[BP]
mov AX,[BX]
mov -76[BP],AX
mov AX,-76[BP]
mov -54[BP],AX
mov WORD PTR -78[BP],1
mov AX,-78[BP]
mov n,AX
t41 DB 1 Dup(0)
mov AL,-79[BP]
mov n,AX
n DB 2 Dup(0)
LI19:
add SP,-79
RESTORE_SITE 0
main ENDP
