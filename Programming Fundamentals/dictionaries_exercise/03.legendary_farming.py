junk = {}
key_materials = {'shards': 0, 'fragments': 0, 'motes': 0}
winner = ''
legendary_item = {'fragments': 'Valanyr', 'shards': 'Shadowmourne', 'motes': 'Dragonwrath'}

while winner == '':
    materials = input().lower().split()
    for i in range(0, len(materials), 2):
        quantity = int(materials[i])
        item = materials[i + 1]
        if item in key_materials:
            key_materials[item] += quantity
            if key_materials[item] >= 250:
                winner = item
                winner_item = legendary_item[winner]
                print(f'{winner_item} obtained!')
                key_materials[winner] -= 250
                break

        else:
            junk[item] = 0
            junk[item] += quantity



key_materials = sorted(key_materials.items(), key=lambda x: (-x[1], x[0]))
junk = sorted(junk.items())

for key, value in key_materials:
    print(f'{key}: {value}')

for key, value in junk:
    print(f'{key}: {value}')
