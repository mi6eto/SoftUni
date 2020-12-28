command = input()

companys = {}

while not command == 'End':
    company, employee = command.split('->')
    if company not in companys:
        companys[company] = []
        if employee not in companys:
            companys[company].append(employee)
            command = input()
        continue
    else:
        if employee not in companys[company]:
            companys[company].append(employee)

    command = input()
    continue

for company, employee in sorted(companys.items()):
    print(company)
    for employee in employee:
        print(f'--{employee}')
