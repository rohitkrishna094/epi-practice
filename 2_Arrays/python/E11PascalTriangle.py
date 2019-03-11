def pascal(n):
    res = []
    for i in range(0, n):
        num = 1
        res.append([])
        for j in range(0, i + 1):
            res[i].append(num)
            num = (num * (i - j)) // (j + 1)
    return res


n = 6
out = pascal(n)
print(out)
