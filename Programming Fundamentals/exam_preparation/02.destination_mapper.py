import re

destinations = input()

pattern = r"(=|\/)([A-Z][A-Za-z]{2,})\1"

match = re.findall(pattern, destinations)
match_destination = []
travel_points = []
for m in match:
    match_destination.append(m[1])
for point in match_destination:
    travel_points += (str(point))
print(f"Destinations:", ", ".join(match_destination))
print(f"Travel Points: {len(travel_points)}")
