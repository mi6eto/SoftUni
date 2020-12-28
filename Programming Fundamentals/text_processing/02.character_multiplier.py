text = input().split()

str_1 = text[0]
str_2 = text[1]

str_1_count = []
str_2_count = []
total_sum = 0

min_lenght = min(len(str_1) , len(str_2))

for i in range(min_lenght):
    result = ord(str_1[i]) * ord(str_2[i])
    total_sum += result
biggest_str = str_1
if len(str_2) > len(str_1):
    biggest_str = str_2

for i in range(min_lenght, len(biggest_str)):
    total_sum += ord(biggest_str[i])

print(total_sum)