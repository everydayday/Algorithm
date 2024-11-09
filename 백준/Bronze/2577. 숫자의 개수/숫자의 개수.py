A = int(input())
B = int(input())
C = int(input())

rs = A * B * C

arr = [0] * 10


while rs > 0 :
    num = rs % 10
    arr[num] += 1
    rs = rs // 10

for a in arr:
    print(a)
