pieces = int(input())

collection = {}

for p in range(pieces):
    move = input().split("|")
    song = move[0]
    composer = move[1]
    key = move[2]

    collection[song] = {}
    collection[song]['composer'] = composer
    collection[song]['key'] = key

move = input()

while not move == "Stop":
    move = move.split("|")
    command = move[0]
    song = move[1]

    if command == "Add":
        composer = move[2]
        key = move[3]
        if song in collection:
            print(f"{song} is already in the collection!")
        else:
            collection[song] = {}
            collection[song]['composer'] = composer
            collection[song]['key'] = key
            print(f"{song} by {composer} in {key} added to the collection!")
    elif command == "Remove":
        if song in collection:
            del collection[song]
            print(f"Successfully removed {song}!")
        else:
            print(f"Invalid operation! {song} does not exist in the collection.")
    elif command == "ChangeKey":
        if song in collection:
            new_key = move[2]
            collection[song]['key'] = new_key
            print(f"Changed the key of {song} to {new_key}!")
        else:
            print(f"Invalid operation! {song} does not exist in the collection.")

    move = input()
sorted_collection = sorted(collection.items(), key=lambda x: (x[0], x[1]))

for key, value in sorted_collection:
    print(f"{key} -> Composer: {value['composer']}, Key: {value['key']}")
