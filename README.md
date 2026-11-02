# Programming Fundamentals – Jobsheet 8: Loops 2 (Nested Loops)

| | |
|---|---|
| **Name** | Muhammad Putra Rahmadan |
| **Student ID** | 264107020001 |
| **Class** | TI-1I |
| **Course** | Programming Fundamentals 2026 – Politeknik Negeri Malang |
| **Repository** | `daspro-jobsheet8` |

## Repository Structure

```
daspro-jobsheet8/
├── README.md
├── Star01.java          # Experiment 1 – FOR loop review
├── StarOdd01.java       # Experiment 1, Question 3 – odd numbers modification
├── Rectangle01.java     # Experiment 2 – nested FOR (rectangle)
├── Triangle01.java      # Experiment 3 – nested WHILE (triangle + inverted triangle)
├── GroupScore01.java    # Experiment 4 – WHILE + FOR + DO-WHILE
├── Task101.java         # Assignment 1 – nested number pattern
├── Task201.java         # Assignment 2 – multiplication table
└── Task301.java         # Assignment 3 – sales recap for several stores
```

File names follow the jobsheet pattern `NameStudentNo.java`, with `StudentNo = 01` (e.g. `Task1` + `01` = `Task101.java`).

## How to Compile and Run

```bash
javac Star01.java
java Star01
```

Replace the file name for the other programs.

---

## 2.1 Experiment 1: Review of Loops 1

**File:** `Star01.java`

The program reads `n` and prints the character `*` n times side by side with a FOR loop. `print` is used inside the loop and `println()` once after it.

### Results (n = 5, 3 and 7)

```text
Enter the value of n = 5
*****
```

```text
Enter the value of n = 3
***
```

```text
Enter the value of n = 7
*******
```

| n | Number of `*` printed |
|---|---|
| 3 | 3 |
| 5 | 5 |
| 7 | 7 |

The number of stars always equals `n`.

### Questions

**1. If `i = 1` is changed to `i = 0` (condition unchanged), how many `*` are printed when n = 5?**

**6 stars.** The loop now runs for `i = 0, 1, 2, 3, 4, 5` (six values that satisfy `i <= 5`) instead of `i = 1 … 5` (five values). Starting one step earlier adds one extra iteration.

```text
Enter the value of n = 5
******
```

**2. If the condition `i <= n` is changed to `i < n`, how many times does the loop run when n = 5?**

**4 times** (`i = 1, 2, 3, 4`). With `i < n` the loop stops as soon as `i` reaches 5, because `5 < 5` is false. With `<=` the value `i = n` is still included. So `<` excludes the last value and runs one time fewer.

```text
Enter the value of n = 5
****
Loop ran 4 times
```

**3. Predict the output of the fragment when n = 9.**

```java
for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

*Prediction:* `i` starts at 2 and increases by 2: 2, 4, 6, 8 (the next value, 10, is greater than 9). The output is `2 4 6 8`. Verified by running it:

```text
Enter the value of n = 9
2 4 6 8 
```

*Modification for odd positive numbers ≤ n* (`StarOdd01.java`): start at 1 instead of 2 and keep the step of 2.

```java
for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

```text
Enter the value of n = 9
1 3 5 7 9 
```

**4. Why does `i++` → `i--` (with `i <= n`) make the loop run endlessly?**

`i` starts at 1 and the condition is `i <= n`. With `i--`, the counter moves **away** from `n`: 1, 0, −1, −2, … . For a positive `n`, every one of these values is still smaller than or equal to `n`, so the condition never becomes `false` and the loop never reaches its stopping point (it would keep printing `*` forever). Strictly speaking, an `int` would eventually overflow after about 4 billion iterations, but this is far beyond a reasonable running time. To stop such a program, press **Ctrl + C**. (This version was not run.)

---

## 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)

**File:** `Rectangle01.java`

The outer loop (`i`) repeats the process once per row. The inner loop (`j`) prints one row of `columns` characters. `println()` after the inner loop moves to the next line. The final file prints `#` (Question 5); the outputs below with `*` were produced from the original version of the program.

### Step 5 – only the inner loop (rows = 3, columns = 6)

```text
Enter the number of rows: 3
Enter the number of columns: 6
******
```

