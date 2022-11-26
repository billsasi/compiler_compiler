PROGRAM Test;

VAR
  temp: integer;

BEGIN

  temp := 5;

END {Test}.

(*
PROGRAM Test;

CONST
    EPSILON = 0.0000001;
    factor = 'a';

TYPE
    arr1 = ARRAY [boolean] OF integer;
    arr2 = ARRAY [char, boolean] OF integer;
    arr3 = ARRAY [char] OF array [boolean] of real

VAR i, j, k, n : integer;

PROCEDURE p(j : real));
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
  p(j + k + n)
END {test}.
*)