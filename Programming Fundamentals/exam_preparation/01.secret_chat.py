message = input()

command = input()
encrypted_message = message
while not command == "Reveal":
    command = command.split(":|:")
    name = command[0]
    move = command[1]

    if name == "InsertSpace":
        move = int(command[1])
        encrypted_message = encrypted_message[:move] + " " + encrypted_message[move:]
        print(encrypted_message)
    elif name == "Reverse":
        if move in encrypted_message:
            encrypted_message = encrypted_message.replace(move, "", 1)
            move = move[::-1]
            encrypted_message = encrypted_message + move
            print(encrypted_message)
        else:
            print("error")
    elif name == "ChangeAll":
        replacement = command[2]
        if move in encrypted_message:
            encrypted_message = encrypted_message.replace(move, replacement)
            print(encrypted_message)

    command = input()

print(f"You have a new text message: {encrypted_message}")
