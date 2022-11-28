output START 0
stack RESB 10000
stackindex WORD 0
stackmax WORD 10000
display RESB 100
displayindex WORD 0
displaymax WORD 100
returnvalue RESB 500
returnmax WORD 500
STA 3
STB 1
LDX stackindex
STB stack, x
ADD #6
ADD stackindex
COMP stackmax
JGT ENDPROGRAM
STA stackindex
