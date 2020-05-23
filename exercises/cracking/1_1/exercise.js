/* 

Is unique

Implement an algorithm to determine if a string has all unique characters. 
+ What if you cannot use additional data structures?


*/

const noRepeat = ['a', 'b', 'c', 'd', 'e'];
const repeat = ['a', 'b', 'c', 'd', 'c'];

const repeatArray = [
    ['a', 'b', 'c', 'd', 'c'],
    ['a', 'b', 'c', 'd', 'd'],
    ['t', 'b', 'c', 'd', 't'],
    ['t', 't', 't', 't', 't'],
    [1, 2, 2, 3, 4],
    ['a', 'b', 'c', 'd', 'd','t', 'b', 'c', 'd', 't']
]

function main(){

    

    // console.log('Testing: \n' + noRepeat + '\n' + repeat + '\n=====');

    console.log("No repeat should be true: " + solution(noRepeat));

    for(let i = 0; i < repeatArray.length; i++){
        console.log("Repeat should be false: " + solution(repeatArray[i]));
    }

    //This will be our entry point

}



//This is the implementation of our solution. This is our algorithm. [without using additional data structures!]
// if it finds a repeated character, it returns false, otherwise true when all characters are unique
// O(n^2) time. O(1) memory.
function solution(arr /* Our input array */){

    //i,j = 2. Constant of two. This means it is has constant memory complexity. It doesn't depend on n.
    // (n being the length of the array we are analyzing. Number of elements.)

    // Check all of the array's indeces
    for (let i = 0; i < arr.length - 1; i++) {

        for (let j = i + 1; j < arr.length; j++) {

            //console.log(arr[i], arr[j]);

            if (arr[i] === arr[j]) {
                return false;
            }
        }
    }

    return true;
}




function mainDS(){

    console.log("No repeat should be true: " + solutionDS(noRepeat));

    for(let i = 0; i < repeatArray.length; i++){
        console.log("Repeat should be false: " + solutionDS(repeatArray[i]));
    }

}


// Solution with the use of additional data structures.
// Using a map to introduce maps. A set would have been more appropriate here, the map is overkill.
// O(n) time. O(n) memory.
function solutionDS(arr /* Our input array */){

    m = new Map(); // We will be using a map.

    for(let i = 0; i < arr.length; i++){

        if(m.has(arr[i]))
        {
            return false;
        }
        else{
            m.set(arr[i], 1);
        }

    }

    return true;
}


console.log('Running the exercises');

//main();
mainDS();