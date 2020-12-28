rooms = int(input())

free_chairs = 0
has_enought = True
for room in range(1, rooms + 1):
    chairs = input().split()
    chairs_count = len(chairs[0])
    number_of_people = int(chairs[1])

    if chairs_count >= number_of_people:
        free_chairs += chairs_count - number_of_people

    else:
        has_enought = False
        print(f"{number_of_people - chairs_count} more chairs needed in room {room}")

if has_enought:
    print(f"Game On, {free_chairs} free chairs left")
