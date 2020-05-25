//Check permutation: given two strings, write a method to decide if one is a permutation of the other

/*
A Permutation of a string is another string that contains same characters, 
only the order of characters can be different. 
For example, “abcd” and “dabc” are permutations of each other. 
*/

function main() {

    const tests =  [
        ["abcd", "dabc", true], // true
        ["abcd", "efgh", false], // false
        ["goynds", "moynds", false], // false
        ["oooga", "booga", false], // false
        ["bob", "bob", true], // true
        ["aab", "aba", true], // true
        ["longer", "short", false], // false
        ["ass", "asg", false], // false!!!!
        ["gas", "sag", true] // true
    ];

    for (let i = 0; i < tests.length; i++) {

        let test = tests[i];

        console.log(method(test[0], test[1]) == test[2]);

    }

}

function method(str1, str2) {

    // I think the logic is a little clearer if we immediately return false when
    // the lengths don't match.

    if(str1.length !== str2.length){
        return false;
    }

    // Now that we've got that out of the way we assume that the strings have the same length.

    const map = new Map(); // const as good practice since we won't change this variable to reference another map.

    // first for loop builds the map for string 1/
    for(let i = 0; i < str1.length; i++){

        if(!map.has(str1[i])){
            map.set(str1[i], 1);
        }else{
            map.set(str1[i], map.get(str1[i]) + 1); // note 1: unrelated to this particular problem. See end of code for the full note.
        }

    }

    // second for loop checks the map we built against the second string.
    // We know that if we find a character that is not present in the map, it cannot be a palindrome.
    // We also know that it cannot have different character counts, so we can decrease the counts until they're zero.
    for(let i = 0; i < str1.length; i++){

        if(!map.has(str2[i])){
            return false;
        }else{
            map.set(str2[i], map.get(str2[i]) - 1);
        }

    }

    // If any of the values in the map is not zero, we have different character counts.
    for(let v of map.values()){
        if(v !== 0){
            return false;
        }
    }


    // return true if all the checks passed.
    return true;

}


main();


/* Note 1: This is one of those situations in javascript where we are getting a value from a map and adding 1
   because we are assuming that we will be getting a number from that map. In JS, there is no guarantee that that
   is the type of value we will be getting, therefore adding 1 might not have the behavior we would be expecting to occur.
   For example, if for some reason we do map.get(x) and that returns a string, when we do a '+ 1' to it we would really be appending
   1 to the string instead of adding 1 to a number variable. 
   
   In this case this is a trivial script so we know we are in control of the map, otherwise we would have to be checking the type of the
   variable we get from the map every time. You can see that this would quickly become very impractical in larger projects. 
   This is where statically typed languages become very valuable.
   
   Of course, having flexible languages like js or python is not bad or wrong (large projects can be built with them).
   A great use for these languages is rapid concept or prototype development.
   Having said this, it's not like everyone wants or needs to build large projects, but it's great to know about other options and
   why there is so much variety.*/