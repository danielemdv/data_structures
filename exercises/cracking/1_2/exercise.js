//Check permutation: given two strings, write a method to decide if one is a permutation of the other

/*
A Permutation of a string is another string that contains same characters, 
only the order of characters can be different. 
For example, “abcd” and “dabc” are permutations of each other. 
*/

function main() {

    const tests =  [
        ["abcd", "dabc"], // true
        ["abcd", "efgh"], // false
        ["goynds", "moynds"], // false
        ["oooga", "booga"], // false
        ["bob", "bob"], // true
        ["aab", "aba"], // true
        ["longer", "short"], // false
        ["ass", "asg"], // false!!!!
        ["gas", "sag"] // true
    ];

    for (let i = 0; i < tests.length; i++) {

        let test = tests[i];

        console.log(method(test[0], test[1]));

    }

}

function method(str1, str2) {

    //permutations have to be the same length, so we're first going to check that; if false then return false
    if (str1.length === str2.length) {

        //init two maps, one for each string
        let m = new Map();
        let n = new Map();

        //iterate through given strings to build each map out
        for (let i = 0; i < str1.length; i++) {

            if (m.has(str1[i])) {

                let add = m.get(str1[i]) + 1;

                m.set(str1[i], add);

            } else {

                m.set(str1[i], 1);

            }

            if (n.has(str2[i])) {

                let add = n.get(str2[i]) + 1;

                n.set(str2[i], add);

            } else {

                n.set(str2[i], 1);

            }

        }

        //then iterate through first map and compare with values from second map 
        for (let [key,value] of m) {

            // if this condition is not met for any of the iterations, then immediately return false
            if (!(n.has(key) && (n.get(key) === value))) {

                return false;

            }
        }

        // if for loop ran successfully without returning false, then return true
        return true;

    } else {

        return false;

    }

}

main();