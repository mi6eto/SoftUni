activation_key = input()

command = input()
new_key = activation_key
while not command == "Generate":
    command = command.split(">>>")
    name = command[0]
    substring = command[1]
    if name == "Contains":
        if substring in new_key:
            print(f"{activation_key} contains {substring}")
        else:
            print("Substring not found!")
    elif name == "Flip":
        index_1 = int(command[2])
        index_2 = int(command[3])
        if substring == "Upper":
            new_key = new_key[:index_1] + new_key[index_1:index_2].upper() + new_key[index_2:]

            print(new_key)
        elif substring == "Lower":
            new_key = new_key[:index_1] + new_key[index_1:index_2].lower() + new_key[index_2:]
            print(new_key)
    elif name == "Slice":
        index_1 = int(command[1])
        index_2 = int(command[2])
        new_key = new_key[:index_1] + new_key[index_2:]
        print(new_key)

    command = input()

print(f"Your activation key is: {new_key}")
