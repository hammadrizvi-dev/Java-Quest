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

## 6. Patterns (Nested Loops)
- **Core Logic:** Outer loop hamesha rows/lines ke liye chalta hai, aur inner loop hamesha columns ya jo print karna hai uske liye chalta hai.
- **Matrix Logic:** Har pattern ek grid `(i, j)` ki tarah hota hai. Har star ya number kisi condition jaise `i == j` ya `i + j == n` par print hota hai.
- **Pro Tip:** Exam ya interview me pehle pattern ko rough copy par matrix bana kar index `(0, 1, 2)` likho. Formula aksar khud dikh jata hai.

## 7. Functions & Methods
- **DRY Principle:** "Don't Repeat Yourself". Same code baar-baar likhne ke bajay ek reusable block banate hain jise call kar sakein.
- **Syntax:** `returnType functionName(parameters) { // body }`
- **Memory Level:** Har function memory ke stack me ek naya stack frame banata hai. Jab function ka kaam khatam hota hai, toh memory clear ho jati hai.
- **Method vs Function:** Agar function kisi class ya object ke andar likha hai, jaise Java me hota hai, toh use method kehte hain.

## 8. Time & Space Complexity (DSA Basics)
- **Time Complexity:** Code kitna time lega execute hone me based on input size `N`. Isko Big-O notation me naapte hain.
- **`O(1)`:** Constant time, best case style example.
- **`O(N)`:** Linear time, jaise ek normal loop.
- **`O(N^2)`:** Quadratic time, jaise nested loops ya kuch sorting cases.
- **Space Complexity:** Code execute hone ke liye kitni extra RAM ya memory lag rahi hai.
- **Rule:** Hamesha worst case, yani sabse bekaar situation, ko measure karte hain.

## 9. Arrays & 2D Arrays
- **1D Array:** Ek hi type ke bohot saare variables ka collection. Memory me ye contiguous line me store hote hain.
- **Syntax:** `int[] marks = new int[5];`
- **Indexing:** Hamesha `0` se shuru hoti hai aur `n - 1` tak jaati hai.
- **2D Array:** Matrix ya grid ki tarah hota hai. Ye array ke andar array hota hai.
- **Syntax:** `int[][] matrix = new int[rows][cols];`
- **Memory:** Java me 2D arrays directly matrix ki tarah store nahi hote, balki arrays of arrays ke form me store hote hain.

