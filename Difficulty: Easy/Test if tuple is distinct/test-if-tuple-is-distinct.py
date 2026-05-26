#User function Template for python3
arr = tuple(map(int, input().split()))

a = arr
b = set(arr)
if (len(b)== len(a)):
    print(True)
else:
    print(False)