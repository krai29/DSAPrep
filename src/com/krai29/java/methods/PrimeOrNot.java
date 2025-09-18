package com.krai29.java.methods;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Is "+n+" a prime? "+checkPrime(n));
    }

    static boolean checkPrime(int n){
        if (n<=1) return false;
        if (n<=3) return true;
        if (n%2 == 0 || n % 3 == 0) return false;
        for (int c = 5;c*c<=n;c+=6){
            if (n % c == 0 || n % (c + 2) == 0)
                return false;
        }
        return true;
    }
}

/*
Efficient solution:
======================
What is a prime?
A prime number is only divisible by 1 and itself.

Naive way (slow):
Test every number from 2 up to n-1 → very slow for big numbers.
Smarter: only test up to √n (because if n has a factor, one of them must be ≤ √n).

First quick eliminations:

If n ≤ 1 → not prime.

If n is 2 or 3 → prime.

If divisible by 2 or 3 → not prime.

Why 6k ± 1?

Any number can be written as 6k, 6k+1, 6k+2, 6k+3, 6k+4, 6k+5.

Multiples of 2 → (6k, 6k+2, 6k+4).

Multiples of 3 → (6k+3).

That leaves only 6k+1 and 6k+5 (= 6(k+1)−1) as possible primes.
👉 So all primes > 3 live in the form 6k−1 or 6k+1.

Loop idea:

Start with i = 5 (which is 6×1−1).

Check both i (6k−1) and i+2 (6k+1).

Then jump by 6 → next i = 11 (6×2−1), check 11 and 13.

Continue until i * i > n.

Result:

If no divisor found → number is prime.

If a divisor is found → number is not prime.

⚡ Why is this efficient?

You don’t test all numbers up to √n.

You skip even numbers and multiples of 3.

In one loop iteration, you check two candidates (6k−1 and 6k+1).

This cuts down the work by more than half compared to the “check all odds” method.

 */
