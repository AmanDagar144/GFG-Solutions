<h2><a href="https://www.geeksforgeeks.org/problems/logical-operators-java/1">logical Operators - Java</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: text;"><p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Logical operators are used when we want to check the truth value of certain statements. Logical operators help us in checking multiple statements together for their truthness.</span></p>

<p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Here we will learn logical operators like <strong style="user-select: text;">AND(&amp;&amp;), OR(||), NOT(!)</strong>. These operators produce either a true or a false as an output.</span></p>

<p style="user-select: text;"><strong style="user-select: text;"><span style="font-size: 18px; user-select: text;">Example 1:</span></strong></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input:</strong>
true false</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Output:</strong></span>
<span style="font-size: 18px; user-select: text;">false true false</span>
<strong style="user-select: text;"><span style="font-size: 18px; user-select: text;">Explanation:</span></strong>
<span style="font-size: 18px; user-select: text;">true&amp;&amp;false=&gt;false</span>
<span style="font-size: 18px; user-select: text;">true||false=&gt;true</span>
<span style="font-size: 18px; user-select: text;">!(true) &amp;&amp; !(false)=&gt;false</span></pre>

<p style="user-select: text;"><br style="user-select: text;">
<strong style="user-select: text;"><span style="font-size: 18px; user-select: text;">Example 2:</span></strong></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input:</strong>
true true</span>
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Output:</strong></span>
<span style="font-size: 18px; user-select: text;">true true false</span>
</pre>

<p style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Your Task:</strong><br style="user-select: text;">
Your task is to complete the function <strong style="user-select: text;">logicOp()&nbsp;</strong>which takes a and b as a parameter and prints <strong style="user-select: text;">(a AND b), (a OR b), (a NOT b)</strong> in separated by space.&nbsp;<br style="user-select: text;">
<br style="user-select: text;">
<strong style="user-select: text;">Note:-&nbsp;Don't print result with New Line, it will be handled by the driver.</strong><br style="user-select: text;">
<br style="user-select: text;">
<strong style="user-select: text;">Constraints:</strong><br style="user-select: text;">
a, b = {true, false}</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java-Operators</code>&nbsp;