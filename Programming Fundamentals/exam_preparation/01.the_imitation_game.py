encrypted_message = input()

command = input()

while not command == "Decode":
    command = command.split("|")
    name = command[0]
    index = command[1]

    if name == "Move":
        index = int(command[1])
        encrypted_message = encrypted_message[index:] + encrypted_message[:index]
    elif name == "Insert":
        index = int(command[1])
        add_chr = command[2]
        encrypted_message = encrypted_message[:index] + add_chr + encrypted_message[index:]
    elif name == "ChangeAll":
        if index in encrypted_message:
            add_chr = command[2]
            encrypted_message = encrypted_message.replace(index, add_chr)
    command = input()

print(f"The decrypted message is: {encrypted_message}")