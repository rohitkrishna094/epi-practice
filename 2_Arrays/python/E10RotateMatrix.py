import math


def rotate(a):
    b = []
    n = len(a)
    for i in range(0, n):
        b.append([])
        for j in range(0, n):
            b[i].append(a[n - j - 1][i])
    return b


input = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
output = rotate(input)
print(output)
