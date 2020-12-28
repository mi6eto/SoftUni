factor = int(input())
count = int(input())

multiples_count = []
current_count = 0
for _ in range(count):
    current_count += factor
    multiples_count.append(current_count)
print(multiples_count)
