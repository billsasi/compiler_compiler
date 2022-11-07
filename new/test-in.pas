Program MergeTwoArrays(output);
type
    int_arr = array[0..19] of integer;
    merged_arr = array[0..39] of integer;
    ia = array[integer] of integer;
var 
    arr1: int_arr;
    arr2: int_arr;
    arr3: merged_arr; 
    arr1_size, arr2_size, arr3_size: integer;
    
procedure Print(var arr: ia; len: integer);
var
    i: integer;
begin
    for i:=0 to len-1 do
    begin
        write(arr[i]);
        write(' ');
    end;
    writeln();
end;

function Merge(var arr1, arr2: int_arr; var arr3: merged_arr; const size1, size2: integer): integer;
var
    i1, i2, i3: integer;
begin
    i1 := 0;
    i2 := 0;
    i3 := 0;
    while ((i1 < size1) and (i2 < size2)) do
    begin
        if (arr1[i1] < arr2[i2]) then
        begin
            arr3[i3] := arr1[i1];
            i1 := i1 + 1;
        end
        else
        begin
            arr3[i3] := arr2[i2];
            i2 := i2 + 1;
        end;
        i3 := i3 + 1;
    end;
    
    while (i1 < size1) do
    begin
        arr3[i3] := arr1[i1];
        i3 := i3 + 1;
        i1 := i1 + 1;
    end;
    
    while (i2 < size2) do
    begin
        arr3[i3] := arr2[i2];
        i3 := i3 + 1;
        i2 := i2 + 1;
    end;
    Merge := i3;
end;

function write_arr(var arr: int_arr): integer;
var
    temp, i: integer;
    t: char;
begin
    i:= 0;
    while (not eoln()) do
    begin
        read(arr[i]);
        i := i + 1;
        temp := i;
    end;
    read(t);
    write_arr := temp;
end;

begin
    writeln('Enter first array');
    arr1_size := write_arr(arr1); 
    print(arr1, arr1_size); 
    
    writeln('Enter second array');
    arr2_size := write_arr(arr2);
    print(arr2, arr2_size);
    
    writeln('Merging');
    Merge(arr1, arr2, arr3, arr1_size, arr2_size);
    arr3_size := arr1_size + arr2_size;
    
    
    print(arr3, arr3_size);
end.