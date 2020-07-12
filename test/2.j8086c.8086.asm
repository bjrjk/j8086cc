

main PROC
PROTECT_SITE
sub SP,-24
mov WORD PTR -20[BP],1
mov AX,-20[BP]
mov -14[BP],AX
mov WORD PTR -22[BP],2
mov AX,-22[BP]
mov -16[BP],AX
mov AX,WORD PTR -14[BP]
add AX,BYTE PTR -16[BP]
mov -24[BP],AX
mov AX,-24[BP]
mov -18[BP],AX
LI0:
add SP,-24
RESTORE_SITE 0
main ENDP
