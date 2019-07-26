Datatype Concept in Java:-
.................................................................................................

it is used to reperesent pattern of data and memory size and memory type of data for memory allocation.

Datatype will be used to declare variable,constant ,method and reference.

Type of data type :-

1 According to pattern of data:-

1.1 Primitive Datatype:-

      int   --------------------------4byte
      char ------------------------- 2byte
      float -------------------------8byte
      double------------------------16byte
      boolean-----------------------> 1bit (1,0)
      byte ---------------------------> 1byte

1.2 Dereived Data type:-
      String ----------------------> depend on num of chars
      Object
      Wrapper Class(Integer,Float,Double)
      Enum
      Collection Objects     
      DateTime
      StringBuffer
      StringBuilder


2 According to memory allocation:-

  2.1  value type:- 
 it will directly store the data into memory.it will store data in stack memory.
all primitive type by default store data under stack memory .
it will allocate memory at compile time and store data directly hence it is also called direct memory allocation.
int a=10;

2.2 reference type:-

it will indirectly store the data into memory ,first we provide address after that data will be stored.
it will store data in heap memory.
all dereived datatype store data under heap memory .it will allocate memory at runtime.

String s = new String("hello");

new keyword is used to create heap memory and s is the reference .

when we convert int type to object type than it is called boxing.

when we convert object type to int type than it is caled unboxing.

when we convert int to Integer than it is called autoboxing.




