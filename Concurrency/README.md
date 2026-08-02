1195\. Fizz Buzz Multithreaded

Approach



This solution uses 4 Semaphores to synchronize four threads:



semNum controls the number() thread.

semFizz, semBuzz, and semFizzBuzz block their respective threads until signaled.



The number() thread iterates from 1 to n and decides which thread should print:



Releases semFizz for multiples of 3.

Releases semBuzz for multiples of 5.

Releases semFizzBuzz for multiples of 15.

Otherwise, prints the number directly.



After printing, the respective thread releases semNum, allowing the number() thread to continue. This guarantees the output is printed in the correct order without race conditions.



Complexity

Time: O(n)

Space: O(1)

Concepts

Semaphores

Multithreading

Thread Synchronization

