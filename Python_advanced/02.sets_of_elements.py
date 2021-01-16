nums = input().split()
first = int(nums[0])
second = int(nums[1])

first_set = set()
second_set = set()

for _ in range(first):
    tokens = int(input())
    first_set.add(tokens)
for _ in range(second):
    tokens = int(input())
    second_set.add(tokens)
unique_digits = set(first_set.intersection(second_set))

for el in unique_digits:
    print(el)
