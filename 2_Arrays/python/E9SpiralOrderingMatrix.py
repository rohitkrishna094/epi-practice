import math


def spiralValues(arr):
    n = len(arr)
    res = []
    for k in range(0, math.ceil(n/2)):
        if (k == n-k-1):
            res.append(arr[k][k])

        # top
        for i in range(k, n-k-1):
            res.append(arr[k][i])

        # right
        for i in range(k, n-k-1):
            res.append(arr[i][n-k-1])

        # bottom
        for i in range(n-k-1, k, -1):
            res.append(arr[n-k-1][i])

        # left
        for i in range(n-k-1, k, -1):
            res.append(arr[i][k])

    return res


# inputs
# even
a = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
# odd
b = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20], [21, 22, 23, 24, 25]]

res1 = spiralValues(a)
res2 = spiralValues(b)
print(res1)
print(res2)
