import arithmetic._
import arithmetic.S99Int._

object worksheet_arithmetic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(214); 

  /*
P31 (**) Determine whether a given integer number is prime.
scala> 7.isPrime
res0: Boolean = true
*/
  assert(2.isPrime == true);$skip(30); 
  assert(10.isPrime == false);$skip(29); 
  assert(1.isPrime == false);$skip(29); 
  assert(0.isPrime == false);$skip(30); 
  assert(-7.isPrime == false);$skip(28); 
  assert(3.isPrime == true);$skip(38); 
  assert(1121392387.isPrime == false);$skip(29); 
  assert(4.isPrime == false);$skip(40); 
  assert(new S99Int(5).isPrime == true);$skip(171); 
  /*
P32 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.
scala> gcd(36, 63)
res0: Int = 9
*/
  assert(gcd(5, 10) == 5);$skip(26); 
  assert(gcd(2, 46) == 2);$skip(25); 
  assert(gcd(5, 3) == 1);$skip(28); 
  assert(gcd(12, 12) == 12);$skip(27); 
  assert(gcd(87, 88) == 1);$skip(25); 
  assert(gcd(1, 3) == 1);$skip(227); 
  /*
P33 (*) Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1.
scala> 35.isCoprimeTo(64)
res0: Boolean = true
*/
  assert(35.isCoprimeTo(64) == true);$skip(37); 
  assert(5.isCoprimeTo(10) == false);$skip(37); 
  assert(2.isCoprimeTo(46) == false);$skip(35); 
  assert(5.isCoprimeTo(3) == true);$skip(38); 
  assert(12.isCoprimeTo(12) == false);$skip(37); 
  assert(87.isCoprimeTo(88) == true);$skip(35); 
  assert(1.isCoprimeTo(3) == true);$skip(245); 
  /*
P34 (**) Calculate Euler's totient function phi(m).
Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
scala> 10.totient
res0: Int = 4
*/
  assert(10.totient == 4);$skip(28); 
  assert(190.totient == 72);$skip(137); 
  //assert(-4.totient == 2) Note: This case may not be defined, but gives 2 as a result on wolframalpha.com
  assert(729.totient == 486);$skip(25); 
  assert(0.totient == 0);$skip(29); 
  assert(555.totient == 288);$skip(251); 
  /*
P35 (**) Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order.
scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)
*/
  assert(315.primeFactors == List(3, 3, 5, 7));$skip(41); 
  assert(33.primeFactors == List(3, 11));$skip(36); 
  assert(2.primeFactors == List(2));$skip(36); 
  assert(3.primeFactors == List(3));$skip(39); 
  assert(4.primeFactors == List(2, 2));$skip(53); 
  assert(729.primeFactors == List(3, 3, 3, 3, 3, 3));$skip(427); 
  /*
P36 (**) Determine the prime factors of a given positive integer (2).
Construct a list containing the prime factors and their multiplicity.
scala> 315.primeFactorMultiplicity
res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
Alternately, use a Map for the result.
scala> 315.primeFactorMultiplicity
res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
*/
  assert(315.primeFactorMultiplicity == List((3, 2), (5, 1), (7, 1)));$skip(52); 
  assert(2.primeFactorMultiplicity == List((2, 1)));$skip(52); 
  assert(4.primeFactorMultiplicity == List((2, 2)));$skip(52); 
  assert(8.primeFactorMultiplicity == List((2, 3)));$skip(60); 
  assert(6.primeFactorMultiplicity == List((2, 1), (3, 1)));$skip(54); 
  assert(729.primeFactorMultiplicity == List((3, 6)));$skip(72); 
  assert(561.primeFactorMultiplicity == List((3, 1), (11, 1), (17, 1)))}
  /*
P37 (**) Calculate Euler's totient function phi(m) (improved).
See problem P34 for the definition of Euler's totient function. If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows: Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m. Then phi(m) can be calculated with the following formula:
phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ...

Note that ab stands for the bth power of a.

P38 (*) Compare the two methods of calculating Euler's totient function.
Use the solutions of problems P34 and P37 to compare the algorithms. Try to calculate phi(10090) as an example.

P39 (*) A list of prime numbers.
Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
scala> listPrimesinRange(7 to 31)
res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
P40 (**) Goldbach's conjecture.
Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). Write a function to find the two prime numbers that sum up to a given even integer.
scala> 28.goldbach
res0: (Int, Int) = (5,23)
P41 (**) A list of Goldbach compositions.
Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
scala> printGoldbachList(9 to 20)
10 = 3 + 7
12 = 5 + 7
14 = 3 + 11
16 = 3 + 13
18 = 5 + 13
20 = 3 + 17
In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50. Try to find out how many such cases there are in the range 2..3000.

Example (minimum value of 50 for the primes):

scala> printGoldbachListLimited(1 to 2000, 50)
992 = 73 + 919
1382 = 61 + 1321
1856 = 67 + 1789
1928 = 61 + 1867
The file containing the full class for this section is arithmetic.scala.
*/

}