import math

nums = list(map(int, input().split(", ")))

max_num = max(nums)
groups = math.ceil(max_num / 10)

for g in range(1, groups + 1):
    result = []
    upper = g * 10
    lower = upper - 10
    for num in nums:
        if lower < num <= upper:
            result.append(num)

    print(f"Group of {g * 10}'s: {result}")
