number = int(input())

number_in_ascii = ord('a')
for first_number_in_ascii in range(number_in_ascii, number_in_ascii + number):
    for second_number_in_ascii in range(number_in_ascii, number_in_ascii + number):
        for third_number_in_ascii in range(number_in_ascii, number_in_ascii + number):
            print(f"{chr(first_number_in_ascii)}{chr(second_number_in_ascii)}{chr(third_number_in_ascii)}")
