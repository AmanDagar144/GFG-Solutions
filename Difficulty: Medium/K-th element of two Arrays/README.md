<h2><a href="https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1">K-th element of two Arrays</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two sorted arrays <strong style="user-select: auto;">a[] </strong>and <strong style="user-select: auto;">b[]</strong> and an element <strong style="user-select: auto;">k</strong>, the task is to find the element that would be at the <strong style="user-select: auto;">k<sup style="user-select: auto;">th</sup></strong> position of the combined sorted array.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Examples :</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
<strong style="user-select: auto;">Output: </strong>6
<strong style="user-select: auto;">Explanation: </strong>The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
</span></pre>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
<strong style="user-select: auto;">Output: </strong>256
<strong style="user-select: auto;">Explanation: </strong>Combined sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element of this array is 256.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></p>
<ul style="user-select: auto;">
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= a.size(), b.size() &lt;= 10<sup style="user-select: auto;">6</sup></span></li>
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= k &lt;= a.size() + b.size()</span></li>
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 &lt;= a[i], b[i] &lt; 10<sup style="user-select: auto;">8</sup><br style="user-select: auto;"></span></li>
</ul></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Divide and Conquer</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;<code>Binary Search</code>&nbsp;