hey                  START 0
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
                     JEQ done
                     ADDR T, X
                     LDX stack, X
                     J findStackFrameloop
done                 SUBR T, X
                     RSUB
main                 LDA #9
                     LDB #1
                     JSUB initFrame
                     LDX stackindex
                     LDA #1
                     STA stack, X
                     LDA stackindex
                     ADD #3
                     STA stackindex
                     LDX stackindex
                     LDA #1
                     STA stack, X
                     LDA stackindex
                     ADD #3
                     STA stackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #9
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX stackindex
                     STA stack, X
                     LDA stackindex
                     ADD #3
                     STA stackindex
                     LDA #1
                     JSUB findStackFrame
                     ADD #12
                     CLEAR X
                     ADDR A, X
                     STB #3
                     LDA stack, X
                     LDX stackindex
                     STA stack, X
                     LDA stackindex
                     ADD #3
                     STA stackindex
                     LDA stackindex
                     SUB #3
                     RMO A, X
                     LDT stack, X
                     RMO X, A
                     STX stackindex
                     SUB #3
                     RMO A, X
                     LDS stack, X
                     ADDR T, S
                     STS stack, X
endprogram           END hey
stack                RESB 10000
stackindex           WORD 0
framestart           WORD 0
stackmax             WORD 10000
display              RESB 100
displayindex         WORD 0
displaymax           WORD 100
returnvalue          RESB 500
returnmax            WORD 500
temp                 WORD 0
