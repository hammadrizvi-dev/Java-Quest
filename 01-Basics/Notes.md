## 1. Variables & Data Types
- **Primitive Types:** `int` (4 bytes), `double` (8 bytes), `char` (2 bytes), `boolean` (1 bit). These store simple values directly in memory.
- **Non-Primitive Types:** `String`, `Arrays`, `Classes`. These store references (memory addresses) to the actual data.
- **Rule of Thumb:** Always use meaningful variable names (e.g., `targetLPA` instead of `x`). CamelCase is the standard naming convention in Java.

## 2. Operators & Control Flow
- **Arithmetic:** `+`, `-`, `*`, `/`, `%` (Modulo gives remainder - very useful in even/odd & digits problems).
- **Relational:** `==`, `!=`, `>`, `<`, `>=`, `<=`. (Always return `true` or `false`).
- **Logical:** `&&` (AND - both true), `||` (OR - at least one true), `!` (NOT - reverses the result).
- **Ternary Operator:** `condition ? valueIfTrue : valueIfFalse;` (Best for writing clean, one-line conditions).
- **Mentor Tip:** Never use `==` to compare Strings in Java. Always use `string1.equals(string2)`.

## 3. Loops & Pattern Printing
- **`for` loop:** Best when you know exactly how many times you want to loop.
- **`while` loop:** Best when you don't know the exact iterations, but know the stopping condition.
- **`do-while` loop:** Runs at least *once* before checking the condition.
- **Nested Loops:** The backbone of 2D arrays and pattern printing. 
  - *Outer Loop* = Controls rows (usually `i`).
  - *Inner Loop* = Controls columns/what prints on each line (usually `j`).
- **`break`:** Exits the loop entirely.
- **`continue`:** Skips the current iteration and jumps to the next one.

## 4. Input & Output (I/O)
- **Scanner Class:** User se input lene ke liye `java.util.Scanner` import karna zaroori hai.
- **Important Input Methods:**
  - `sc.nextInt()` : Integer lene ke liye.
  - `sc.nextDouble()` : Decimal value lene ke liye.
  - `sc.next()` : Sirf ek word lene ke liye (space aate hi ruk jata hai).
  - `sc.nextLine()` : Poori line (with spaces) lene ke liye.
- **Output:** `System.out.print()` output same line mein rakhta hai, aur `System.out.println()` output ke baad line change kar deta hai.
- **Mentor Tip:** DSA platforms (jaise LeetCode ya HackerRank) par input handle karna aana chahiye. Aur jab input ka kaam khatam ho jaye, toh `sc.close()` likhne ki aadat daalo, ye professional coding practice hai.

## 5. Type Casting
- **Implicit Casting (Widening):** Converting a smaller type to a larger type size automatically. (`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`)
- **Explicit Casting (Narrowing):** Converting a larger type to a smaller size manually. Example: `int myInt = (int) myDouble;` (Data loss can happen here).

