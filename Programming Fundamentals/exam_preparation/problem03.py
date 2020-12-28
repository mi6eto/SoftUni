command = input()

users = {}
users_count = 0
while not command == "Statistics":
    tokens = command.split("->")
    command = tokens[0]
    name = tokens[1]

    if command == "Add":
        if name not in users:
            users[name] = []
            users_count += 1
        else:
            print(f"{name} is already registered")
    elif command == "Send":
        email = tokens[2]
        if email not in users:
            users[name].append(email)
    elif command == "Delete":
        if name in users:
            del users[name]
            users_count -= 1
        else:
           print(f"{name} not found!")

    command = input()

print(f"Users count: {users_count}")
sorted_users = sorted(users.items(), key=lambda x: (-(len(x[1])), x[0]))
for key, value in sorted_users:
    print(f"{key}")
    for em in value:
        print(f" - {em}")

