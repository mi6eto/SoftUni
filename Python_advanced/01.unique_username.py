lines = int(input())

unique_names = []
for line in range(lines):
    command = input()
    if not command in unique_names:
        unique_names.append(command)
    continue
for name in unique_names:
    print(name)
