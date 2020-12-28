def odd_even_sum_fun(number):
    new_list = []
    for num in number:
        new_list.append(num)
    new_list_int = list(map(int, new_list))

    even = []
    odd = []
    for num in new_list_int:
        if num % 2 == 0:
            even.append(num)
        else:
            odd.append(num)
    odd_even_sum = (f"Odd sum = {sum(odd)}, Even sum = {sum(even)}")
    return odd_even_sum


number = input()
print(odd_even_sum_fun(number))
