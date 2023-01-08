n, m = map(int, input().split())
row = []

for _ in range(n):
    row.append(list(map(int, input().split())))

for i in range(n):
    temp = list(map(int, input().split()))

    for j in range(m):
        row[i][j] +=  temp[j]

for i in range(n):
    for j in range(m):
        print(row[i][j], end = " ")
    print()
