stops = input()

command = input()

while not command == "Travel":
    command = command.split(":")
    country = command[0]
    index_1 = command[1]

    if country == "Add Stop":
        index_1 = int(command[1])
        string = command[2]
        stops = stops[:index_1] + string + stops[index_1:]
        print(stops)
    elif country == "Remove Stop":
        index_1 = int(command[1])
        index_2 = int(command[2])
        index_2 = index_2 + 1
        stops = stops[:index_1] + stops[index_2:]
        print(stops)
    elif country == "Switch":
        index_2 = str(command[2])
        stops = stops.replace(index_1, index_2)
        print(stops)
    command = input()
print(f"Ready for world tour! Planned stops: {stops}")
