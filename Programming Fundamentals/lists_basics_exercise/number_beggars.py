num_str = input().split(", ")
beggars = int(input())

numbers = []

for num in num_str:
    numbers.append(int(num))

beggars_count = []

for _ in range(beggars):
    beggars_count.append(0)

index = 0

for num in numbers:
    beggars_count[index] += num
    index += 1
    if index == beggars:
        index = 0

print(beggars_count)
