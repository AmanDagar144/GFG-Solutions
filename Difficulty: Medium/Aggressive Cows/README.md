<h2><a href="https://www.geeksforgeeks.org/problems/aggressive-cows/1">Aggressive Cows</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">You are given an array with unique elements of stalls[],<strong style="user-select: auto;"> </strong>which denote the position of a <strong style="user-select: auto;">stall</strong>. You are also given an integer <strong style="user-select: auto;">k</strong> which denotes the number of aggressive cows. Your task is to assign <strong style="user-select: auto;">stalls </strong>to<strong style="user-select: auto;"> k </strong>cows such that the <strong style="user-select: auto;">minimum distance </strong>between any two of them is the<strong style="user-select: auto;"> maximum </strong>possible.</span></p>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Examples :</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>stalls[] = [1, 2, 4, 8, 9], k = 3
<strong style="user-select: auto;">Output: </strong>3
<strong style="user-select: auto;">Explanation: </strong>The first cow can be placed at stalls[0], <br style="user-select: auto;">the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
</span></pre>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>stalls[] = [10, 1, 2, 7, 5], k = 3
<strong style="user-select: auto;">Output: </strong>4
<strong style="user-select: auto;">Explanation: </strong>The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.</span></pre>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input: </strong>stalls[] = [2, 12, 11, 3, 26, 7], k = 5
<strong style="user-select: auto;">Output: </strong>1
<strong style="user-select: auto;">Explanation: </strong>Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.</span></pre>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">2 &lt;= stalls.size() &lt;= 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;"></span><span style="font-size: 18.6667px; user-select: auto;">0 &lt;= stalls[i] &lt;= 10<sup style="user-select: auto;">8</sup></span><br style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">2 &lt;= k &lt;= </span><span style="font-size: 18.6667px; user-select: auto;">stalls.size()</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search</code>&nbsp;<code>Algorithms</code>&nbsp;