Only **one** line is printed because there is no loop for the rows yet.

### Step 8–9 – complete nested loop with `*`

```text
Enter the number of rows: 3
Enter the number of columns: 6
******
******
******
```

```text
Enter the number of rows: 4
Enter the number of columns: 2
**
**
**
**
```

```text
Enter the number of rows: 1
Enter the number of columns: 5
*****
```

Comparison: the shape is always a rectangle with `rows` lines of `columns` characters: 3 × 6 (wide), 4 × 2 (tall and narrow), and 1 × 5 (a single line).

### Final version with `#` (Question 5)

```text
Enter the number of rows: 3
Enter the number of columns: 6
######
######
######
```

### Questions

**1. Function of the variables `i` and `j`.**

`i` is the counter of the **outer loop**: it counts the rows (1 … `rows`). `j` is the counter of the **inner loop**: it counts the columns inside the current row (1 … `columns`). `j` starts again from 1 for every new row.

**2. How many times are the outer loop, inner loop and `print("*")` executed for rows = 4, columns = 7?**

| Part | Executions |
|---|---|
| Outer loop (body) | 4 times (once per row) |
| Inner loop | starts 4 times; each run iterates 7 times |
| `print("*")` | 4 × 7 = **28 times** |

**3. What if the bounds are swapped (outer = `columns`, inner = `rows`) with rows = 3, columns = 6?**

The outer loop then runs 6 times and the inner loop prints 3 characters each time, so the output becomes **6 lines of 3 characters** (6 × 3) instead of 3 lines of 6 characters. The total number of characters stays the same (18), but the rectangle is rotated: rows and columns are exchanged.

```text
Enter the number of rows: 3
Enter the number of columns: 6
***
***
***
***
***
***
```

**4. Effect of removing `System.out.println();` after the inner loop.**

Nothing moves the cursor to a new line, so all the characters are printed on **one single line** and the rectangle shape is lost (for 3 × 6 we get 18 characters in a row).

```text
Enter the number of rows: 3
Enter the number of columns: 6
******************
```

**5. Modify the program so the printed character is `#`.**

Done in `Rectangle01.java`: `System.out.print("#");` (see the final output above).

---

## 2.3 Experiment 3: Debugging a Star Triangle – Nested WHILE

**File:** `Triangle01.java` (final version)

### Step 3 – Output of the starter code

For n = 3 and n = 5 the starter code prints (the starter code has no `println`, so everything stays on one line):

```text
Enter the value of n = 3
******
```

```text
Enter the value of n = 5
***************
```

*Target:* a triangle with n lines (1, 2, … n stars per line). *Actual:* all stars on one line (6 stars for n = 3 and 15 for n = 5), with no triangle shape.

### Step 4–5 – Debug output (n = 5)

```text
Enter the value of n = 5
[i=0] [i=1] *[i=2] **[i=3] ***[i=4] ****[i=5] *****
```

- **a.** The outer loop runs **6 times** (`i = 0 … 5`). The desired number of rows is 5, so it is **not** the same: there is one extra iteration.
- **b.** When `i = 0`, **0 stars** are printed (`j < 0` is false from the start), which produces an empty row.
- **c.** All characters are on a single line because there is no `System.out.println();`, so the cursor never moves to a new line.

### Step 6 – Fixing one step at a time

**a. Add `System.out.println();` after the inner loop (before `i++`)** – result for n = 5:

```text
Enter the value of n = 5

*
**
***
****
*****
```

The shape now looks like a triangle, but the **first line is still empty** (no `*`) because `i = 0` is still processed.

**b. Change the initialization of the outer loop to `int i = 1;`** (the condition `i <= n` stays). The outer loop now runs exactly n times (`i = 1 … n`), and row `i` prints `i` stars because the inner loop `j = 0 … i-1` runs `i` times. The result matches the target output (see the final output below).

### Step 7–9 – Final program (triangle + inverted triangle), n = 5

The debug lines were deleted. The inverted triangle is a second nested WHILE using `i = n;` (without `int`, because `i` is already declared).

```text
Enter the value of n = 5
*
**
***
****
*****
*****
****
***
**
*
```

The first five lines are the triangle and the last five lines are the inverted triangle.

### Questions

