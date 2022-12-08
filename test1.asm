test1                START 0
                     J main
initFrame            LDX stackindex
                     LDS framestart
                     STX framestart
                     LDT #3
                     ADDR T, X
                     STB stack, X
                     ADDR T, X
                     STS stack, X
                     ADDR T, X
                     ADDR A, X
                     STX stackindex
                     RSUB
findStackFrame       LDX framestart
findStackFrameloop   LDT #3
                     ADDR T, X
                     COMP stack, X
                     JEQ findStackFramedone
                     ADDR T, X
                     LDX stack, X
                     J findStackFrameloop
findStackFramedone   SUBR T, X
                     RSUB
freeFrame            LDA framestart
                     STA stackindex
                     ADD #6
                     RMO A, X
                     LDA stack, X
                     STA framestart
                     RSUB
main                 LDA #9
                     LDB #1
                     JSUB initFrame
                     J L0
L0                   
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     RMO A, T
                     LDX evalstackindex
                     LDA #1
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     RMO A, T
                     LDX evalstackindex
                     LDA #1
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     RMO A, T
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     STX evalstackindex
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     MULR T, S
                     STS evalstack, X
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDX evalstackindex
                     LDA #100
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     COMPR T, S
                     JLT L1
                     LDA #0
                     J L2
L1                   LDA #1
L2                   STCH evalstack, X
                     STX evalstackindex
L3                   
                     LDA evalstackindex
                     SUB #1
                     RMO A, X
                     LDCH evalstack, X
                     CLEAR S
                     COMPR A, S
                     JEQ L4
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     RMO A, T
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     RMO A, T
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     J L3
L4                   STX evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDX evalstackindex
                     LDA #100
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     COMPR T, S
                     JEQ L5
                     LDA #0
                     J L6
L5                   LDA #1
L6                   STCH evalstack, X
                     STX evalstackindex
                     LDA evalstackindex
                     SUB #1
                     RMO A, X
                     LDCH evalstack, X
                     STX evalstackindex
                     CLEAR S
                     COMPR A, S
                     JEQ L7
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     RMO A, T
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     STX evalstackindex
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     ADDR T, S
                     STS evalstack, X
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     STX evalstackindex
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     ADDR T, S
                     STS evalstack, X
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
                     J L8
L7                   
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     RMO A, T
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #15
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX evalstackindex
                     STA evalstack, X
                     LDA evalstackindex
                     ADD #3
                     STA evalstackindex
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     STX evalstackindex
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     SUBR T, S
                     STS evalstack, X
                     LDA evalstackindex
                     SUB #3
                     RMO A, X
                     LDT evalstack, X
                     RMO X, A
                     STX evalstackindex
                     SUB #3
                     RMO A, X
                     LDS evalstack, X
                     SUBR T, S
                     STS evalstack, X
                     LDA evalstackindex
                     SUB #3
                     STA evalstackindex
                     RMO A, X
                     LDA evalstack, X
                     RMO T, X
                     STCH stack, X
L8                   
                     STA temp
endprogram           END test1
stack                RESB 10000
stackindex           WORD 0
evalstack            RESB 1000
evalstackindex       WORD 0
framestart           WORD 0
stackmax             WORD 10000
display              RESB 100
displayindex         WORD 0
displaymax           WORD 100
returnvalue          RESB 500
returnmax            WORD 500
temp                 WORD 0
