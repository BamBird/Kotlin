fun main(args: Array<String>){

    var a =3
    var b =1
    for (i in 1..4){
        for (k in 1..a){
            print(" ")
        }
        for (j in 1..b ){
            print("*")
        }
        println("")
        a -= 1
        b += 2
    }
    for ( l in 1..3)
        println("   *")
//   *
//  ***
// *****
//*******
//   *
//   *
//   *

}
