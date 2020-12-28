user_name = input().split(", ")
name_count = []

for name in user_name:
    for ch in name:
        name_count.append(ch)
    if not 3 <= len(name_count) <= 16:
        name_count = []
        continue
    if not name.isalnum():
        if "-" not in name or "_" not in name:
            name_count = []

        if not name.isalnum():
            if "-" in name or "_" in name:
                print(name)
    if name.isalnum():
        print(name)
    name_count = []
