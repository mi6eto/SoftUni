electrons = int(input())

res = []
shield_index = 1

while electrons > 0:
    value = 2 * shield_index ** 2

    if electrons < value:
        res.append(electrons)
    else:
        res.append(value)
    electrons -= value
    shield_index += 1
print(res)

