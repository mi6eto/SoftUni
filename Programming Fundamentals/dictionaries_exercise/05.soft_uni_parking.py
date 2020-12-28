commands = int(input())
registered = {}

current_command = 0
while commands > current_command:
    comm = input().split()
    type = comm[0]
    name = comm[1]

    if type == 'register':
        number = comm[2]
        if name in registered:
            print(f'ERROR: already registered with plate number {number}')
        else:
            registered[name] = 0
            registered[name] = number
            print(f'{name} registered {number} successfully')
    if type == 'unregister':
        if name not in registered:
            print(f'ERROR: user {name} not found')
        else:
            print(f'{name} unregistered successfully')
            registered.pop(name)
    current_command += 1
for name, plate in registered.items():
    print(f'{name} => {plate}')
