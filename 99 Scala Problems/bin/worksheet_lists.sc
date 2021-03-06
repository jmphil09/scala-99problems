import lists._

object worksheet_lists {

  /*Working with lists
In Scala, lists are objects of type List[A], where A can be any type. Lists are effective for many recursive algorithms, because it's easy to add elements to the head of a list, and to get the tail of the list, which is everything but the first element.
The solutions to the problems in this section will be in objects named after the problems (P01, P02, etc.). You can compile the source files with scalac and thereafter use import to bring the functions into scope. Some of the problems can be solved easily by using imported solutions to previous problems.
In many cases, there's more than one reasonable approach. The files linked here may include multiple solutions, with all but one commented out. They'll also indicate whether there's a builtin method in Scala that accomplishes the task.
*/

  /*P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
*/
  assert(last(List(0)) == 0)
  assert(last(List(0, 1, 2, 3, 4, 5)) == 5)
  assert(last(List(1, 1, 1, 1, 1, 1, 1, 1)) == 1)
  assert(last(List('a', 'b', 'c')) == 'c')
  //last(List())  java.util.NoSuchElementException: Error: Empty List

  /*P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
*/
  assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  assert(penultimate(List(1, 2)) == 1)
  assert(penultimate(List('a', 'b', 'f')) == 'b')
  //penultimate(List(1))  java.util.NoSuchElementException: Error: List contains only 1 element
  //penultimate(List())  java.util.NoSuchElementException: Error: Empty List

  /*P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*/
  assert(kth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  assert(kth(0, List(1, 1, 2, 3, 5, 8)) == 1)
  assert(kth(4, List('a', 'b', 'c', 'd', 'e')) == 'e')
  assert(kth(0, List(1, 1)) == 1)
  assert(kth(1, List(1, 1)) == 1)
  //kth(5,List(1))  java.util.NoSuchElementException: Error: Index out of bounds
  //kth(0,List())  java.util.NoSuchElementException: Error: Empty List

  /*P04 (*) Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*/
  assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  assert(length(List('a', 'a', 'l')) == 3)
  assert(length(List()) == 0)
  assert(length(List(1)) == 1)

  /*P05 (*) Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/
  assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  assert(reverse(List(1, 1)) == List(1, 1))
  assert(reverse(List('a')) == List('a'))
  assert(reverse(List('a', 'a', 'g')) == List('g', 'a', 'a'))
  //reverse(List())  java.util.NoSuchElementException: Error: Empty List

  /*P06 (*) Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
*/
  assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
  assert(isPalindrome(List(1, 1)) == true)
  assert(isPalindrome(List('a', 'b')) == false)
  assert(isPalindrome(List(1, 2, 3, 2)) == false)
  assert(isPalindrome(List('a')) == true)
  //isPalindrome(List())  java.util.NoSuchElementException: Error: Empty List

  /*P07 (**) Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
*/
  assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  assert(flatten(List(List(1), 1, List(1, List(1, 1)))) == List(1, 1, 1, 1, 1))
  assert(flatten(List()) == List())
  assert(flatten(List(List(), List(), List(List()))) == List())
  assert(flatten(List(List(1), List(), List(1, List(List(), 1)))) == List(1, 1, 1))
  assert(flatten(List(List(3))) == List(3))
  assert(flatten(List(List('a', 'b'), 'c', List('d', List('e', 'f')))) == List('a', 'b', 'c', 'd', 'e', 'f'))
  assert(flatten(List(List('a', 'b'), 7, List('d', List(1, 'f')))) == List('a', 'b', 7, 'd', 1, 'f'))

  /*P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/
  assert(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a', 'b', 'c', 'a', 'd', 'e'))
  assert(compress(List(1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 8)) == List(1, 2, 3, 4, 5, 6, 7, 8))
  assert(compress(List()) == List())
  assert(compress(List(1)) == List(1))
  assert(compress(List(1, 1)) == List(1))
  assert(compress(List(1, 2)) == List(1, 2))

  /*P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/
  assert(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e')))
  assert(pack(List()) == List(List()))
  assert(pack(List(1)) == List(List(1)))
  assert(pack(List(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)) == List(List(1), List(2, 2), List(3, 3, 3), List(4, 4, 4, 4)))
  assert(pack(List(1, 2)) == List(List(1), List(2)))

  /*P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
Example:
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/
  assert(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e')))
  assert(encode(List()) == List())
  assert(encode(List(1)) == List((1, 1)))
  assert(encode(List(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)) == List((1, 1), (2, 2), (3, 3), (4, 4)))
  assert(encode(List(1, 2)) == List((1, 1), (1, 2)))

  /*P11 (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
Example:
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*/
  assert(encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e')))
  assert(encodeModified(List()) == List())
  assert(encodeModified(List(1)) == List(1))
  assert(encodeModified(List(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)) == List(1, (2, 2), (3, 3), (4, 4)))
  assert(encodeModified(List(1, 2)) == List(1, 2))

  /*P12 (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
Example:
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
*/
  assert(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))) == List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
  assert(decode(List()) == List())
  assert(decode(List((1, 1))) == List(1))
  assert(decode(List((1, 1), (2, 2), (3, 3), (4, 4))) == List(1, 2, 2, 3, 3, 3, 4, 4, 4, 4))
  assert(decode(List((1, 1), (1, 2))) == List(1, 2))

