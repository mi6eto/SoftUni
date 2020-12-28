def is_palindrome(nums):
    result = []
    for el in nums:
        if el == el[::-1]:
            result.append(True)
        else:
            result.append(False)
    return result



palindrome = input().split(", ")
print()

