lines = int(input())

total_sum = 0
for char in range(lines):
    char = input()
    value = ord(char)
    total_sum += value
print(f"The sum equals: {total_sum}")
