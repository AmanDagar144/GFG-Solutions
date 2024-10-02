<h2><a href="https://www.geeksforgeeks.org/problems/data-types-java/1?page=1&category=Java&sortBy=submissions">Data Types - Java</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: text;"><p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Working with Data Types is very important in the programming world. Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: <strong style="user-select: text;">a (int)</strong>, <strong style="user-select: text;">b (float)</strong>, <strong style="user-select: text;">c (double)</strong>, <strong style="user-select: text;">l (long)</strong><strong style="user-select: text;">, d (<a href="https://www.geeksforgeeks.org/data-types-in-java/" style="user-select: text;">byte</a>)</strong>. Your task is to do step-wise operations as given below:<br style="user-select: text;"><strong style="user-select: text;">1.</strong> Divide <strong style="user-select: text;">c</strong> <strong style="user-select: text;">by b</strong>.<br style="user-select: text;"><strong style="user-select: text;">2.</strong> Divide <strong style="user-select: text;">b</strong> <strong style="user-select: text;">by a</strong>.<br style="user-select: text;"><strong style="user-select: text;">3.</strong> Divide <strong style="user-select: text;">c</strong> <strong style="user-select: text;">by a</strong>.<br style="user-select: text;"><strong style="user-select: text;">4.</strong> Add the result at step 3 with <strong style="user-select: text;">l</strong>.<br style="user-select: text;"><strong style="user-select: text;">5.</strong> Divide <strong style="user-select: text;">a</strong> <strong style="user-select: text;">by d</strong>.</span></p>
<p style="user-select: text;"><strong style="user-select: text;"><span style="font-size: 18px; user-select: text;">Example 1:</span></strong></p>
<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input:</strong>
1 2 3 5 127</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Output:</strong></span>
<span style="font-size: 18px; user-select: text;">1.5 2.0 3.0 8.0 0</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Exaplanation:</strong></span>
<span style="font-size: 18px; user-select: text;">a=1, b=2, c=3, l=5, d=127
c/b=1.5
b/a=2.0
c/a=3.0
(c/a)+l=8.0
a/d=0</span></pre>
<p style="user-select: text;"><strong style="user-select: text;"><span style="font-size: 18px; user-select: text;">Example 2:</span></strong></p>
<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input:</strong>
2 4 8 16 32</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Output:
</strong>2.0 2.0 4.0 20.0 0</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Exaplanation:</strong></span>
<span style="font-size: 18px; user-select: text;">a=2, b=4, c=8, l=16, d=32
c/b=2.0
b/a=2.0
c/a=4.0
(c/a)+l=2.0
a/d=0</span></pre>
<p style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">User Task: </strong><br style="user-select: text;">Your task is to complete the provided function <strong style="user-select: text;">dataTypes()</strong> following the above-given steps.</span></p>
<p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Expected Time Complexity: O(1).<br style="user-select: text;"></span><span style="font-size: 18px; user-select: text;">Expected Auxiliary Space: O(1).</span></p>
<p style="user-select: text;">&nbsp;</p>
<p style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Constraints:</strong><br style="user-select: text;">1 &lt;= a, b, c &lt;= 10<sup style="user-select: text;">6</sup></span><br style="user-select: text;"><span style="font-size: 18px; user-select: text;">1 &lt;= d &lt;= 127<br style="user-select: text;">1 &lt;= l &lt;= 10<sup style="user-select: text;">18</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;