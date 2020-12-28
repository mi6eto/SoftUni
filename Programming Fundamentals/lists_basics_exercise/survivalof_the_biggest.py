nums_str = input().split()
count_nums_remove = int(input())

numbers = []
for num in nums_str:
    numbers.append(int(num))

for _ in range(count_nums_remove):
    value = min(numbers)
    if value:
        numbers.remove(value)
print(numbers)