**1. Mismatches in the initial output and at least two fixes.**

Mismatches: (1) all stars are printed on one line, so no triangle is formed; (2) the outer loop runs n + 1 times, so the `i = 0` iteration produces a useless empty row; (3) the number of stars per line does not form rows 1 … n.
Fixes: (1) add `System.out.println();` after the inner loop so that every row ends with a new line; (2) change the outer loop initialization from `i = 0` to `i = 1` (or change the condition to `i < n` and the inner condition to `j <= i`) so that exactly n rows are printed.

**2. Roles of `i` and `j`. Why must `j` be reset to 0 in every iteration of the outer loop?**

`i` is the row counter of the outer loop and also determines how many stars the current row must contain. `j` is the counter of the inner loop and counts the stars already printed in the current row.
`j` must be reset to 0 for each row, because after a row finishes, `j` has the value of the number of stars of that row (`j == i`). If it is not reset, the next row starts with an old `j`, so the inner condition `j < i` is true only once and just **one star** is printed per row. With `j` declared before the outer loop and never reset, the output for n = 5 is:

```text
Enter the value of n = 5
*
*
*
*
*
```

(In the program, `int j = 0;` is written inside the outer loop, so it is reset automatically in every iteration.)

**3. Changes to the outer loop to form the inverted triangle.**

| Part | Triangle | Inverted triangle |
|---|---|---|
| Initialization | `i = 1` | `i = n` |
| Condition | `i <= n` | `i >= 1` |
| Update | `i++` | `i--` |

The row with the most stars is printed first (`i = n`), and every following row has one star fewer.

---

## 2.4 Experiment 4: Case Study of Group Project Scores

**File:** `GroupScore01.java`

Structure: outer **WHILE** (groups) → middle **FOR** (graders) → inner **DO-WHILE** (repeat the input while the score is outside 0–100). The IF block in step 7 was completed with:

```java
if (averageScore > highestAverage) {
    highestAverage = averageScore;
    bestGroup = groupNo;
}
```

### Results

3 groups, 2 graders (including the invalid score 105):

```text
Enter the number of groups : 3
Enter the number of graders: 2
Group 1
  Score from Grader 1: 80
  Score from Grader 2: 90
Group 1: average score = 85.0
Group 2
  Score from Grader 1: 75
  Score from Grader 2: 105
  Score must be 0-100. Retry!
  Score from Grader 2: 85
Group 2: average score = 80.0
Group 3
  Score from Grader 1: 90
  Score from Grader 2: 96
Group 3: average score = 93.0
==============================
Best group      : 3
Highest average : 93.0
```

2 groups, 3 graders:

```text
Enter the number of groups : 2
Enter the number of graders: 3
Group 1
  Score from Grader 1: 70
  Score from Grader 2: 80
  Score from Grader 3: 90
Group 1: average score = 80.0
Group 2
  Score from Grader 1: 95
  Score from Grader 2: 85
  Score from Grader 3: 75
Group 2: average score = 85.0
==============================
Best group      : 2
Highest average : 85.0
```

Invalid input (number of groups = 0):

```text
Enter the number of groups : 0
Enter the number of graders: 3
Groups and graders must be > 0.
```

### Questions

**1. Why must `totalScore` be reset in the outer loop, but `highestAverage` must not?**

`totalScore` is the sum of the scores of **one group**. If it were not reset, the scores of the previous groups would be added to the next group, and the average would be wrong. `highestAverage` has to remember the best average of **all groups processed so far** so that each new average can be compared with it. If it were reset for each group, the earlier result would be lost and the last group would always look like the best group.

**2. For 3 groups and 2 graders (no invalid input), how many times is the body of the FOR loop executed?**

3 × 2 = **6 times** (2 per group, for 3 groups).

**3. What happens if `totalScore` is `int` and the average uses integer division?**

The result of `int / int` is an integer and the decimal part is cut off. Example: Group 1 has scores 86 and 88 (total 174), Group 2 has scores 85 and 90 (total 175).

```text
int division : G1=87 G2=87
double       : G1=87.0 G2=87.5
```

The real averages are 87.0 and 87.5, so Group 2 is the best group. With integer division both become 87, `87 > 87` is false, and Group 1 would incorrectly stay as the best group. The decimal part is also lost in the displayed average (87 instead of 87.5).

