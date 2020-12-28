names = input().split(', ')
command = input()
blacklisted = 0
lost = 0
while not command == "Report":
    tokens = command.split(' ')
    if tokens[0] == "Blacklist":
        name = tokens[1]
        if name in names:
            print(f"{name} was blacklisted.")
            index = names.index(name)
            names[index] = "Blacklisted"
            blacklisted += 1
        else:
            print(f"{name} was not found.")
    elif tokens[0] == "Error":
        index = int(tokens[1])
        username = names[index]
        if not username == "Blacklisted":
            if not username == "Lost":
                print(f"{username} was lost due to an error.")
                names[index] = "Lost"
                lost += 1
    elif tokens[0] == "Change":
        index = int(tokens[1])
        new_name = tokens[2]
        if 0 <= index < len(names):
            print(f"{names[index]} changed his username to {new_name}.")
            names[index] = new_name

    command = input()
print(f"Blacklisted names: {blacklisted}")
print(f"Lost names: {lost}")
print(' '.join(names))
