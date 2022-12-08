PROGRAM Multiply;
VAR
   a, b, c: integer;
   val: boolean;

BEGIN
   a := 2;
   b := 3;
   c := a * b;
   val := c = 6;
   IF val THEN
      c := 0
END.