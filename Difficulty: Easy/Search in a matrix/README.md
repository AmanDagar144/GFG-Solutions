<h2><a href="https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1">Search in a matrix</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: text;"><p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Given a matrix <strong style="user-select: text;">mat</strong>[][] of size <strong style="user-select: text;">N</strong>&nbsp;x&nbsp;<strong style="user-select: text;">M</strong>, where every row and column is sorted in increasing order, and a number <strong style="user-select: text;">X</strong> is given. The task is to find whether element <strong style="user-select: text;">X</strong> is present in the matrix or not.</span></p>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Example 1:</strong></span></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input</strong>:
N = 3, M = 3
mat[][] = 3 30 38 
         44 52 54 
         57 60 69
X = 62
<strong style="user-select: text;">Output</strong>:
0
<strong style="user-select: text;">Explanation</strong>:
62 is not present in the
matrix, so output is 0</span></pre>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Example 2:</strong></span></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input</strong>:
N = 1, M = 6
mat[][]<strong style="user-select: text;"> </strong>= 18 21 27 38 55 67
X = 55
<strong style="user-select: text;">Output</strong>:
1
<strong style="user-select: text;">Explanation</strong>:
55 is present in the
matrix at 5th cell.</span></pre>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Your Task:</strong><br style="user-select: text;">
You don't need to read input or print anything. You just have to complete the function&nbsp;matSearch()&nbsp;which takes a 2D matrix&nbsp;<strong style="user-select: text;">mat</strong>[][],&nbsp;its dimensions <strong style="user-select: text;">N</strong> and <strong style="user-select: text;">M</strong> and integer <strong style="user-select: text;">X</strong> as inputs and returns 1 if the element <strong style="user-select: text;">X</strong> is present in the matrix and 0 otherwise.</span></p>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Expected Time Complexity</strong>:&nbsp;O(N+M).<br style="user-select: text;">
<strong style="user-select: text;">Expected Auxiliary Space</strong>:&nbsp;O(1).</span></p>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Constraints</strong>:<br style="user-select: text;">
1 &lt;= N, M &lt;= 1005<br style="user-select: text;">
1 &lt;= mat[][] &lt;= 10000000<br style="user-select: text;">
1&lt;= X &lt;= 10000000</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Snapdeal</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Ola Cabs</code>&nbsp;<code>Oracle</code>&nbsp;<code>Visa</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Directi</code>&nbsp;<code>Adobe</code>&nbsp;<code>SAP Labs</code>&nbsp;<code>Groupon</code>&nbsp;<code>InMobi</code>&nbsp;<code>One97</code>&nbsp;<code>Polycom</code>&nbsp;<code>TinyOwl</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Searching</code>&nbsp;<code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;