PROGRAM Test;

CONST
    FACTOR = 8;
    epsilon = 1.0e-6;

TYPE
    arr = array[boolean, char] of char;
    arr2 = array[char] of arr;
    
    ty_1 = integer;
    ty_2 = boolean;
    real10 = real;

VAR
    i, _var, xyz : integer;

PROCEDURE p(const j : real);
  VAR k : char;

  FUNCTION f(x : real) : real;
    VAR i:real;

    BEGIN {f}
      f := i + j + n + x;
    END {f};

  BEGIN {p}
    k := chr(i + trunc(f(n)));
  END {p};

BEGIN

  arr[45] := 1;
  
END.
(*
Program PresidentRecords(output);
Uses sysutils;
type
    President = array[integer, char, boolean] of array[char] of integer;
    pres_arr = array[char] of President;
    int_arr = array[char] of integer;

var
    arr: pres_arr;
    f: TextFile;
    i, arr_len: integer;
    years: int_arr;
    num_years: integer;
    
{ prints one pres record }
procedure print_pres(const pres: President);
begin
    write(pres.start_year);
    write(' ');
    write(pres.end_year);
    write(' ');
    write(pres.first_name + ' ' + pres.mid_initials + ' ' + pres.last_name);
    writeln;
end;

{ swap president record }
procedure swap(var a, b: President);
var
    temp: President;
begin
    temp := a;
    a := b;
    b := temp; 
end;

{ insertion sort, key is start year }
procedure sort(var arr: pres_arr; const len: integer);
var
    i, j: integer;
begin
    for i:= 0 to len-1 do
    begin
        for j:=i downto 0 do
        begin
            if (j-1 < 0) then break;
            if (arr[j].start_year < arr[j-1].start_year) then
                swap(arr[j], arr[j-1]);
        end;
    end;
end;

{ prints name of a president }
procedure get_name(const pres: President);
begin
    write(' ');
    write(pres.first_name + ' ' + pres.mid_initials + ' ' + pres.last_name);
end;

{ searches for and prints who was president in a given year }
procedure binary_search(const arr: pres_arr; const pres_len, year: integer);
var
    l, mid, r: integer;
begin
    l := 0;
    r := pres_len - 1;
    write(year);
    writeln(':');
    
    while l <= r do begin
        mid := (l + r) div 2;
        if ((arr[mid].start_year <= year) and (arr[mid].end_year >= year)) then
        begin
            if ((mid > 0) and (arr[mid-1].end_year = year)) then
                get_name(arr[mid-1]);
            get_name(arr[mid]);
            if ((mid < pres_len-1) and (arr[mid+1].start_year = year)) then
                get_name(arr[mid+1]);
            writeln;
            writeln;
            exit; {exit if found a match}
        end
        else begin
            if (arr[mid].end_year < year) then
                l := mid+1
            else
                r := mid-1;
        end;
    end;
    writeln('  no match');
    writeln;
end;
    
{ read presidents file and store data in array, then reads search years }
function read_data(var arr: pres_arr; var year_arr: int_arr; var year_len: integer; const file_name: string): integer;
var
    i, test: integer;
begin
    assign(f, file_name);
    reset(f);
    
    test := 0;
    i := 0;
    while not eof(f) do
    begin
        read(f, test);
        if (test < 0) then {when the sentinel (-1) is read, stop reading}
            break;
        arr[i].start_year := test;
        read(f, arr[i].end_year);
        read(f, arr[i].first_name);
        read(f, arr[i].mid_initials);
        read(f, arr[i].last_name);
        i := i + 1;
       
    end;
    
    {read search years}
    while not eof(f) do
    begin
        read(f, test);
        if (test < 0) then {when the sentinel (-1) is read, stop reading}
            break;
        year_arr[year_len] := test;
        year_len := year_len + 1;
    end;
    
    close(f);
    read_data := i;
end;


{ pass file path as command line arg } 
begin
    if (paramcount < 1) then begin
        writeln('Enter input file path as command line arg');
        exit;
    end;
    num_years := 0;
    {write pres data from file to array, also store the years to search into an array of years}
    arr_len := read_data(arr, years, num_years, paramStr(1));
    
    { printing the sorted list of presidents by start year }
    writeln;
    writeln('Sorted presidents by start year');
    sort(arr, arr_len);
    for i := 0 to arr_len-1 do begin
        print_pres(arr[i]);
    end;
    
    { searching years }
    writeln;
    writeln('Starting searches:');
    for i := 0 to num_years-1 do begin
        binary_search(arr, arr_len, years[i]);
    end;


end.
*)