import math

number_of_waters = int(input())

tank_capacity = 255

current_capacities = 0

for n in range(number_of_waters):
    quantity_of_water = int(input())
    if quantity_of_water > tank_capacity:
        print("Insufficient capacity!")
    else:
        tank_capacity -= quantity_of_water
        current_capacities += quantity_of_water

print(current_capacities)