  /*P13 (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
Example:
scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/
  assert(encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e')))
  assert(encodeDirect(List()) == List())
  assert(encodeDirect(List(1)) == List((1, 1)))
  assert(encodeDirect(List(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)) == List((1, 1), (2, 2), (3, 3), (4, 4)))
  assert(encodeDirect(List(1, 2)) == List((1, 1), (1, 2)))

  /*P14 (*) Duplicate the elements of a list.
Example:
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/
  assert(duplicate(List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd'))
  assert(duplicate(List(2)) == List(2, 2))
  assert(duplicate(List()) == List())
  assert(duplicate(List(0, 1)) == List(0, 0, 1, 1))
  assert(duplicate(List(1, 1, 1, 1, 1)) == List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1))
  assert(duplicate(List(1, 2, 1)) == List(1, 1, 2, 2, 1, 1))

  /*P15 (**) Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
*/
  assert(duplicateN(3, List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'))
  assert(duplicateN(1, List(2)) == List(2))
  assert(duplicateN(6, List()) == List())
  assert(duplicateN(3, List(0, 1)) == List(0, 0, 0, 1, 1, 1))
  assert(duplicateN(3, List(1, 1, 1, 1, 1)) == List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1))
  assert(duplicateN(2, List(1, 2, 1)) == List(1, 1, 2, 2, 1, 1))

  /*P16 (**) Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/
  assert(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  assert(drop(2, List(1, 2, 3, 4, 5, 6, 7, 8)) == List(1, 3, 5, 7))
  assert(drop(2, List()) == List())
  assert(drop(1, List(1, 2, 3, 4, 5, 6, 7, 8)) == List())
  //drop(-1, List(1,2,3,4,5,6,7,8))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P17 (*) Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/
  assert(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  assert(split(2, List(1, 2, 3, 4, 5)) == (List(1, 2), List(3, 4, 5)))
  assert(split(8, List()) == (List(), List()))
  assert(split(1, List(4, 5, 6)) == (List(4), List(5, 6)))
  assert(split(0, List(1, 2, 3)) == (List(), List(1, 2, 3)))
  //split(7,List(1,2,3))  java.util.NoSuchElementException: Error: Index out of bounds
  //split(-3,List(1,2,3))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P18 (**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
Example:
scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
*/
  assert(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
  assert(slice(1, 3, List(1, 2, 3, 4, 5)) == List(2, 3))
  assert(slice(1, 1, List(1, 2, 3, 4, 5, 6, 7)) == List())
  assert(slice(0, 0, List(1, 2, 3, 4, 5, 6, 7)) == List())
  //slice(1,0,List(1,2,3,4,5,6,7))  java.util.NoSuchElementException: Error: Index out of bounds
  //slice(-1,0,List(1,2,3,4,5,6,7))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P19 (**) Rotate a list N places to the left.
Examples:
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
*/
  assert(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  assert(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  assert(rotate(0, List(1, 2, 3, 4, 5)) == List(1, 2, 3, 4, 5))
  assert(rotate(12, List()) == List())
  //rotate(13,List(1,2))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P20 (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:
scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
*/
  assert(removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd), 'b))
  assert(removeAt(0, List('a, 'b, 'c, 'd)) == (List('b, 'c, 'd), 'a))
  assert(removeAt(3, List('a, 'b, 'c, 'd)) == (List('a, 'b, 'c), 'd))
  //removeAt(4,List(1,2))  java.util.NoSuchElementException: Error: Index out of bounds
  //removeAt(0,List())  java.util.NoSuchElementException: Error: Empty List
  //removeAt(-3,List(1,2,3,4,5))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P21 (*) Insert an element at a given position into a list.
Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*/
  assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
  assert(insertAt(4, 3, List(1, 2, 3, 5, 6, 7, 8, 9)) == List(1, 2, 3, 4, 5, 6, 7, 8, 9))
  assert(insertAt(1, 0, List(1, 2, 3, 5, 6, 7, 8, 9)) == List(1, 1, 2, 3, 5, 6, 7, 8, 9))
  assert(insertAt(Nil, 3, List(1, 2, 3, 5, 6, 7, 8, 9)) == List(1, 2, 3, List(), 5, 6, 7, 8, 9))
  assert(insertAt(2, 0, List()) == List(2))
  //insertAt(1, 6, List(1,2,3))  java.util.NoSuchElementException: Error: Index out of bounds
  //insertAt(1, -2, List(1,2,3))  java.util.NoSuchElementException: Error: Index out of bounds
  //insertAt(1, 2, List())  java.util.NoSuchElementException: Error: Index out of bounds

  /*P22 (*) Create a list containing all integers within a given range.
Example:
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
*/
  assert(range(4, 9) == List(4, 5, 6, 7, 8, 9))
  assert(range(4, 4) == List(4))
  assert(range(0, 3) == List(0, 1, 2, 3))
  assert(range(-3, 3) == List(-3, -2, -1, 0, 1, 2, 3))
  assert(range(5, 2) == List(5, 4, 3, 2))
  assert(range(2, -2) == List(2, 1, 0, -1, -2))

  /*P23 (**) Extract a given number of randomly selected elements from a list.
Example:
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
Hint: Use the solution to problem P20
*/
  //randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))  List[Symbol] = List('b, 'a, 'g)
  //randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))  List[Symbol] = List('a, 'b, 'g)
  //randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))  List[Symbol] = List('h, 'f, 'a)
  //randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))  List[Symbol] = List('c, 'h, 'b)
  //randomSelect(6, List(1,2,3,5,6,4,7,8,9))  List[Int] = List(3, 2, 1, 6, 4, 7)
  //randomSelect(12, List(1,2,3,5,6,4,7,8,9))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P24 (*) Lotto: Draw N different random numbers from the set 1..M.
Example:
scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
*/
  //lotto(6, 49)  List[Int] = List(12, 5, 29, 20, 15, 9)
  //lotto(6, 49)  List[Int] = List(6, 32, 29, 31, 21, 49)
  //lotto(1, 3)  List[Int] = List(1)
  //lotto(2, 3)  List(2, 3)
  //lotto(3, 3)  List(3, 2, 1)
  //lotto(4, 3)  java.util.NoSuchElementException: Error: Index out of bounds

  /*P25 (*) Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.
Example:
scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
*/
  //randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))  List[Symbol] = List('b, 'd, 'e, 'c, 'a, 'f)
  //randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))  List[Symbol] = List('b, 'a, 'c, 'f, 'd, 'e)
  //randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))  List[Symbol] = List('b, 'c, 'd, 'a, 'f, 'e)
  //randomPermute(List())  List[Nothing] = List()
  //randomPermute(List(-8))  List[Int] = List(-8)
  //randomPermute(List(1,2,3,4,5,6,7))  List[Int] = List(3, 7, 4, 5, 2, 1, 6)

  /*P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
Example:
scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
*/
  assert(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)) == List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), List('a, 'b, 'f), List('b, 'c, 'd), List('b, 'c, 'e), List('b, 'c, 'f), List('c, 'd, 'e), List('c, 'd, 'f), List('d, 'e, 'f)))
  assert(combinations(4, List('a, 'b, 'c, 'd, 'e, 'f)) == List(List('a, 'b, 'c, 'd), List('a, 'b, 'c, 'e), List('a, 'b, 'c, 'f), List('b, 'c, 'd, 'e), List('b, 'c, 'd, 'f), List('c, 'd, 'e, 'f)))
  assert(combinations(1, List('a, 'b, 'c, 'd, 'e, 'f)) == List(List('a), List('b), List('c), List('d), List('e), List('f)))
  //combinations(0, List('a, 'b, 'c, 'd, 'e, 'f))  java.util.NoSuchElementException: Error: Index out of bounds

  /*P27 (**) Group the elements of a set into disjoint subsets.
a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.
Example:
scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
Example:
scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...) and ((Carla, David), (Aldo, Beat), ...).
You may find more about this combinatorial problem in a good book on discrete mathematics under the term "multinomial coefficients".
*/

  //Placeholder Expression
  1 == 1                                          //> res0: Boolean(true) = true

  /*P28 (**) Sorting a list of lists according to length of sublists.
a) We suppose that a list contains elements that are lists themselves. The objective is to sort the elements of the list according to their length. E.g. short lists first, longer lists later, or vice versa.
Example:
scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
b) Again, we suppose that a list contains elements that are lists themselves. But this time the objective is to sort the elements according to their length frequency; i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed, others with a more frequent length come later.
Example:
scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths appear just once. The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2. This is the most frequent length.
*/
}