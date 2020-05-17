# Linked Lists

Linear collection of data elements.

[ [data]  [pointer] ]

e.g. [ [12]  [mem] ] -> [ [42] [mem2] ]

class Node
{
    let data: any;
    var node: Node;
}



let n1 = new Node();
n1.data = 42;

let n2 = new Node();

d2.data = 69;

n1.node = n2;

[n1] -> [n2]

### Java Array

```java

Array<Cat> catArray = new Array(10); // maximum 10 thing in array.

for(int i = 0; i < catArray.length; i++){
    catArray[0] = new Cat();
}


```