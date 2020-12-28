team = input()
souvenir = input()
souvenir_count = int(input())
souvenir_price = 0
total_price = souvenir_count * souvenir_price

if team == 'Argentina':
    if souvenir == 'flags':
        souvenir_price = 3.25
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count} {souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'caps':
        souvenir_price = 7.20
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count} {souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'posters':
        souvenir_price = 5.10
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count} {souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'stickers':
        souvenir_price = 1.25
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count} {souvenir} of {team} for {total_price:.2f} lv.')
    else:
        print('Invalid stock!')
elif team == 'Brazil':
    if souvenir == 'flags':
        souvenir_price = 4.20
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'caps':
        souvenir_price = 8.50
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'posters':
        souvenir_price = 5.35
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'stickers':
        souvenir_price = 1.20
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
elif team == 'Croatia':
    if souvenir == 'flags':
        souvenir_price = 2.75
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'caps':
        souvenir_price = 6.90
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'posters':
        souvenir_price = 4.95
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'stickers':
        souvenir_price = 1.10
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
elif team == 'Denmark':
    if souvenir == 'flags':
        souvenir_price = 3.10
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'caps':
        souvenir_price = 6.50
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'posters':
        souvenir_price = 4.80
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')
    elif souvenir == 'stickers':
        souvenir_price = 0.90
        total_price = souvenir_count * souvenir_price
        print(f'Pepi bought {souvenir_count}{souvenir} of {team} for {total_price:.2f} lv.')

else:
    print('Invalid country!')
