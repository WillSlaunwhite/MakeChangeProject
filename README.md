# Make Change

### Overview

Much of how the code works will be explained again inside the code itself, but
I wanted to include it inside the README as well.

I used main to call three different methods, returnDiff, customerTotal, and
tenderedAmount. returnDiff is the majority of the class, with a while loop that
checks if the amount passed to it is greater than 0. it then uses if else
statements to check if we can return each denomination. if we can return that
denomination, it passes calculateAmount, which takes the current amount as a
double and the denomination as either a double or and integer, to cover both
dollar and cent denominations.

Unfortunately, I had to use DecimalFormat to round my difference to two decimal
points. I couldn't think of a clever way to fix the issues I was dealing with
in regards to the length of double decimals and trying to return a consistent
count with cent denominations. So I created an object of DecimalFormat passing the
format of two decimal points and used the method format to round at the start of the
loop and then after every cent denomination.

If you do not want me using this method, let me know and I'll come up with a
different solution.

High highs and low lows for sure on this project. At some point on Saturday afternoon,
I thought I had it all put together, but then the code started to fall apart
when testing the provided cases and I had to rework it until I got to where it's at,
which was not a short process. But the satisfaction when it ran and passed... priceless.

### How to use

It will prompt you for a total and an amount paid. It will then provide the
denominations of change up to $20 bills.


### Lessons Learned
I know there's a ton of different ways to solve this problem and I only barely
solved it one. It's interesting to consider that my classmates almost definitely
solved this a different way than me and that I can't right now consider what that
solution might be. But once I see their logic, I'll clearly be able to understand
how you would build this project that way. That's one of the things I enjoy about
coding; even though you may have solved a problem there's usually a better way to
solve it and things to learn from that. 
