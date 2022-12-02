PROGRAM hey;

VAR

  a, b, c: integer;


BEGIN
  a := 1;
  b := 1;
  
  c := a + b;

END {Test}. 

(*
PROGRAM Test;

CONST
    EPSILON = 0.0000001;
    factor = 'a';

TYPE
    arr1 = ARRAY [1..10] OF integer;
    arr2 = ARRAY [0..3, 0..1] OF integer;
    arr3 = ARRAY [0..1] OF array [0..2] of real;

VAR i, j, k, n : integer;

PROCEDURE p(j : real);
  VAR k : char;

  FUNCTION f(x : real) : real;
    VAR i:real;

    BEGIN {f}
      f := i + j + n + x;
    END {f};

  BEGIN {p}
    k := 5;
  END {p};

BEGIN {test}
  p(j + k + n);
END {test}.
*)