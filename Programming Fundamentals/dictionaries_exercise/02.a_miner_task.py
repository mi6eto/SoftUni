resources = input()

task = {}

while resources != 'stop':
    command = int(input())
    if resources not in task:
        task[resources] = 0
    task[resources] += command

    resources = input()

for key, value in task.items():
    print(f'{key} -> {value}')