**4. Why is `highestAverage` initialized to −1 and not 0? Example of wrong input if it were 0.**

An average can be exactly 0 (when all scores are 0), and the comparison uses `>`. With an initial value of −1, any valid average (≥ 0) is greater than it, so the first group is always recorded. With an initial value of 0, a group with average 0 would never satisfy `0 > 0`.
Example: 2 groups, 1 grader, all scores 0. With initial value 0, no group is ever recorded, so the program prints `Best group : 0` (a group that does not exist). With −1, it correctly prints group 1.

**5. The three levels of loops.**

| Level | Loop | Role |
|---|---|---|
| Outer | WHILE (`groupNo <= numGroups`) | Processes the groups one by one; the counter is updated manually with `groupNo++`. |
| Middle | FOR (`j <= numGraders`) | Reads the score of each grader of the current group and adds it to `totalScore`. |
| Inner | DO-WHILE (`score < 0 \|\| score > 100`) | Validates the input: the score is requested at least once and repeated while it is outside 0–100. |

---

## 3. Assignments

### Assignment 1: Nested Number Pattern

**File:** `Task101.java`

Row `i` prints the numbers 1 … `i` (outer FOR = rows, inner FOR = numbers in the row). A counter variable `totalPrinted` is increased every time a number is printed. If n < 1, an error message is displayed.

```text
Enter the value of n = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Total numbers printed: 15
```

```text
Enter the value of n = 1
1
Total numbers printed: 1
```

### Assignment 2: Multiplication Table

**File:** `Task201.java`

Each cell is `i * j` (row × column) and is printed with `printf("%4d")`-style right alignment; the column width is at least 4 and grows automatically if the largest product needs more digits. The accumulator `total` sums all cells. If n < 3, an error message is displayed.

```text
Enter the value of n = 4
   1   2   3   4
   2   4   6   8
   3   6   9  12
   4   8  12  16
Total of all numbers: 100
```

```text
Enter the value of n = 6
   1   2   3   4   5   6
   2   4   6   8  10  12
   3   6   9  12  15  18
   4   8  12  16  20  24
   5  10  15  20  25  30
   6  12  18  24  30  36
Total of all numbers: 441
```

Check: the sum of an n × n multiplication table is (n(n+1)/2)², which gives 100 for n = 4 and 441 for n = 6.

### Assignment 3: Sales Recap for Several Stores

**File:** `Task301.java`

Structure: outer FOR (stores) → inner FOR (customers of the store) with DO-WHILE validation so that negative values are re-entered. Only ordinary variables are used: `storeItems` (accumulator per store, reset for every store), `grandTotalItems`, `mostItems` / `bestStore` (the best store; initial value −1, comparison with `>` so that the smallest store number wins a tie) and a `summary` String that collects the per-store lines so they can be printed together at the end.

Example from the jobsheet (Store 1: 3 and 2 items; Store 2: 1, 4 and 2 items):

```text
Enter the number of stores: 2
Store 1 - number of customers: 2
  Items bought by customer 1: 3
  Items bought by customer 2: 2
Store 2 - number of customers: 3
  Items bought by customer 1: 1
  Items bought by customer 2: 4
  Items bought by customer 3: 2

Store 1 - customers: 2, total items: 5
Store 2 - customers: 3, total items: 7
Total items across all stores: 12
Store with the most items: 2
```

Test with a negative input, customers with 0 items, and a tie (Store 1 and Store 3 both have 5 items, so Store 1 is chosen):

```text
Enter the number of stores: 3
Store 1 - number of customers: 1
  Items bought by customer 1: 5
Store 2 - number of customers: -1
  Must not be negative. Retry!
Store 2 - number of customers: 2
  Items bought by customer 1: 0
  Items bought by customer 2: 0
Store 3 - number of customers: 1
  Items bought by customer 1: 5

Store 1 - customers: 1, total items: 5
Store 2 - customers: 2, total items: 0
Store 3 - customers: 1, total items: 5
Total items across all stores: 10
Store with the most items: 1
```

---

## Commit and Push to GitHub

```bash
git add .
git commit -m "Add jobsheet 8 nested loops: experiments and assignments"
git push origin main
```
