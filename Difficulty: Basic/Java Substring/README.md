<h2><a href="https://www.geeksforgeeks.org/problems/java-substring5058/1?page=2&category=Java&sortBy=submissions">Java Substring</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: text;"><p style="user-select: text;"><span style="font-size: 18px; user-select: text;">Given a string <strong style="user-select: text;">S</strong> and two integers <strong style="user-select: text;">L</strong> and <strong style="user-select: text;">R</strong>. Print the characters in the range <strong style="user-select: text;">L</strong> to <strong style="user-select: text;">R</strong> of the string.<br style="user-select: text;">
<strong style="user-select: text;">NOTE: </strong>Assume zero based indexing<strong style="user-select: text;">.</strong></span><br style="user-select: text;">
<br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Example 1:</strong></span></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input</strong>: 
S = "cdbkdub</span><span style="font-size: 18px; user-select: text;">"
L = 0 , R = 5
<strong style="user-select: text;">Output:</strong>&nbsp;"cdbkdu</span><span style="font-size: 18px; user-select: text;">"&nbsp;
<strong style="user-select: text;">Explanation</strong>: Starting from index 0 ('c')
to index 5 ('u').
</span></pre>

<p style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Example 2:</strong></span></p>

<pre style="user-select: text;"><span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Input: 
</strong>S = "sdiblcsdbud</span><span style="font-size: 18px; user-select: text;">"
L = 3 , R = 7
<strong style="user-select: text;">Output:&nbsp;</strong>"blcsd"
<strong style="user-select: text;">Explanation</strong>: Starting from index 3 ('b')
to index 7 ('d').</span></pre>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: text;">
You dont need to read input or print anything. Complete the function <strong style="user-select: text;">javaSub()&nbsp;</strong>which takes S, L, R&nbsp;as input parameter and returns the sting from the range L to R.</span></p>

<p style="user-select: text;"><br style="user-select: text;">
<span style="font-size: 18px; user-select: text;"><strong style="user-select: text;">Expected Time Complexity:</strong> O(|S|)<br style="user-select: text;">
<strong style="user-select: text;">Expected Auxiliary Space:</strong> O(|S|)<br style="user-select: text;">
<br style="user-select: text;">
<strong style="user-select: text;">Constraints:</strong><br style="user-select: text;">
1&lt;= |S|&nbsp;&lt;=1000<br style="user-select: text;">
1 &lt;= L &lt;= 800<br style="user-select: text;">
1 &lt;= R &lt;= 900</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Java</code>&nbsp;<code>Data Structures</code>&nbsp;