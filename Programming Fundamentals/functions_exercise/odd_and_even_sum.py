def odd_and_even_sum(number):
    odd_num = 0
    even_num = 0

    for num in range(number):
        if num % 2 == 0:
            even_num += num
        else:
            odd_num += num
    return odd_num and even_num

number = int(input())
print(odd_and_even_sum(number))
