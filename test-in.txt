PROGRAM test1;

VAR

  a, b, c: integer;


BEGIN
  a := 1;
  b := 1;
  
  c := a * b;

  while c < 100 do
  begin
    a := b;
    b := c;
  end;

  if c = 100 then
    a := b + c + a
  else
    a := b - c - a;


END {Test}. 
