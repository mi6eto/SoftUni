import math

people = int(input())
capacity = int(input())

if people <= capacity:
    print("All the persons fit inside the elevator.Only one course is needed.")
courses = math.ceil(people / capacity)
print(courses)
