people = int(input())
wagons = [int(el) for el in input().split()]
MAX_PEOPLE_PER_WAGON = 4

for index in range(len(wagons)):
    while not wagons[index] == MAX_PEOPLE_PER_WAGON:
        if people > 0:
            wagons[index] += 1
            people -= 1
        else:
            break
all_seats = len(wagons) * MAX_PEOPLE_PER_WAGON

if people == 0 and sum(wagons) < all_seats:
    print("The lift has empty spots!")
elif people > 0 and sum(wagons) == all_seats:
    print(f"There isn't enough space! {people} people in a queue!")
print(" ".join([str(el) for el in wagons]))
