arr = [0] * 26

S = input().upper()

for i in S:
    arr[ord(i) - ord("A")] += 1

if arr.count(max(arr)) > 1:
    print("?")
else:
    max_index = arr.index(max(arr))
    print(chr(max_index + ord("A")))