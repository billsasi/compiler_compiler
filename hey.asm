hey                  START 0
                     LDA #9
                     LDX stackindex
                     STA stack, X
                     LDA stackindex
                     ADD #3
                     STA stackindex
                     LDA #5
                     LDX stackindex
                     STA stack, X

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
