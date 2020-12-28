command = input()

cities = {}
count_city = 0
while not command == "Sail":
    count_city += 1
    tokens = command.split("||")
    city = tokens[0]
    population = int(tokens[1])
    gold = int(tokens[2])

    if city not in cities:
        cities[city] = {}
        cities[city]['population'] = population
        cities[city]['gold'] = gold
    else:
        count_city -= 1
        cities[city]['population'] += population
        cities[city]['gold'] += gold

    command = input()

command = input()

while not command == "End":

    event = command.split("=>")
    auction = event[0]
    city = event[1]

    if auction == "Plunder":
        population = int(event[2])
        gold = int(event[3])
        cities[city]['population'] -= population
        cities[city]['gold'] -= gold
        print(f"{city} plundered! {gold} gold stolen, {population} citizens killed.")
        if cities[city]['population'] <= 0:
            print(f"{city} has been wiped off the map!")
            del cities[city]
            count_city -= 1
        elif cities[city]['gold'] <= 0:
            print(f"{city} has been wiped off the map!")
            del cities[city]
            count_city -= 1

    elif auction == "Prosper":
        city = event[1]
        gold = int(event[2])
        if gold < 0:
            print(f"Gold added cannot be a negative number!")
        else:
            cities[city]['gold'] += gold
            current_gold = cities[city]['gold']
            print(f"{gold} gold added to the city treasury. {city} now has {current_gold} gold.")

    command = input()

print(f"Ahoy, Captain! There are {count_city} wealthy settlements to go to:")

sorted_cities = sorted(cities.items(), key=lambda x: (-x[1]['gold'], x[0]))
for city_name, value in sorted_cities:
    print(f"{city_name} -> Population: {value['population']} citizens, Gold: {value['gold']} kg")
