<h2><a href="https://www.geeksforgeeks.org/problems/bitwise-operators-java/1">Bitwise Operators - Java</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given three positive integers <strong style="user-select: auto;">a</strong>, <strong style="user-select: auto;">b</strong> and <strong style="user-select: auto;">c</strong>. Your task is to perform some bitwise operations on them as given below:<br style="user-select: auto;">
<strong style="user-select: auto;">1.</strong> d = a ^ a<br style="user-select: auto;">
<strong style="user-select: auto;">2. </strong>e = c ^ b<br style="user-select: auto;">
<strong style="user-select: auto;">3.</strong> f = a &amp; b<br style="user-select: auto;">
<strong style="user-select: auto;">4.</strong> g = c | (a ^ a)<br style="user-select: auto;">
<strong style="user-select: auto;">5.</strong>&nbsp;h&nbsp;= ~e<br style="user-select: auto;">
<strong style="user-select: auto;">Note: ^ </strong>is for xor.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<div class="problemQuestion" style="user-select: auto;">
<div class="problemQuestion" style="user-select: auto;">
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
4 8 2</span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">0
10
0
2
-11</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<div class="problemQuestion" style="user-select: auto;">
<div class="problemQuestion" style="user-select: auto;">
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
7 7 7</span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">0
0
7
7
-1</span></pre>
</div>
</div>
</div>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input&nbsp;anything. Your task is to complete the function <strong style="user-select: auto;">bitWiseOp()</strong>&nbsp;which takes <strong style="user-select: auto;">a, b, c</strong>&nbsp;as&nbsp;parameters&nbsp;and print the output for the above-mentioned <strong style="user-select: auto;">bitwise operations</strong>&nbsp;in consecutive lines.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= A, B, C &lt;= 10<sup style="user-select: auto;">6</sup></span>&nbsp;</p>
</div>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java-Operators</code>&nbsp;