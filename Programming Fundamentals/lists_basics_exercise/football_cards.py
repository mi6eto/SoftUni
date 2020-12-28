cards = input().split()

team_a = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
team_b = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

team_a_counter = 11
team_b_counter = 11
is_terminated = False

for card in cards:
    player_out = card.split("-")
    team = player_out[0]
    number = int(player_out[1])
    index = number - 1

    if team == "A":
        if team_a[index] == 0:
            continue
        team_a[index] = 0
        team_a_counter -= 1
    else:
        if team_b[index] == 0:
            continue
        team_b[index] = 0
        team_b_counter -= 1

    if team_a_counter < 7 or team_b_counter < 7:
        is_terminated = True
        break

print(f"Team A - {team_a_counter}; Team B - {team_b_counter}")

if is_terminated:
    print("Game was terminated")
