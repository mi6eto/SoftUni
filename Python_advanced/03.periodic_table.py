lines = int(input())

chemical = set()

while lines:
    command = input().split()
    for el in command:
        if not el in chemical:
            chemical.add(el)
    lines -= 1

for el in chemical:
    print(el)
